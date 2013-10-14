package com.dslplatform.ocd
package config

import com.dslplatform.compiler.client.api.Actions
import com.dslplatform.compiler.client.api.ApiCall
import com.dslplatform.compiler.client.api.params.Credentials
import com.dslplatform.compiler.client.api.params.ProjectName
import com.dslplatform.compiler.client.cmdline.logger.LoggerSLF4J
import com.dslplatform.compiler.client.api.params.Language

private [config] class TestGenerator(
    logger: Logger
  , testSettings: ITestSettings
  , actions: IApiActions
  ) extends ITestGenerator {

  def generateTests(tests: Seq[ITest]) = {
    val projectName = ("Test-" + testSettings.xkcd).replace('-', '_')
    logger.info("Creating the generator project ...")

    val projectIni = actions.create(projectName)

    logger.info("Generating sources ...")
    val testSetup =
      tests map { case curTest =>
        val generatedCode =
          actions.deployDsl(
            projectID = projectIni.projectID
          , packageName = curTest.packageName
          , languages = curTest.testFiles.keySet
          , dslFiles = curTest.dslFiles
          )

        new ITestSetup {
          def test = curTest
          def codeFiles = generatedCode
        }
      }

    logger.info("Deleting the generator project ...")
    actions.delete(projectIni.projectID)

    testSetup
  }
}
