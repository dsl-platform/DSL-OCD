package com.dslplatform.ocd.staging

import Compile._

object Test {
  val home = repositories / "test"

  private[this] def copyTest(): Unit = {
    if (home.isDirectory) {
      logger.debug("Cleaning test home: {} ...", home.pathAsString)
      home.deleteRecursively()
    }

    val src = repositories / ".." / ".." / "test"
    logger.debug("Copying test to {}", home.pathAsString)
    src copyTo home
    logger.trace("Copied test to {}", home.pathAsString)
  }

  private[this] def mutateVersions(): Unit = {
    val version = {
      val testBuild = home / "build.sbt"
      backup(testBuild)
      val globalFind = s"""(?s).*version := "([^"]+)".*""".r
      val globalFind(testVersion) = testBuild.contentAsString
      testVersion + "-" + xkcd
    }

    logger.info("--# Test version is: {}", version)
    val versionPatterns = Map(
      s"""(version := ")([^"]+)(")""" -> s"$$1$version$$3",
      s"""("com.dslplatform.ocd" +%% "dsl-ocd-model-[a-z]+" +% ")([^"]+)(")""" -> s"$$1${Model.Version}-$xkcd$$3",
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

  private[this] def deployTarget(): Unit = {
    import Dsl._

    SBT("test", "", Nil, clean, compile, run)
  }

  private[this] def runTarget(): Unit = {
//    ANT("DSL-OCD-Target", "", Nil, "-p")
  }

  def apply(skipTest: Boolean): Unit = {
    if (!skipTest) {
      copyTest()
      mutateVersions()
      deployTarget()
      runTarget()
    }
  }
}
