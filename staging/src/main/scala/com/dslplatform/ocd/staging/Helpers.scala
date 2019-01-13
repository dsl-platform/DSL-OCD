package com.dslplatform.ocd.staging

import java.io.{ByteArrayInputStream, ByteArrayOutputStream}
import java.net.URL
import java.security.MessageDigest
import java.util.zip.ZipInputStream

import better.files._

object Helpers {
  def downloadArchive(url: String, name: String, chunkSize: Int = 500000): Array[Byte] = {
    logger.debug(s"--> Downloading {} @ {} ...", name, url)
    val downloader = new URL(url).openStream().bytes.grouped(chunkSize)
    val baos = new ByteArrayOutputStream()
    downloader.foldLeft(0L) { (last, buffer) =>
      val soFar = last + buffer.length
      logger.debug(s"--# Downloading {}: {} bytes ...", name, format(soFar))
      baos.write(buffer.toArray)
      soFar
    }
    baos.toByteArray
  }

  def checkSha1(archive: Array[Byte], sha1: String): Unit = {
    val md = MessageDigest.getInstance("SHA-1")
    val digest = md.digest(archive).map(_ formatted "%02x").mkString
    assert(digest == sha1, s"SHA-1 mismatch")
  }

  def extractTool(archive: Array[Byte], name: String, expectedChildFolder: Option[String], outputPath: File): Unit = {
    logger.debug(s"--# Downloaded $name, extracting ...")
    val zis = new ZipInputStream(new ByteArrayInputStream(archive))

    def unzip(filesSoFar: Int, sizeSoFar: Long): (Int, Long) =
      zis.getNextEntry match {
        case null => (filesSoFar, sizeSoFar)
        case ze if ze.isDirectory => unzip(filesSoFar, sizeSoFar)
        case ze =>
          val name = ze.getName
          for (ecf <- expectedChildFolder) {
            assert(name startsWith ecf, s"Path mismatch, expected to start with $ecf, but got: " + name)
          }
          val innerName = name.drop(expectedChildFolder.map(_.length).getOrElse(0))
          val path = outputPath / innerName.dropWhile(_ == '/')
          logger.trace(s"--# Unzipping {}: {}", name, path.pathAsString)
          path.parent.createDirectories()
          path.outputStream apply { os => zis.pipeTo(os) }
          require(ze.getSize == path.size, "Unzip of file wasn't successful")
          unzip(filesSoFar + 1, sizeSoFar + ze.getSize)
      }

    val (extractedFiles, extractedSize) = unzip(0, 0L)
    logger.debug(s"<-- Downloaded {}: ${format(extractedSize)} bytes in $extractedFiles files", name)
  }
}
