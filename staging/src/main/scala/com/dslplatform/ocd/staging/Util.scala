package com.dslplatform.ocd.staging

import Compile._

object Util {
  var Version = "0.4.0"
  val home = repositories / "util"

  private[this] def copyUtil(): Unit = {
    if (home.isDirectory) {
      logger.debug("Cleaning util home: {} ...", home.path)
      home.deleteRecursively()
    }

    val src = repositories / ".." / ".." / "util"
    logger.debug("Copying util to {}", home.path)
    src copyTo home
    logger.trace("Copied util to {}", home.path)
  }

  private[this] def mutateVersions(): Unit = {
    val version = {
      val testingBuild = home / "testing" / "build.sbt"
      backup(testingBuild)
      val globalFind = s"""(?s).*version := "([^"]+)".*""".r
      val globalFind(testingVersion) = testingBuild.contentAsString
      assert(testingVersion == Version)
      testingVersion + "-" + xkcd
    }

    logger.info("--# Util version is: {}", version)
    val versionPatterns = Map(
      s"""(version := ")([^"]+)(")""" -> s"$$1$version$$3"
    )

    home.list(_.name == "build.sbt") foreach { path =>
      backup(path)
      val versionFix = versionPatterns.foldLeft(path.contentAsString){ case (curBody, (pattern, replacement)) =>
        curBody.replaceAll(pattern, replacement)
      }
      path write versionFix
      logger.debug("--# Updated versions in {}", path.path)
    }
  }

  private[this] def compileUtil(): Unit = {
    import Dsl._

    par(
      () => SBT("util", "generator", Seq("com.dslplatform.ocd/dsl-ocd-util-generator_2.11"), clean, `set no src`, `set no doc`, publishLocal),
      () => SBT("util", "ping", Nil, clean, `set no src`, `set no doc`, `package`),
      () => SBT("util", "port-corrector", Nil, clean, `set no src`, `set no doc`, `package`),
      () => SBT("util", "report", Nil, clean, `set no src`, `set no doc`, `package`),
      () => SBT("util", "revenj-runner", Nil, clean, `set no src`, `set no doc`, assembly),
      () => SBT("util", "testing", Seq("com.dslplatform.ocd/dsl-ocd-util-testing"), clean, `set no src`, `set no doc`, publishLocal),
    )
  }

  def apply(skipUtil: Boolean): Unit = {
    if (!skipUtil) {
      copyUtil()
      mutateVersions()
      compileUtil()
    }
  }
}
