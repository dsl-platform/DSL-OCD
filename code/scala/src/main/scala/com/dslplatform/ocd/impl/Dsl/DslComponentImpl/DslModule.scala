package com.dslplatform.ocd

trait DslModuleStub
    extends DslComponentImplStub
    with DslModuleType
    with DslModuleStubPrinter {
  def name: String
  type children = DslModuleComponentStub
}

trait DslModuleComponentStub
    extends DslComponentImplStub
    with DslModuleComponentType

// -----------------------------------------------------------------------------

object module {
  def apply(name: String) =
    new module(name, Nil)
}

class module private (
    val name: String
  , val components: Seq[DslModuleComponentStub]
  ) extends DslModuleStub {

  def apply(empty: Unit) =  this

  def apply(components: DslModuleComponentStub*) = {
    new module(name, this.components ++ components)
  }
}
