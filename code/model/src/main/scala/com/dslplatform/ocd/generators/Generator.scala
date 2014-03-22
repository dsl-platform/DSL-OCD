package com.dslplatform.ocd.generators

import scalax.file._

trait Generator {
  private val config = (Path(
    sys.props("user.home").replace('\\', '/'), '/'
  ) / ".config" / "DSL-OCD" / "ocd.config").string

  private val generated =
    "generated=(.*)".r.findFirstMatchIn(config).get.group(1).trim

  private val gene = Path(generated, '/') /
    "model" /
    "src"/ "generated" / "scala" / "com" / "dslplatform" / "ocd"

  def spawnDirectory(name: String) = {
    val root = gene / name

    if (root.isDirectory) {
      println(s"Cleaning directory: ${root.path} ...")
      root.*** foreach(_.delete(true))
    }
    else {
      println(s"Creating directory: ${root.path} ...")
      root.createDirectory(true, true)
    }

    root
  }

  def generate(): Unit
}
