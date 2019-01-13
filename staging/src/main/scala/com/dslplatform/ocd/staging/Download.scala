package com.dslplatform.ocd
package staging

import java.io.ByteArrayInputStream
import better.files._
import scala.sys.process._

object Download {
  private[this] val CompilerUrl = "https://tools.dsl-platform.com/dsl-compiler.zip"
  private[this] val home = repositories / "dsl-compiler"

  private[this] def clean(): Unit = {
    if (!home.exists) {
      home.createDirectories()
    }
    home.list(_.extension.contains(".exe")) foreach { old =>
      val oldVersion = testVersion(old)
      old.delete()
      logger.trace(s"Deleted ${old.pathAsString} ($oldVersion) ...")
    }
  }

  private[this] def downloadAndUnzip(): (File, Int) = {
    val zis = new java.util.zip.ZipInputStream(
      new ByteArrayInputStream(Helpers.downloadArchive(CompilerUrl, "compiler"))
    )

    val firstEntry = zis.getNextEntry
    assert(firstEntry.getName == "dsl-compiler.exe")

    val expectedLength = firstEntry.getSize.toInt
    val tempFile = home / (java.util.UUID.randomUUID + ".exe")

    tempFile.outputStream apply { os => zis.pipeTo(os) }
    assert(tempFile.size == expectedLength, "Size mismatch!")
    (tempFile, expectedLength)
  }

  private[this] def testVersion(tempFile: File): String = {
    val stdout = new java.io.ByteArrayOutputStream
    val stderr = new java.io.ByteArrayOutputStream
    val stdoutWriter = new java.io.PrintWriter(stdout)
    val stderrWriter = new java.io.PrintWriter(stderr)

    (unixVsWindows("mono")() :+ tempFile.pathAsString) ! ProcessLogger(stdoutWriter.println, stderrWriter.println)

    stdoutWriter.close()
    stderrWriter.close()

    val VersionPattern = """(?s).*?Version: (\d+(?:\.\d+)+).*?""".r
    val VersionPattern(version) = stdout.toString
    version
  }

  private[this] def rename(tempFile: File, version: String): Unit = {
    val targetFile = home / s"dsl-compiler-$version-$xkcd.exe"
    tempFile moveTo targetFile
    logger.debug(s"Renamed to ${targetFile.name}")
  }

  def apply(skipDownload: Boolean): Unit = if (!skipDownload) {
    // Clean all the things!
    clean()

    // Download compiler
    val (tempFile, size) = downloadAndUnzip()
    logger.debug(s"Wrote ${tempFile.name} ($size bytes)")

    // Check version
    val version = testVersion(tempFile)
    logger.info(s"Compiler version: $version")

    // Rename temporary file name
    rename(tempFile, version)
  }
}
