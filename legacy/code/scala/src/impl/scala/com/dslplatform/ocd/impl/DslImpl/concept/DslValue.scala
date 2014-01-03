package com.dslplatform.ocd
package impl

package dsl {

import printer._
import types._

trait DslValueStub
    extends DslModuleComponent
    with DslValueType
    with DslValueStubPrinter {
  def name: String
  type children = DslValueComponent
}

trait DslValueComponent
    extends DslComponent
    with DslValueComponentType

// -----------------------------------------------------------------------------
}

import dsl._

object value extends Dynamic {
  def apply(name: String) =
    new value(name, None) {
      def apply(unit: Unit) =
        new value(name, Some(Nil))

      def apply(components: DslValueComponent*) =
        new value(name, Some(components))
    }

  def selectDynamic(name: String) =
    new value(name, None)

  def applyDynamic(name: String)(components: DslValueComponent*) =
    new value(name, Some(components))
}

class value private (
  val name: String
, val components: Option[Seq[DslValueComponent]]
) extends DslValueStub
