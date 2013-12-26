package com.dslplatform.ocd
package config

import scala.collection.JavaConverters._
import com.dslplatform.compiler.client.api.Actions
import com.dslplatform.compiler.client.api.ApiCall
import com.dslplatform.compiler.client.api.params.Credentials
import com.dslplatform.compiler.client.api.params.DSL
import com.dslplatform.compiler.client.api.params.Language
import com.dslplatform.compiler.client.api.params.PackageName
import com.dslplatform.compiler.client.api.params.ProjectID
import com.dslplatform.compiler.client.api.params.ProjectName
import com.dslplatform.compiler.client.cmdline.logger.LoggerSLF4J

private object ApiActions {
  val Extensions = Map(
    Language.JAVA -> "java"
  , Language.SCALA -> "scala"
  , Language.PHP -> "php"
  , Language.C_SHARP -> "cs"
  )
}

private [config] class ApiActions(
    logger: Logger
  , testSettings: ITestSettings
  ) extends IApiActions {

  private val actions = {
    val apiLogger = new LoggerSLF4J(logger)
    apiLogger.debug("Initialized DSL-CLC ApiLogger")

    val apiCall = new ApiCall(apiLogger)
    new Actions(apiLogger, apiCall)
  }

  private val auth = new Credentials(
    testSettings.username
  , new String(testSettings.password, "UTF-8")
  )

  def create(projectName: String) = {
    ProjectIni.fromByteArray(
"""username=ngsutil@dsl-platform.com
project-id=e3429ea9-901c-4778-af52-07997cf1b97b
api-url=https://node0.dsl-platform.com/beta_2877f7a0c144938612104d/
package-name=com.dslplatform.ocd.values
""" getBytes "UTF-8")

//    val create = actions.create(auth, new ProjectName(projectName))
//    logger.info("Project successfully created: " + create.getProjectID)
//    ProjectIni.fromByteArray(create.getProjectIni())
  }

  def deployDsl(
      projectID: UUID
    , packageName: String
    , languages: Set[Language]
    , dslFiles: Map[String, String]) = {

    val langs = languages.toSeq

    val update =
      actions.updateUnsafe(
        auth
      , new DSL(dslFiles.asJava)
      , new ProjectID(projectID)
      , new PackageName(packageName)
      , langs: _*
      )

    val files = update.getFileBodies.asScala

    (langs map { language =>
      val ext = ApiActions.Extensions(language)
      val langFiles = files
        .filter(_._1 endsWith ext)
        .mapValues(new String(_, "UTF-8")).toMap

      logger.debug(s"Generated ${langFiles.size} ${language.language} files.")

      language -> langFiles
    }).toMap
  }

  def delete(projectID: UUID) =
    actions.delete(
      auth
    , new ProjectID(projectID)
    )
}
