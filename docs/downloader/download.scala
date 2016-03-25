def clean(): Unit = {
  new java.io.File(".").list
      .filter(_ endsWith ".exe") foreach { old =>
    val oldVersion = testVersion(old)
    if (new java.io.File(old).delete()) {
      println(s"Deleted $old ($oldVersion) ...")
    } else {
      println(s"Could not delete: $old")
    }
  }
}

def download() = {
  val url = "https://compiler.dsl-platform.com:8443/platform/download/dsl-compiler.zip"

  val zis = new java.util.zip.ZipInputStream(
    new java.io.BufferedInputStream(
    new java.net.URL(url).openStream()))

  val firstEntry = zis.getNextEntry
  assert(firstEntry.getName == "dsl-compiler.exe")

  val expectedLength = firstEntry.getSize.toInt

  val buffer = new Array[Byte](1 << 20)
  val tempFile = java.util.UUID.randomUUID + ".exe"

  val bis = new java.io.BufferedInputStream(zis)
  val fos = new java.io.FileOutputStream(tempFile)

  def slurp(soFar: Int = 0): Int = {
    val toRead = math.min(expectedLength - soFar, buffer.length)
    if (toRead > 0) {
      val read = bis.read(buffer, 0, toRead)
      if (read != -1) {
        fos.write(buffer, 0, read)
        val total = soFar + read
        println(s"Wrote $total bytes ...")
        slurp(total)
      } else {
        soFar
      }
    } else {
      soFar
    }
  }

  val size = slurp()
  assert(size == expectedLength, "Size mismatch!")
  bis.close()
  fos.close()

  (tempFile, size)
}

def testVersion(tempFile: String): String = {
  import sys.process._

  val stdout = new java.io.ByteArrayOutputStream
  val stderr = new java.io.ByteArrayOutputStream
  val stdoutWriter = new java.io.PrintWriter(stdout)
  val stderrWriter = new java.io.PrintWriter(stderr)

  (if (java.io.File.separator == "/") {
    Seq("mono", tempFile)
  } else {
    Seq(tempFile)
  }) ! ProcessLogger(stdoutWriter.println, stderrWriter.println)

  stdoutWriter.close()
  stderrWriter.close()

  val VersionPattern = """(?s).*?Version: (\d+(?:\.\d+)+).*?""".r
  val VersionPattern(version) = stdout.toString
  version
}

def rename(tempFile: String, version: String) = {
  val sourceFile = new java.io.File(tempFile)
  val targetFile = new java.io.File(s"dsl-compiler-$version.exe")
  sourceFile renameTo targetFile
  println(s"Renamed to $targetFile")
}

// Clean all the things!
clean()

// Download compiler
val (tempFile, size) = download()
println(s"Wrote $tempFile ($size bytes)")

// Check version
val version = testVersion(tempFile)
println(s"Compiler version: $version")

// Rename temporary file name
rename(tempFile, version)

// Exit to OS
sys.exit(0)
