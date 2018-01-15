package com.dslplatform.ocd
package staging

import java.io.{BufferedReader, InputStreamReader}
import java.util.jar.JarInputStream

import Compile._

object Gather {
  private[staging] val home = repositories / ".gather"

  private[this] def clean(): Unit = {
    if (home.exists) {
      logger.trace("Cleaning .gather cache ...")
      home.deleteRecursively(force = true, continueOnFailure = false)
    }
    home.createDirectory(createParents = true)
  }

  private[this] def downloadDependencies(target: String, scalaVersion: String, dependencies: String*): Unit = {
    val fullScalaVersion = scalaVersion match {
      case "2.12" => "2.12.2"
      case "2.11" => "2.11.11"
      case _ => ???
    }

    val downloadFolder = home / target / "downloader"

    (downloadFolder / "project" / "plugins.sbt") write """addSbtPlugin("org.xerial.sbt" % "sbt-pack" % "0.8.2")
"""
    (downloadFolder / "project" / "build.properties") write """sbt.version=0.13.15
"""
    (downloadFolder / "build.sbt") write s"""
scalaVersion := "$fullScalaVersion"
autoScalaLibrary := false

libraryDependencies ++= Seq(
  ${dependencies.mkString("\n, ")}
)
resolvers += Resolver.mavenLocal

packAutoSettings
packCopyDependenciesUseSymbolicLinks := false
packCopyDependenciesTarget := file("dependencies")
"""

    SBT(s".gather/$target/downloader", "", Nil, "packCopyDependencies")
    val packDeps = downloadFolder / "dependencies"
    (packDeps / s"downloader_${scalaVersion}-0.1-SNAPSHOT.jar").delete(force = true)
    (packDeps ** "*.jar") foreach { jar => jar moveTo downloadFolder.parent.get / jar.name }

    downloadFolder.deleteRecursively(force = true, continueOnFailure = false)
    logger.info("Gathered: {}", target)
  }

  private[this] def copy(name: String, source: Path, target: Path): Unit = {
    logger.trace("Copying {} ...", name)
    source copyTo target
    logger.info("Gathered {}", name)
  }

  private[this] def utilPing(): Unit = {
    val src = repositories / "util" / "ping" / "target" ** "*.jar" head
    val target = home / "dsl-ocd-util-ping" / src.name
    copy("util-ping", src, target)
  }

  private[this] def utilPortCorrector(): Unit = {
    val src = repositories / "util" / "port-corrector" / "target" ** "*.jar" head
    val target = home / "dsl-ocd-util-port-corrector" / src.name
    copy("util-port-corrector", src, target)
  }

  private[this] def utilReport(): Unit = {
    val src = repositories / "util" / "report" / "target" ** "*.jar" head
    val target = home / "dsl-ocd-util-report" / src.name
    copy("util-report", src, target)
  }

  private[this] def utilJettyRunner(): Unit = {
    downloadDependencies("jetty-runner", "2.11"
    , s""""org.eclipse.jetty" % "jetty-runner" % "9.4.0.v20161208" intransitive()"""
    , s""""org.eclipse.jetty" % "jetty-start" % "9.4.0.v20161208""""
    )
  }

  private[this] def utilRevenjRunner(): Unit = {
    val src = repositories / "util" / "revenj-runner" / "target" ** "*.jar" head
    val target = home / "dsl-ocd-util-revenj-runner" / src.name
    copy("util-revenj-runner", src, target)
  }

  private[this] def utilTesting(): Unit = {
    downloadDependencies("util-testing", "2.11"
    , s""""com.dslplatform.ocd" % "dsl-ocd-model-java-asserts" % "${Util.Version}-$xkcd""""
    , """"ch.qos.logback" % "logback-classic" % "1.2.3""""
    )

    (home / "util-testing" / "dsl-ocd-model-java-asserts.jar") moveTo
    (home / "util-testing" / s"dsl-ocd-model-java-asserts-${Util.Version}-$xkcd.jar")

    (home / "util-testing" / "dsl-ocd-util-testing.jar") moveTo
    (home / "util-testing" / s"dsl-ocd-util-testing-${Util.Version}-$xkcd.jar")
  }

