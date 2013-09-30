package com.dslplatform

import hr.ngs.patterns._
import org.slf4j._

package object ocd
    extends com.github.nscala_time.time.Imports
    with io.jvm.uuid.Imports
    with hr.element.etb.Pimps {

  implicit class ImpaleStringOps(val name: String) extends AnyVal {
    def fciu = name.head.toUpper + name.tail
    def fcil = name.head.toLower + name.tail

    def tab = name.split("\n").map("  " +).mkString("\n")
  }

  implicit class ImpaleString(val name: String) extends AnyVal {
    def %(key: String, keys: String*) = (name, key +: keys)
  }

  implicit def dslImplPair2Property(pair: (DslTypeImplStub, String)) =
    new DslProperty(pair._1, pair._2, Nil)

  implicit def dslRawPair2Property(pair: (String, String)) =
    new DslProperty(DslRaw(pair._1), pair._2, Nil)

  lazy val Locator = ServiceLocator.locator

  type Logger = org.slf4j.Logger
  type Properties = java.util.Properties

  type Path = scalax.file.Path
  lazy val Path = scalax.file.Path
}
