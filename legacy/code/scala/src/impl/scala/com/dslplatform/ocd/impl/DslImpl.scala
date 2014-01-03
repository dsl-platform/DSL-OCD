package com.dslplatform.ocd
package impl

trait DslImpl
    extends OcdImpl
    with types.box.BoxOnenessType
    with types.box.BoxNullnessType
    with types.tipe.TipeConstrainessType
    with types.`lang.DSL`
    with dsl.printer.DslImplPrinter
    with Dynamic {

  def dslDesc: String

  def apply(name: String) =
    DslProperty(this, name)

  def selectDynamic(name: String) =
    DslProperty(this, name)

  def applyDynamic(name: String)(components: dsl.DslPropertyComponent*) =
    DslProperty(this, name)(components: _*)

  def ->(name: String) =
    DslProperty(this, name)
}
