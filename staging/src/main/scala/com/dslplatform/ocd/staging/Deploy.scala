package com.dslplatform.ocd.staging

object Deploy {
  val lock = new AnyRef

  private[this] def deployUtil(name: String): Unit = {
    val src = (Gather.home / s"dsl-ocd-$name").list(_.extension.contains(".jar"))
      .toSeq.headOption.getOrElse(sys.error(s"Could not locate $name to deploy!"))
    val target = templates / "tools" / "build" / "dsl-ocd-util"

    lock synchronized {
      if (target.isDirectory) {
        for (old <- target.list(_.name.matches(s"dsl-ocd-$name.+\\.jar"))) {
          logger.debug(s"Cleaning previous {}: {}", name, old.name)
          old.deleteRecursively()
        }
      } else {
        target.createDirectories()
      }
    }

    locally {
      val config = templates / "master-build" / "build.xml"
      lock synchronized {
        val body = config.contentAsString
        val patchedVersion = body.replaceFirst(s"""(\\Q<property name="tools.$name" location="tools/build/dsl-ocd-util/\\E)[^"]+\\.jar("/>)""", s"$$1${src.name}$$2")
        if (body != patchedVersion) {
          config write patchedVersion
          logger.debug("Patched {} version in {}", name, config.name)
        }
      }
    }

    for (config <- (templates / "build-templates").list(_.name.matches("build-common-template-.+\\.xml"))) {
      lock synchronized {
        val body = config.contentAsString
        val patchedVersion = body.replaceFirst(s"""(\\Q<property name="tools.$name" location="$${tools.build}/dsl-ocd-util/\\E)[^"]+\\.jar("/>)""", s"$$1${src.name}$$2")
        if (body != patchedVersion) {
          config write patchedVersion
          logger.debug(s"Patched {} version in {}", name, config.name)
        }
      }
    }

    src copyTo target / src.name
    logger.info("Copied {} to tools/build/dsl-ocd-util", src.name)
  }

  private[this] def deployTesting(): Unit = {
    val src = Gather.home / "util-testing"

    val target = templates / "tools" / "testing"
    if (target.exists) {
      logger.debug("Cleaning previous testing: {}", target.pathAsString)
      target.deleteRecursively()
    }

    src copyTo target
    logger.info("Copied {} to tools/testing", src.name)
  }

  private[this] def dslCompiler(): Unit = {
    val src = (Gather.home / "dsl-compiler").list(_.name.matches("dsl-compiler-.+\\.exe"))
        .toSeq.headOption.getOrElse(sys.error("Could not locate dsl-compiler to deploy!"))
    val target = templates / "tools" / "build" / "dsl-compiler"

    if (target.isDirectory) {
      for (old <- target.list(_.name.matches("dsl-compiler-.+\\.exe"))) {
        logger.debug("Cleaning previous dsl-complier: {}", old.name)
        old.delete()
      }
    } else {
      target.createDirectories()
    }

    for (config <- (templates / "build-templates").list(_.name.matches("build-common-template-.+\\.xml"))) {
      lock synchronized {
        val body = config.contentAsString
        val patchedVersion = body.replaceFirst("""(<property name="dsl-compiler" value=")dsl-compiler-[^"]+\.exe("/>)""", s"$$1${src.name}$$2")
        if (body != patchedVersion) {
          config write patchedVersion
          logger.debug("Patched dsl-compiler version in {}", config.name)
        }
      }
    }

    src copyTo target / src.name
    logger.info("Copied {} to tools/build/dsl-compiler", src.name)
  }

