package com.dslplatform.ocd.staging

import java.net.URL

import better.files._

object Languages {
  private[this] val home = repositories / "languages"

  private[this] def clean(): Unit = {
    if (home.isDirectory) {
      logger.debug("Cleaning languages home: {} ...", home.pathAsString)
      home.deleteRecursively()
    }
  }

  val JvmArguments = "-Xms1g -Xmx1g -Xss2m"

  private[this] def scala(majorVersions: String*): Unit = {
    val web = "https://www.scala-lang.org/download/all.html"
    val body = new URL(web).openStream().asString()

    val pattern = """<a href="/download/([^h]+)\.html">Scala \1</a>""".r
    val versions = (for (version <- pattern.findAllMatchIn(body)) yield version.group(1)).toSeq

    val majorToMinorMapping =
      (for (majorVersion <- majorVersions) yield {
        majorVersion -> (versions.reverse find { version =>
          !(version matches ".*-(M|RC).*") && (version startsWith majorVersion)
        } getOrElse(sys.error(s"Could not locate Scala with major version $majorVersion")))
      }).toMap

    majorToMinorMapping.par foreach { case (major, minor) =>
      val name = "Scala " + major
      val url = s"""https://downloads.lightbend.com/scala/$minor/scala-$minor.zip"""
      val archive = Helpers.downloadArchive(url, name)
      val target = home / s"scala_$major"
      Helpers.extractTool(archive, name, Some(s"scala-$minor"), target)

      locally {
        val windows = target / "bin" / "scalac.bat"
        backup(windows)
        windows write windows.contentAsString.replaceAll("""("%_JAVACMD%" %_JAVA_OPTS%)""", "$1 " + JvmArguments)
        logger.debug("--# Tweaked JVM arguments in {}", windows.pathAsString)
      }

      locally {
        val unix = target / "bin" / "scalac"
        backup(unix)
        unix.toJava.setExecutable(true)
        unix write unix.contentAsString.replaceFirst("(  \\$JAVA_OPTS)( \\\\)", "$1 " + JvmArguments + "$2")
        logger.debug("--# Tweaked JVM arguments in {}", unix.pathAsString)
      }
    }
  }

  def apply(skipDrivers: Boolean): Unit = if (!skipDrivers) {
    clean()
    par(
      () => scala("2.11", "2.12")
    )
  }
}
