package com.dslplatform.ocd
package generator

import java.util.Properties

import better.files._

trait Generator {
  private val props = {
    val tmp = new Properties()
    val config = File(sys.props("user.home")) /
      ".config" / "DSL-OCD" / "ocd.config"
    config.inputStream apply { tmp.load }
    tmp
  }

  private val generated = props.getProperty("model")

  private def gene(name: String, language: String) = File(generated) /
    name / "src" / "generated" / language / "com" / "dslplatform" / "ocd"

  def spawnDirectory(name: String, language: String) = {
    val pack = name.replaceAll("-", "")
    val root = gene(name, language) / pack

    if (root.isDirectory) {
      println(s"Cleaning directory: ${root.path} ...")
      root.list.foreach(_.delete())
    } else {
      println(s"Creating directory: ${root.path} ...")
      root.createDirectories()
    }

    root
  }

  def generate(): Unit
}
