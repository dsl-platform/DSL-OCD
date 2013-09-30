package com.dslplatform.ocd

trait DslValueStub
    extends DslModuleComponentStub
    with DslValueType
    with DslValueStubPrinter {
  def name: String
  type children = DslValueComponent
}

trait DslValueComponent
    extends DslComponentImplStub
    with DslValueComponentType

// -----------------------------------------------------------------------------

object value {
  def apply(name: String) =
    new value(name, Nil)
}

class value private(
    val name: String
  , val components: Seq[DslValueComponent] = Nil
  ) extends DslValueStub {

  def apply(empty: Unit) =  this

  def apply(components: DslValueComponent*) = {
    new value(name, this.components ++ components)
  }
}
