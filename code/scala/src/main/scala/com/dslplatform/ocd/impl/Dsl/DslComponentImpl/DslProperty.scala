package com.dslplatform.ocd

trait DslPropertyStub
    extends DslRootComponent
    with DslValueComponent
    with DslPropertyType
    with DslPropertyStubPrinter {
  def tipe: DslTypeImplStub
  def name: String
  type children = DslPropertyComponent
}

trait DslPropertyComponent
    extends DslComponentImplStub
    with DslPropertyComponentType

// -----------------------------------------------------------------------------

class DslProperty(
    val tipe: DslTypeImplStub
  , val name: String
  , val components: Seq[DslPropertyComponent] = Nil
  ) extends DslPropertyStub {

  def apply(empty: Unit) =  this
}
