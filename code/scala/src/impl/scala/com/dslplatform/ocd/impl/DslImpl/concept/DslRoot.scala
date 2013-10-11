package com.dslplatform.ocd
package impl

package dsl {

import printer._
import types._

trait DslRootStub
    extends DslModuleComponent
    with DslAggregateRootType
    with DslRootStubPrinter {

  def name: String
  def header: DslRootHeader
  type children = DslRootComponent
}

trait DslRootComponent
    extends DslComponent
    with DslAggregateRootComponentType

// -----------------------------------------------------------------------------

sealed trait DslRootHeader
    extends OcdDsl
    with DslRootHeaderPrinter

case object StandardRootHeader
    extends DslRootHeader
    with DslStandardAggregateRootType {

  def dslDesc = "root"
}

case object BigRootHeader
    extends DslRootHeader
    with DslBigAggregateRootType {

  def dslDesc = "big root"
}

case object GUIDRootHeader
    extends DslRootHeader
    with DslGuidAggregateRootType {

  def dslDesc = "guid root"
}

case class KeysRootHeader(keys: Seq[String])
    extends DslRootHeader
    with DslNonSurrogateAggregateRootType {

  def dslDesc = "root(%s)" format keys.mkString(", ")
}

// -----------------------------------------------------------------------------
}

import dsl._

object root
    extends rootBuilder(StandardRootHeader) {

  def apply(name: String)(keys: String*) =
    new root(name, KeysRootHeader(keys), None) {
      def apply(unit: Unit) =
        new root(name, header, Some(Nil))

      def apply(components: DslRootComponent*) =
        new root(name, header, Some(components))
    }

//  def applyDynamic(name: String)(keys: String*)(components: DslRootComponent*) =
//    new root(name, KeysRootHeader(keys), Some(components))
}

class rootBuilder(val header: DslRootHeader)
    extends Dynamic {

  def apply(name: String) =
    new root(name, header, None) {
      def apply(unit: Unit) =
        new root(name, header, Some(Nil))

      def apply(components: DslRootComponent*) =
        new root(name, header, Some(components))
    }

  def selectDynamic(name: String) =
    new root(name, header, None)

  def applyDynamic(name: String)(components: DslRootComponent*) =
    new root(name, header, Some(components))
}

class root private[impl] (
  val name: String
, val header: DslRootHeader
, val components: Option[Seq[DslRootComponent]]
) extends DslRootStub

object big {
  def root = new rootBuilder(BigRootHeader)
}

object guid {
  def root = new rootBuilder(GUIDRootHeader)
}
