package com.dslplatform.ocd.config

import java.io.{File => JFile}
import better.files._

object Workspace {
  def apply(localPath: String): Workspace =
    new Workspace(File(localPath))
}

case class Workspace(path: File) {
  val file = path.toJava

  def /(child: String): Workspace = new Workspace(path / child)

  def install(): this.type = {
    path.createDirectories()
    this
  }

  def install(child: String): Workspace =
    /(child).install()

  def temporary[T](f: Workspace => T): T = {
    val ws = install(XKCD.now.toString)
    try {
      f(ws)
    } finally {
      ws.uninstall()
    }
  }

  def uninstall(): Unit =
    path.delete()

  override val toString = file.getPath
}
