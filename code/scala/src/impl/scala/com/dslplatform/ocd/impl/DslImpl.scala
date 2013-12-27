package com.dslplatform.ocd
package impl

import types.{ box => tbox }
import dsl._

trait DslImpl
    extends OcdImpl
    with tbox.BoxOnenessType
    with tbox.BoxNullnessType
    with tipe.TipeConstrainessType
    with `lang.DSL`
    with dsl.printer.DslImplPrinter
    with Dynamic {

  def dslDesc: String

  def apply(name: String) =
    DslProperty(this, name)

  def selectDynamic(name: String) =
    DslProperty(this, name)

  def applyDynamic(name: String)(components: DslPropertyComponent*) =
    DslProperty(this, name)(components: _*)

  def ->(name: String) =
    DslProperty(this, name)
}
