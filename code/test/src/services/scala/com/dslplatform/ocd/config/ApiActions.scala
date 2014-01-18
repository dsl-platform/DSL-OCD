package com.dslplatform.ocd
package config

import scala.collection.JavaConverters._
import projects.ProjectIni
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
import java.io.ObjectOutputStream
import java.io.FileOutputStream
import java.io.ObjectInputStream
import java.io.FileInputStream
import java.io.File
import java.util.zip.DeflaterInputStream
import java.util.zip.DeflaterOutputStream
import java.util.zip.InflaterInputStream

private object ApiActions {
  val Extensions = Map(
    Language.JAVA -> "java"
  , Language.SCALA -> "scala"
  , Language.PHP -> "php"
  , Language.C_SHARP -> "cs"
  )
}

private[config] class ApiActions(
    logger: Logger
  , testSettings: ITestSettings
  , projectCache: IProjectCache
  ) extends IApiActions {

  private val actions = {
    val apiLogger = new LoggerSLF4J(logger)
    apiLogger.debug("Initialized DSL-CLC ApiLogger")

    val apiCall = new ApiCall(apiLogger, testSettings.apiProperties)
    new Actions(apiLogger, apiCall)
  }

  private val auth = new Credentials(
    testSettings.username
  , new String(testSettings.password, "UTF-8")
  )

  private def getCachedProjectIni(packageName: String) =
    projectCache.getFresh().map(_.toProjectIni(packageName))

  def create(projectName: String, packageName: String) = {
    getCachedProjectIni(packageName) getOrElse {
      val create = actions.create(auth, new ProjectName(projectName))
      logger.info("Project successfully created: " + create.getProjectID)

      // mutate the packageName
      ProjectIni.fromByteArray(create.getProjectIni())
        .copy(packageName = packageName)
    }
  }

  def upgradeDatabase(
      projectID: UUID
    , dslFiles: Files): Unit =
    actions.updateUnsafe(
      auth
    , new DSL(dslFiles.asJava)
    , new ProjectID(projectID)
    , new PackageName("model")
    , Language.JAVA
    )

  private def dumpObject(file: File, content: AnyRef): Unit = {
    val oos = new ObjectOutputStream(new DeflaterOutputStream(new FileOutputStream(file)))
    try {
      oos.writeObject(content)
    }
    finally {
      oos.close()
    }
  }

  private def restoreObject[T](file: File): T = {
    val ois = new ObjectInputStream(new InflaterInputStream(new FileInputStream(file)))
    try {
      ois.readObject().asInstanceOf[T]
    }
    finally {
      ois.close()
    }
  }

  private type CacheType = java.util.SortedMap[String,Array[Byte]]

  def deployDsl(
      projectID: UUID
    , packageName: String
    , languages: Set[Language]
    , dslFiles: Files) = {

    val langs = languages.toSeq

    val hash =  packageName + languages + dslFiles ##
    val cacheName = "%08X.cache" format hash
    val cacheFile = testSettings.workspace / "cache" / cacheName file

    val files =
      if (CacheSettings.CacheCode && cacheFile.exists()) {
        restoreObject[CacheType](cacheFile)
      } else {
        val update =
          actions.updateUnsafe(
            auth
          , new DSL(dslFiles.asJava)
          , new ProjectID(projectID)
          , new PackageName(packageName)
          , langs: _*
          )

        val files = update.getFileBodies
        require(files.size > 0, "Could not compile sources: " + packageName)

        dumpObject(cacheFile, files)
        files
      }

    (langs map { language =>
      val ext = ApiActions.Extensions(language)
      val langFiles = files.asScala
        .filter(_._1 endsWith ext)
        .mapValues(p => patch(new String(p, "UTF-8"))).toMap

      logger.debug(s"Generated ${langFiles.size} ${language.language} files.")

      language -> langFiles
    }).toMap
  }

  private def patch(body: String) = {
    body
  }

  def delete(projectID: UUID) =
    actions.delete(
      auth
    , new ProjectID(projectID)
    )
}