  private[this] def dslCompiler(): Unit = {
    val src = (repositories / "dsl-compiler" ** "*.exe").head
    val target = home / "dsl-compiler" / src.name
    copy("dsl-compiler", src, target)
  }

  private[this] def dslClc(): Unit = {
    val src = repositories / "dsl-compiler-client" / "CommandLineClient" / "target" / s"dsl-clc-${Analyse.dslClcVersion}-$xkcd-jar-with-dependencies.jar"
    val target = home / "dsl-compiler-client" / s"dsl-clc-${Analyse.dslClcVersion}-$xkcd.jar"
    copy("dsl-compiler-client", src, target)
  }

  private[this] def dslClientJava(): Unit =
    downloadDependencies("dsl-client-java", "2.11"
    , s""""com.dslplatform" % "dsl-client-java" % "${Analyse.dslClientJavaVersion}-$xkcd""""
    , """"com.fasterxml.jackson.core" % "jackson-databind" % "2.7.8""""
    )

  private[this] def revenjCoreJava(): Unit =
    downloadDependencies("revenj-core_java", "2.11"
    , s""""org.revenj" % "revenj-core" % "${Analyse.revenjCoreJavaVersion}-$xkcd""""
    , """"com.fasterxml.jackson.core" % "jackson-databind" % "2.7.8""""
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

  private[this] def revenjCoreScala(scalaVersion: String): Unit =
    downloadDependencies(s"revenj-core_scala_$scalaVersion", scalaVersion
    , s""""net.revenj" %% "revenj-core" % "${Analyse.revenjCoreScalaVersion}-$xkcd""""
    , """"org.scala-lang.modules" %% "scala-xml" % "1.0.6""""
    )

  private[this] def revenjAkkaScala(scalaVersion: String): Unit =
    downloadDependencies(s"revenj-akka_scala_$scalaVersion", scalaVersion
    , s""""net.revenj" %% "revenj-akka" % "${Analyse.revenjAkkaScalaVersion}-$xkcd""""
    , """"org.scala-lang.modules" %% "scala-xml" % "1.0.6""""
    )

  private[this] def revenjCoreNet(): Unit = {
    val src = (Fetch.releases ** (Fetch.`revenj.net library dependencies`.replaceFirst("\\.zip$", "") + "-*"))
      .headOption.getOrElse(sys.error("Could not gather revenj-core (.NET)"))
    val target = home / "revenj-core_net"
    copy("revenj-core_net", src, target)
  }

  private[this] def revenjServerNet(): Unit = {
    val src = (Fetch.releases ** (Fetch.`revenj.net runtime server`.replaceFirst("\\.zip$", "") + "-*"))
      .headOption.getOrElse(sys.error("Could not gather revenj-server (.NET)"))
    val target = home / "revenj-server_net"
    copy("revenj-server_net", src, target)
  }

  private[this] def postgreSqlJdbc(): Unit = {
    val src = repositories / "drivers" / "postgresql-jdbc"
    val target = home / "postgresql-jdbc"
    copy("postgresql-jdbc", src, target)
  }

  private[this] def languages(): Unit = {
    val src = repositories / "languages"
    val target = home / "languages"
    copy("languages", src, target)
  }

  def apply(skipGather: Boolean): Unit = if (!skipGather) {
    clean()
    par(
      () => utilPing()
    , () => utilPortCorrector()
    , () => utilReport()
    , () => utilRevenjRunner()
    , () => utilJettyRunner()
    , () => utilTesting()
    , () => dslCompiler()
    , () => dslClc()
    , () => dslClientJava()
    , () => revenjCoreJava()
    , () => revenjServletJava()
    , () => revenjCoreScala("2.11")
    , () => revenjCoreScala("2.12")
    , () => revenjAkkaScala("2.11")
    , () => revenjAkkaScala("2.12")
    , () => revenjCoreNet()
    , () => revenjServerNet()
    , () => postgreSqlJdbc()
    , () => languages()
    )
  }
}
