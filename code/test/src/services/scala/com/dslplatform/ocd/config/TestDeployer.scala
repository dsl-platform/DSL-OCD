package com.dslplatform.ocd
package config

import scalax.file._
import com.dslplatform.compiler.client.api.params.Language
import scala.collection.mutable.LinkedHashMap

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

        files.par foreach { case (filename, body) =>
          val path = languageRoot / (filename, '/')
          logger.trace("Deploying test: " + path.path)
          path.write(Patches.fixTests(body))
        }

        val resourcePath = testResourcePath(language)
        logger.trace("Creating the test resource path: " + resourcePath.path)
        resourcePath.createDirectory(true, false)
      }

    def deploy(): Unit = {
      logger.debug("Deploying {} ...", testProject.projectName)

      cleanDsl()
      cleanTests()

      deployDsl()
      deployTests()
    }
  }

  def deployTests(tests: Seq[ITestProject]): Unit = {
    tests foreach(new TestSetup(_).deploy())
  }
}
