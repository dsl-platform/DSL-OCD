package com.dslplatform.ocd
package impl

package dsl {

import printer._
import types._

trait DslPropertyStub
    extends DslRootComponent
    with DslValueComponent
    with DslPropertyType
    with DslPropertyStubPrinter {
  def tipe: DslImpl
  def name: String
  type children = DslPropertyComponent
}

// -----------------------------------------------------------------------------
}

import dsl._

object DslProperty extends Dynamic {
  def apply(tipe: DslImpl, name: String) =
    new DslProperty(tipe, name, None) {
      def apply(unit: Unit) =
        new DslProperty(tipe, name, Some(Nil))

      def apply(components: DslPropertyComponent*) =
        new DslProperty(tipe, name, Some(components))
    }

  def selectDynamic(tipe: DslImpl, name: String) =
    new DslProperty(tipe, name, None)

  def applyDynamic(tipe: DslImpl, name: String)(components: DslPropertyComponent*) =
    new DslProperty(tipe, name, Some(components))
}

class DslProperty private[impl] (
    val tipe: DslImpl
  , val name: String
  , val components: Option[Seq[DslPropertyComponent]]
) extends DslPropertyStub
