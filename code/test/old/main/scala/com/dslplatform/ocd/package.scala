package com.dslplatform

package object ocd
    extends com.github.nscala_time.time.Imports
    with io.jvm.uuid.Imports
    with hr.element.etb.Pimps {

  lazy val Locator = config.ServiceLocator.locator

  type Files = Map[String, String]

  type Logger = org.slf4j.Logger
  type Properties = java.util.Properties

  type Path = scalax.file.Path
  val Path = scalax.file.Path

  val XKCD = hr.element.etb.XKCD
  val Workspace = hr.element.etb.Workspace

  implicit class RichString(val value: String) extends AnyVal {
    def fciu = value.head.toUpper + value.tail
    def fcil = value.head.toLower + value.tail
  }

  implicit val ec = scala.concurrent.ExecutionContext.fromExecutor(
    java.util.concurrent.Executors.newCachedThreadPool
  )
}
