package com.dslplatform.ocd

import scala.collection.JavaConverters.mapAsJavaMapConverter
import scala.collection.JavaConverters.mapAsScalaMapConverter
import com.dslplatform.compiler.client.api.Actions
import com.dslplatform.compiler.client.api.ApiCall
import com.dslplatform.compiler.client.api.params.DSL
import com.dslplatform.compiler.client.api.params.Language
import com.dslplatform.compiler.client.api.params.PackageName
import com.dslplatform.compiler.client.cmdline.logger.LoggerSystem
import com.dslplatform.compiler.client.io.Logger
import com.dslplatform.compiler.client.cmdline.logger.LoggerSlf4j

trait ITestDeployer {
  def deploy(tests: JavaTestImpl*): Unit
}

class TestDeployer(
    logger: Logger
  , settings: ITestSettings
  , project: ITestProject) extends ITestDeployer {

  private def generateCode(dslFiles: Map[String, String]) = {
    val logger = new LoggerSlf4j()
    val apiCall = new ApiCall(logger)
    val actions = new Actions(logger, apiCall)

    val auth = settings.credentials
    val dsl = new DSL(dslFiles.asJava)
    val projectID = settings.projectID
    val packageName = new PackageName("com.dslplatform.ocd.generated")
    val language = Language.JAVA

    val updateUnsafe = actions.updateUnsafe(auth, dsl, projectID, packageName, language)
    val bodies = updateUnsafe.getFileBodies().asScala

    bodies.filterKeys(_ endsWith ".java")
      .mapValues(new String(_, "UTF-8")).toMap
  }

  def deploy(tests: JavaTestImpl*) {
    val dslFiles =
      (tests map { test =>
        val filename = test.dslTemplate.name + ".dsl"
        val body = test.dslTemplate.toString
        filename -> body
      }).toMap

    val codeFiles =
      generateCode(dslFiles)

    val testFiles =
      (tests map { test =>
        val filename = "Test" + test.dslTemplate.name + ".java"
        val body = test.javaTemplate
        filename -> body
      }).toMap

    project.clean()
    project.deployDsl(dslFiles)
    project.deployCode(codeFiles)
    project.deployTests(testFiles)
  }
}
