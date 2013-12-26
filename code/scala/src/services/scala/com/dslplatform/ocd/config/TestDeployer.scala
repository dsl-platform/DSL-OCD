package com.dslplatform.ocd
package config

import scalax.file._
import com.dslplatform.compiler.client.api.params.Language

private [config] class TestDeployer(
    logger: Logger
  , testSettings: ITestSettings
  ) extends ITestDeployer {

  private val root = testSettings.workspace.path

  private def languagePath(language: Language) =
    root / language.language.toLowerCase

  private def generatedPath(language: Language) =
    languagePath(language) / "src" / "generated"

  private def testPath(language: Language) =
    languagePath(language) / "src" / "test"

  private def clean(languages: Set[Language]) {
    logger.debug("Cleaning generated DSL ...")
    val remaining = (root / "dsl").deleteRecursively(true, true)._2
    if (remaining > 0) {
      logger.warn(s"Could not delete all generated DSL ($remaining)!")
    }

    languages foreach { language =>
      logger.debug(s"Cleaning code and tests ($language) ...")
      val path = languagePath(language)
      val remaining = path.deleteRecursively(true, true)._2
      if (remaining > 0) {
        logger.warn(s"Could not delete all code for $language ($remaining)!")
      }
    }
  }

  def deployDsl(dslFiles: Map[String, String]) {
    dslFiles foreach { case (filename, body) =>
      logger.trace("Deploying DSL: " + filename)
      (root / "dsl" / (filename, '/')).write(body)
    }
  }

  def deployCode(codeFiles: Map[Language, Map[String, String]]) {
    codeFiles foreach { case (language, files) =>
      val languageRoot = generatedPath(language)
      files foreach { case (filename, body) =>
        logger.trace("Deploying code: " + filename)
        (languageRoot / (filename, '/')).write(body)
      }
    }
  }

  def deployTest(testFiles: Map[Language, Map[String, String]]) {
    testFiles foreach { case (language, files) =>
      val languageRoot = testPath(language)
      files foreach { case (filename, body) =>
        logger.trace("Deploying tests: " + filename)
        (languageRoot / (filename, '/')).write(body)
      }
    }
  }

  def deployTests(tests: Seq[ITestSetup]) {
    val languages =
      tests.flatMap{ curTest =>
        curTest.codeFiles.keySet ++
        curTest.test.testFiles.keySet
      }.toSet

    clean(languages)

    tests foreach { curTest =>
      deployDsl(curTest.test.dslFiles)
      deployCode(curTest.codeFiles)
      deployTest(curTest.test.testFiles)
    }
  }
}
