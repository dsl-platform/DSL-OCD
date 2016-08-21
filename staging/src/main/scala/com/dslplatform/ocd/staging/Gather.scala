package com.dslplatform.ocd
package staging

import java.io.{BufferedReader, InputStreamReader}
import java.util.jar.JarInputStream

import sys.process._

object Gather {
  private[this] val home = repositories / ".gather"

  private[this] def clean(): Unit = {
    if (home.exists) {
      logger.trace("Cleaning .gather cache ...")
      home.deleteRecursively(force = true, continueOnFailure = false)
    }
    home.createDirectory(createParents = true)
  }

  private[this] def downloadDependencies(target: String, dependencies: String*): Unit = {
    val downloadFolder = home / target / "downloader"
    (tools / "downloader") copyTo downloadFolder

    val libs = (dependencies map { dependency =>
      "libraryDependencies += " + dependency
    }).mkString("""import sbt._
import Keys._

""", "\n", "\n")

    (downloadFolder / "dependencies.sbt") write libs

    val launcher = tools / "sbt-launch-0.13.12.jar"
    logger.debug(">> Starting SBT @ {}: packCopyDependencies", target + "/downloader")
    Process(Seq(
      "java"
    , s"-Duser.home=${userHome.path}"
    , "-jar", launcher.toAbsolute.path
    , "packCopyDependencies"
    ), downloadFolder.fileOption.get)! ProcessLogger(logger.trace(_), logger.warn(_))
    logger.debug("<< Finished with SBT @ {}: packCopyDependencies", target + "/downloader")

    val packDeps = downloadFolder / "dependencies"
    (packDeps / "downloader_2.11-0.1-SNAPSHOT.jar").delete(force = true)
    (packDeps ** "*.jar") foreach { jar => jar moveTo downloadFolder.parent.get / jar.name }

    downloadFolder.deleteRecursively(force = true, continueOnFailure = false)
    logger.info("Gathered: {}", target)
  }

  private[this] def dslCompiler(): Unit = {
    val src = (repositories / "NGS" ** s"*.exe").head
    val target = home / "dsl-compiler" / src.name
    src copyTo target
    logger.info("Gathered {}", "dsl-compiler")
  }

  private[this] def dslClc(): Unit = {
    val src = repositories / "dsl-compiler-client" / "CommandLineClient" / "target" / s"dsl-clc-${Analyse.dslClcVersion}-$xkcd-jar-with-dependencies.jar"
    val target = home / "dsl-compiler-client" / s"dsl-clc-${Analyse.dslClcVersion}-$xkcd.jar"
    src copyTo target
    logger.info("Gathered {}", "dsl-compiler-client")
  }

  private[this] def dslClientJava(): Unit =
    downloadDependencies("dsl-client-java"
    , s""""com.dslplatform" % "dsl-client-java" % "${Analyse.dslClientJavaVersion}-$xkcd""""
    , """"com.fasterxml.jackson.core" % "jackson-databind" % "2.7.4""""
    )

  private[this] def revenjCoreJava(): Unit =
    downloadDependencies("revenj-core_java"
    , s""""org.revenj" % "revenj-core" % "${Analyse.revenjCoreJavaVersion}-$xkcd""""
    , """"com.fasterxml.jackson.core" % "jackson-databind" % "2.7.4""""
    )

  private[this] val VersionPattern = """[ \t]+<version>([^<]+)</version>"""r
  private[this] def revenjServletJava(): Unit = {
    val src = repositories / "revenj" / "java" / "revenj-servlet" / "target" / "revenj-servlet.war"
    val target = home / "revenj-servlet_java" / s"revenj-servlet-${Analyse.revenjServletJavaVersion}-$xkcd.war"
    src copyTo target

    for (is <- target.inputStream) {
      val jis = new JarInputStream(is)
      try {
        Iterator.continually {
          jis.getNextJarEntry()
        } takeWhile {
          _ ne null
        } find { je =>
          je.getName == "META-INF/maven/org.revenj/revenj-servlet/pom.xml"
        } getOrElse sys.error("Could not locate POM inside the war package")

        val br = new BufferedReader(new InputStreamReader(jis, "UTF-8"))
        Iterator.continually {
          br.readLine()
        } takeWhile {
          _ ne null
        } find {
          case VersionPattern(warVersion) =>
            val pomVersion = Analyse.revenjServletJavaVersion + s"-$xkcd"
            assert(warVersion == pomVersion, s"Version mismatch - original POM vas: ${pomVersion}, but war was: ${warVersion}")
            true
          case _ =>
            false
        } getOrElse sys.error("Could not locate version line in POM!")
      } finally {
        jis.close()
      }
    }
    logger.info("Gathered {}", "revenj-servlet_java")
  }

  private[this] def revenjCoreScala(): Unit =
    downloadDependencies("revenj-core_scala"
    , s""""net.revenj" %% "revenj-core" % "${Analyse.revenjCoreScalaVersion}-$xkcd""""
    )

  private[this] def revenjAkkaScala(): Unit =
    downloadDependencies("revenj-akka_scala"
    , s""""net.revenj" %% "revenj-akka" % "${Analyse.revenjAkkaScalaVersion}-$xkcd""""
    )

  def apply(): Unit = {
    clean()
    block(
      Future { dslCompiler() }
    , Future { dslClc() }
    , Future { dslClientJava() }
    , Future { revenjCoreJava() }
    , Future { revenjServletJava() }
    , Future { revenjCoreScala() }
    , Future { revenjAkkaScala() }
    )
  }
}