  private[this] def dslClc(): Unit = {
    val src = (Gather.home / "dsl-compiler-client").list(_.name.matches("dsl-clc-.+\\.jar"))
        .toSeq.headOption.getOrElse(sys.error("Could not locate dsl-clc to deploy!"))
    val target = templates / "tools" / "build" / "dsl-compiler"

    if (target.isDirectory) {
      for (old <- target.list(_.name.matches("dsl-clc-.+\\.jar"))) {
        logger.debug("Cleaning previous dsl-clc: {}", old.name)
        old.delete()
      }
    } else {
      target.createDirectory()
    }

    for (config <- (templates / "build-templates").list(_.name.matches("build-common-template-.+\\.xml"))) {
      lock synchronized {
        val body = config.contentAsString
        val patchedVersion = body.replaceFirst("""(<property name="dsl-clc" value=")dsl-clc-[^"]+\.jar("/>)""", s"$$1${src.name}$$2")
        if (body != patchedVersion) {
          config write patchedVersion
          logger.debug("Patched dsl-clc version in {}", config.name)
        }
      }
    }

    src copyTo target / src.name
    logger.info("Copied {} to tools/build/dsl-compiler", src.name)
  }

  private[this] def javaClientCompile(): Unit = {
    val src = Gather.home / "dsl-client-java"

    val target = templates / "tools" / "compile" / "java_client"
    if (target.exists) {
      logger.debug("Cleaning previous java_client: {}", target.pathAsString)
      target.deleteRecursively()
    }

    src copyTo target
    logger.info("Copied {} to tools/compile", src.name)
  }

  private[this] def revenjJavaCompile(): Unit = {
    val src = Gather.home / "revenj-core_java"

    val target = templates / "tools" / "compile" / "revenj.java"
    if (target.exists) {
      logger.debug("Cleaning previous revenj-core (Java) {}", target.pathAsString)
      target.deleteRecursively()
    }

    src copyTo target
    logger.info("Copied {} to tools/compile", src.name)
  }

  private[this] def revenjJavaRuntime(): Unit = {
    val src = (Gather.home / "revenj-servlet_java").list(_.name.matches("revenj-servlet-.+\\.war"))
        .toSeq.headOption.getOrElse(sys.error("Could not locate revenj-servlet.war to deploy!"))

    val target = templates / "tools" / "runtime" / "revenj.java"
    if (target.exists) {
      for (old <- target.list(_.name.matches("revenj-servlet-.+\\.war"))) {
        logger.debug("Cleaning previous revenj-servlet (Java) {}", old.pathAsString)
        target.deleteRecursively()
      }
    }

    for (config <- (templates / "build-templates").list(_.name.matches("build-common-template-.+\\.xml"))) {
      lock synchronized {
        val body = config.contentAsString
        val patchedVersion = body.replaceFirst("""(<property name="revenj.war" value=")revenj-servlet-[^"]+\.war("/>)""", s"$$1${src.name}$$2")
        if (body != patchedVersion) {
          config write patchedVersion
          logger.debug("Patched revenj.war version in {}", config.name)
        }
      }
    }

    target.createDirectories()
    src copyTo target / src.name
    logger.info("Copied {} to tools/compile", src.name)
  }

  private[this] def revenjNetCompile(): Unit = {
    val src = Gather.home / "revenj-core_net"

    val target = templates / "tools" / "compile" / "revenj.net"
    if (target.exists) {
      logger.debug("Cleaning previous revenj-core (.NET) {}", target.pathAsString)
      target.deleteRecursively()
    }

    src copyTo target
    logger.info("Copied {} to tools/compile", src.name)
  }

  private[this] def revenjNetRuntime(): Unit = {
    val src = Gather.home / "revenj-server_net"

    val target = templates / "tools" / "runtime" / "revenj.net"
    if (target.exists) {
      logger.debug("Cleaning previous revenj-server (.NET) {}", target.pathAsString)
      target.deleteRecursively()
    }

    src copyTo target
    logger.info("Copied {} to tools/runtime", src.name)
  }

  private[this] def revenjScalaCompile(scalaVersion: String): Unit = {
    val src = Gather.home / s"revenj-core_scala_$scalaVersion"

    val target = templates / "tools" / "compile" / s"revenj.scala_$scalaVersion"
    if (target.exists) {
      logger.debug("Cleaning previous revenj-core (Scala) {}", target.pathAsString)
      target.deleteRecursively()
    }

    src copyTo target
    logger.info("Copied {} to tools/compile", src.name)
  }

