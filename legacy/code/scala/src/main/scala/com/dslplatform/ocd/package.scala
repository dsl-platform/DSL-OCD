package com.dslplatform

package object ocd
    extends com.github.nscala_time.time.Imports
    with io.jvm.uuid.Imports
    with hr.element.etb.Pimps {

  lazy val Locator = config.ServiceLocator.locator

  type Logger = org.slf4j.Logger
  type Properties = java.util.Properties

  type Path = scalax.file.Path
  val Path = scalax.file.Path

  val XKCD = hr.element.etb.XKCD
  val Workspace = hr.element.etb.Workspace
}
