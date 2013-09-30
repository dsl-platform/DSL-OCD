package com.dslplatform.ocd

trait DslComponentImplStub
    extends OcdImpl
    with DslConceptType
    with DslComponentImplPrinter {

  type children <: DslComponentImplStub
  def components: Seq[children]
}
