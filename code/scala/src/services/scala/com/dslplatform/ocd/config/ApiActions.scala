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
import com.dslplatform.compiler.client.api.ApiProperties

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

    val apiProperties = new ApiProperties(apiLogger, {
      val properties = new java.util.Properties
      properties.put("api-url", "http://localhost:9993/")
      properties.put("version", "0.8.13")
      properties.put("timeout", "8000")
      properties.put("poll-interval", "1000")
      properties
    })

    val apiCall = new ApiCall(apiLogger, apiProperties)
    new Actions(apiLogger, apiCall)
  }

  private val auth = new Credentials(
    testSettings.username
  , new String(testSettings.password, "UTF-8")
  )

  def create(projectName: String, packageName: String) = {
    ProjectIni.fromByteArray(
s"""username=ocd@dsl-platform.com
project-id=e7cc4459-82fd-47d7-a92c-964f4398309a
api-url=https://compiler-actionbunny.dsl-platform.com:8443/beta_07fb37a8704594af5578b4/
package-name=${packageName}
""" getBytes "UTF-8")

//    val create = actions.create(auth, new ProjectName(projectName))
//    logger.info("Project successfully created: " + create.getProjectID)
//    ProjectIni.fromByteArray(create.getProjectIni())
  }

  def upgradeDatabase(
      projectID: UUID
    , dslFiles: Map[String, String]): Unit =
    actions.updateUnsafe(
      auth
    , new DSL(dslFiles.asJava)
    , new ProjectID(projectID)
    , new PackageName("model")
    , Language.JAVA
    )

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
        .mapValues(p => patch(new String(p, "UTF-8"))).toMap

      logger.debug(s"Generated ${langFiles.size} ${language.language} files.")

      language -> langFiles
    }).toMap
  }

  private def patch(body: String) = {
    body.replaceAll(
      """(\n +?)((?:public|private)(?:[^{]+?\{[^{]+?)new java\.util\.Map)<String, String>(\[\] \{\})"""
    , """$1@SuppressWarnings("unchecked")$1$2$3"""
    ).replace(
      """if (!(this.oneXML.equals(other.oneXML))) return false;"""
    , """if (!(this.oneXML == other.oneXML || this.oneXML != null
                && this.oneXML.equals(other.oneXML))) return false;"""
    ).replaceAll(
      """this\( (.+?) = if \((.+?) == null\) (0|false|0\.0f) else (.+?)\)"""
    , """this($1)"""
    )
  }

  def delete(projectID: UUID) =
    actions.delete(
      auth
    , new ProjectID(projectID)
    )
}
