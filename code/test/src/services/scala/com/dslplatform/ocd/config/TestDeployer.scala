package com.dslplatform.ocd
package config

import scalax.file._
import scala.collection.mutable.LinkedHashMap
import com.dslplatform.compiler.client.api.commons.io.IOUtils

import test.javatest.TestSuiteCreator
import test.javatest.JavaInfo

private[config] class TestDeployer(
    logger: Logger
  , testSettings: ITestSettings
  ) extends ITestDeployer {

  private val root = testSettings.workspace.path

  class TestSetup(testProject: ITestProject) {
    private val projectRoot = root / (testProject.projectPath, '/')

    private val dslPath =
      projectRoot / "dsl"

    private def languagePath(language: Language) =
      projectRoot / language.language.toLowerCase

    private def testPath(language: Language) =
      languagePath(language) / "src" / "test"

    private def testResourcePath(language: Language) =
      testPath(language) / "resources"

    private def cleanDsl(): Unit = {
      logger.debug("Cleaning generated DSL ...")
      logger.trace("Deleting: " + dslPath.path)

      val remaining = dslPath.deleteRecursively(true, true)._2
      if (remaining > 0) {
        logger.warn(s"Could not delete all generated DSL ($remaining)!")
      }
    }

    private def deployDsl(): Unit =
      testProject.dslFiles.par foreach { case (filename, body) =>
        val path = dslPath / (filename, '/')
        logger.trace("Deploying DSL: " + path.path)
        path.write(body)
      }

    private def cleanTests(): Unit = {
      val languages = testProject.testFiles.keys.toSet

      languages foreach { language =>
        logger.debug(s"Cleaning tests ($language) ...")
        val path = testPath(language)
        logger.trace("Deleting: " + path.path)

        val remaining = path.deleteRecursively(true, true)._2
        if (remaining > 0) {
          logger.warn(s"Could not delete all code for $language ($remaining)!")
        }
      }
    }

    private def deployTests(): Unit =
      testProject.testFiles foreach { case (language, files) =>
        val languageRoot = testPath(language)

        val classes = files.values.map(JavaInfo(_).classPath).toIndexedSeq.sorted
        val suite = JavaInfo(
          new TestSuiteCreator {
            def packageName = "com.dslplatform.ocd.test"
            def testName = "TestEntryPoint"
            def testClasses = classes
          } testBody
        )

        val suiteWithTests = files + suite.toEntry

        suiteWithTests.par foreach { case (filename, body) =>
          val path = languageRoot / (filename, '/')
          logger.trace("Deploying test: " + path.path)
          path.write(Patches.fixTests(body))
        }

        val resourcePath = testResourcePath(language)
        logger.trace("Creating the test resource path: " + resourcePath.path)
        resourcePath.createDirectory(true, false)
      }

    private def deployCompilerScript(): Unit =
      testProject.testFiles.keys foreach { case language =>
        val languageRoot = languagePath(language)

        language match {
          case JAVA =>
            val path = languageRoot / "compiler.bat"
            logger.trace("Creating the compiler script: " + path.path)

            val body = IOUtils.toByteArray(
              classOf[TestDeployer].getResourceAsStream("/compiler.bat"))

            path.write(body)

          case _ =>
        }
      }

    def deploy(): Unit = {
      logger.debug("Deploying {} ...", testProject.projectName)

      cleanDsl()
      cleanTests()

      deployDsl()
      deployTests()

      deployCompilerScript()
    }
  }

  def deployTests(tests: Seq[ITestProject]): Unit = {
    tests foreach(new TestSetup(_).deploy())
  }
}
