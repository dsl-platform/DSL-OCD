package com.dslplatform.ocd
package impl
package dsl

import printer._
import types._

trait DslComponent
    extends OcdImpl
    with DslConceptType
    with DslComponentPrinter {

  type children <: DslComponent
  def components: Option[Seq[children]]

  def dslDesc = toString
}
