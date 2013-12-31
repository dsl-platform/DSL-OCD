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

  def create(projectName: String, packageName: String) = {
    ProjectIni.fromByteArray(
s"""username=ngsutil@dsl-platform.com
project-id=e3429ea9-901c-4778-af52-07997cf1b97b
api-url=https://node0.dsl-platform.com/beta_2877f7a0c144938612104d/
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
