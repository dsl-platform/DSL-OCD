package com.dslplatform.ocd
package config

import scalax.file._
import scalax.io.Codec.UTF8

import scala.collection.mutable.LinkedHashMap
import test.javatest.TestSuiteCreator
import test.javatest.JavaInfo
import org.apache.commons.io.IOUtils

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

    private def generatedPath(language: Language) =
      languagePath(language) / "src" / "generated"

    private def generatedResourcePath(language: Language) =
      generatedPath(language) / "resources"

    private def mainPath(language: Language) =
      languagePath(language) / "src" / "main"

    private def mainResourcePath(language: Language) =
      mainPath(language) / "resources"

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

    private def deployGenerated(): Unit =
      testProject.testFiles foreach { case (language, files) =>
        val generatedRoot = generatedPath(language) / language.language.toLowerCase
        if (!generatedRoot.exists) {
          logger.trace("Creating the generated path: " + generatedRoot.path)
          generatedRoot.createDirectory(true, false)
        }

        val resourcePath = generatedResourcePath(language)
        if (!resourcePath.exists) {
          logger.trace("Creating the generated resource path: " + resourcePath.path)
          resourcePath.createDirectory(true, false)
        }
      }

    private def deployMain(): Unit =
      testProject.testFiles foreach { case (language, files) =>
        val mainRoot = mainPath(language) / language.language.toLowerCase
        if (!mainRoot.exists) {
          logger.trace("Creating the main path: " + mainRoot.path)
          mainRoot.createDirectory(true, false)
        }

        val resourcePath = mainResourcePath(language)
        if (!resourcePath.exists) {
          logger.trace("Creating the main resource path: " + resourcePath.path)
          resourcePath.createDirectory(true, false)
        }
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
              classOf[TestDeployer].getResourceAsStream("/template.compiler.bat"))

            path.write(body)

          case _ =>
        }
      }

    private def deployEclipseProject(): Unit =
      testProject.testFiles.keys foreach { case language =>
        val languageRoot = languagePath(language)

        language match {
          case JAVA =>
            val projectPath = languageRoot / ".project"
            val classpathPath = languageRoot / ".classpath"

            logger.trace("Creating Eclipse .project file: " + projectPath.path)
            logger.trace("Creating Eclipse .classpath file: " + classpathPath.path)

            val projectBody = IOUtils.toString(
              classOf[TestDeployer].getResourceAsStream("/template.project"), "UTF-8")
              .replace("${projectName}", testProject.projectName)

            val libPath = testSettings.workspace.path / ".." / "tools" / "java" / "lib"
            val classpathBody = IOUtils.toString(
              classOf[TestDeployer].getResourceAsStream("/template.classpath"), "UTF-8")
              .replace("${libPath}", libPath.path)

            projectPath.write(projectBody)(UTF8)
            classpathPath.write(classpathBody)(UTF8)

          case _ =>
        }
      }

    def deploy(): Unit = {
      logger.debug("Deploying {} ...", testProject.projectName)

      cleanDsl()
      cleanTests()

      deployDsl()
      deployGenerated()
      deployMain()
      deployTests()

      deployCompilerScript()
//      deployEclipseProject()
    }
  }

  def deployTests(tests: Seq[ITestProject]): Unit = {
    tests.par foreach(new TestSetup(_).deploy())
  }
}
