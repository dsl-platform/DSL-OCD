package com.dslplatform.ocd

trait DslRootStub
    extends DslModuleComponentStub
    with DslAggregateRootType
    with DslRootStubPrinter {
  def name: String
  def header: DslRootHeader
  type children = DslRootComponent
}

trait DslRootComponent
    extends DslComponentImplStub
    with DslAggregateRootComponentType

// -----------------------------------------------------------------------------

sealed trait DslRootHeader
case object RootHeader extends DslRootHeader with DslIntAggregateRootType
case object BigRootHeader extends DslRootHeader with DslBigAggregateRootType
case object UUIDRootHeader extends DslRootHeader with DslGuidAggregateRootType
case class KeysRootHeader(keys: Seq[String]) extends DslRootHeader with DslNonSurrogateAggregateRootType

// -----------------------------------------------------------------------------

object big {
  def root(name: String) =
    new root(name, BigRootHeader, Nil)
}

object uuid {
  def root(name: String) =
    new root(name, UUIDRootHeader, Nil)
}

object root {
  def apply(name: String) =
    new root(name, RootHeader, Nil)

  def apply(nameWithKeys: (String, Seq[String])) =
    new root(
     nameWithKeys._1
   , KeysRootHeader(nameWithKeys._2)
   , Nil
   )
}

class root (
    val name: String
  , val header: DslRootHeader
  , val components: Seq[DslRootComponent]
  ) extends DslRootStub {

  def apply(empty: Unit) =  this

  def apply(components: DslRootComponent*) = {
    new root(name, header, this.components ++ components)
  }
}
