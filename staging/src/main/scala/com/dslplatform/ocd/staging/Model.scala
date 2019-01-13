package com.dslplatform.ocd.staging

import java.io.ByteArrayOutputStream
import java.util.Properties

import Compile._

object Model {
  var Version = "0.4.0"
  val home = repositories / "model"

  private[this] def copyModel(): Unit = {
    if (home.isDirectory) {
      logger.debug("Cleaning model home: {} ...", home.pathAsString)
      home.deleteRecursively()
    }

    val configPath = userHome / ".config" / "DSL-OCD" / "ocd.config"
    val baos = new ByteArrayOutputStream()
    val props = new Properties()
    props.put("model", home.pathAsString)
    props.store(baos, "")
    configPath.parent.createDirectories()
    configPath writeByteArray baos.toByteArray
    logger.trace("Wrote ocd.config: {}", configPath.pathAsString)

    val src = repositories / ".." / ".." / "model"
    logger.debug("Copying model to {}", home.pathAsString)
    src copyTo home
    logger.trace("Copied model to {}", home.pathAsString)
  }

  private[this] def mutateVersions(): Unit = {
    val version = {
      val generatorBuild = home / "generator" / "build.sbt"
      backup(generatorBuild)
      val globalFind = s"""(?s).*version := "([^"]+)".*""".r
      val globalFind(generatorVersion) = generatorBuild.contentAsString
      assert(generatorVersion == Version)
      generatorVersion + "-" + xkcd
    }

    logger.info("--# Model version is: {}", version)
    val versionPatterns = Map(
      s"""(version := ")([^"]+)(")""" -> s"$$1$version$$3",
      s"""("com.dslplatform.ocd" +%%? "dsl-ocd-(?:util(?:-generator)?|model)-[a-z]+" +% ")([^"]+)(")""" -> s"$$1$version$$3",
      s"""("com.dslplatform" +% ? "dsl-client-java" +% ")([^"]+)(")""" -> s"$$1${Analyse.dslClientJavaVersion}-$xkcd$$3",
    )

    home.list(_.name == "build.sbt") foreach { path =>
      backup(path)
      val versionFix = versionPatterns.foldLeft(path.contentAsString){ case (curBody, (pattern, replacement)) =>
        curBody.replaceAll(pattern, replacement)
      }
      path write versionFix
      logger.debug("--# Updated versions in {}", path.pathAsString)
    }
  }

  private[this] def compileModel(): Unit = {
    import Dsl._

    par(
      () => SBT("model", "generator", Nil, "clean", "run"),
      () => SBT("model", "kinds", Seq("com.dslplatform.ocd/dsl-ocd-model-kinds_2.12"), clean, `set no src`, `set no doc`, publishLocal),
    )
    par(
      () => SBT("model", "boxes", Seq("com.dslplatform.ocd/dsl-ocd-model-boxes_2.12"), clean, `set no src`, `set no doc`, publishLocal),
      () => SBT("model", "types", Seq("com.dslplatform.ocd/dsl-ocd-model-types_2.12"), clean, `set no src`, `set no doc`, publishLocal),
    )
    par(
      () => SBT("model", "dsls", Seq("com.dslplatform.ocd/dsl-ocd-model-dsls_2.12"), clean, `set no src`, `set no doc`, publishLocal),
      () => SBT("model", "javas", Seq("com.dslplatform.ocd/dsl-ocd-model-javas_2.12"), clean, `set no src`, `set no doc`, publishLocal),
      () => SBT("model", "scalas", Seq("com.dslplatform.ocd/dsl-ocd-model-scalas_2.12"), clean, `set no src`, `set no doc`, publishLocal),
      () => SBT("model", "java-asserts", Seq("com.dslplatform.ocd/dsl-ocd-model-java-asserts"), clean, `set no src`, `set no doc`, publishLocal),
    )
  }

  def apply(skipModel: Boolean): Unit = {
    if (!skipModel) {
      copyModel()
      mutateVersions()
      compileModel()
    }
  }
}