  private[this] def revenjAkkaRuntime(scalaVersion: String): Unit = {
    val src = Gather.home / s"revenj-akka_scala_$scalaVersion"

    val target = templates / "tools" / "runtime" / s"revenj.scala_$scalaVersion"
    if (target.exists) {
      logger.debug("Cleaning previous revenj-akka (Scala) {}", target.pathAsString)
      target.deleteRecursively()
    }

    src copyTo target
    logger.info("Copied {} to tools/runtime", src.name)
  }

  private[this] def buildJdbc(): Unit = {
    val src = Gather.home / "postgresql-jdbc"
    val target = templates / "tools" / "build" / "jdbc"
    if (target.exists) {
      logger.debug("Cleaning previous jdbc {}", target.pathAsString)
      target.deleteRecursively()
    }

    src copyTo target
    logger.info("Copied {} to tools/build", src.name)

    val jre6Jdbc = src.list(_.name.matches(".+\\.jre6\\.jar")).next()
    for (config <- (templates / "build-templates").list(_.name.matches("build-common-template-.+\\.xml"))) {
      lock synchronized {
        val body = config.contentAsString
        val patchedVersion = body.replaceFirst("""(<path id="postgres.classpath" location="\$\{tools\.build\}/jdbc/)[^"]+\.jar("/>)""", s"$$1${jre6Jdbc.name}$$2")
        if (body != patchedVersion) {
          config write patchedVersion
          logger.debug("Patched PostgreSQL JDBC version in {}", config.name)
        }
      }
    }
  }

  private[this] def buildJettyRunner(): Unit = {
    val src = Gather.home / "jetty-runner"
    val target = templates / "tools" / "build" / "jetty-runner"
    if (target.exists) {
      logger.debug("Cleaning previous jetty-runner {}", target.pathAsString)
      target.deleteRecursively()
    }

    src copyTo target
    logger.info("Copied {} to tools/build", src.name)

    val tools = Map(
      "jetty-runner" -> "jetty-runner",
      "jetty-stopper" -> "jetty-start",
    )

    for {
      config <- (templates / "build-templates").list(_.name.matches("build-common-template-.+\\.xml"))
      (toolName, toolJar) <- tools
    } {
      val toolFilename = src.list(_.name.matches(s"$toolJar-.+\\.jar"))
        .toSeq.headOption.getOrElse(sys.error(s"Could not locate $toolName tool in: " + src.pathAsString))
        .name

      lock synchronized {
        val body = config.contentAsString
        val patchedVersion = body.replaceFirst(s"""(\\Q<property name="tools.$toolName" location="$${tools.build}/jetty-runner/\\E)$toolJar-[^"]+\\.jar("/>)""", s"$$1$toolFilename$$2")
        if (body != patchedVersion) {
          config write patchedVersion
          logger.debug("Patched postgresql-jdbc version in {}", config.name)
        }
      }
    }
  }

  private[this] def languages(): Unit = {
    val src = Gather.home / "languages"

    val target = templates / "tools" / "build" / "languages"
    if (target.exists) {
      logger.debug("Cleaning previous languages {}", target.pathAsString)
      target.deleteRecursively()
    }

    src copyTo target
    logger.info("Copied {} to tools/build/languages", src.name)
  }

  def apply(skipDeploy: Boolean): Unit = if (!skipDeploy) par(
    () => deployUtil("util-report"),
    () => deployUtil("util-port-corrector"),
    () => deployUtil("util-ping"),
    () => deployUtil("util-revenj-runner"),
    () => deployTesting(),
    () => dslCompiler(),
    () => dslClc(),
    () => revenjJavaRuntime(),
    () => javaClientCompile(),
    () => revenjJavaCompile(),
    () => revenjNetCompile(),
    () => revenjNetRuntime(),
    () => revenjScalaCompile("2.11"),
    () => revenjScalaCompile("2.12"),
    () => revenjAkkaRuntime("2.11"),
    () => revenjAkkaRuntime("2.12"),
    () => buildJdbc(),
    () => buildJettyRunner(),
    () => languages(),
  )
}
