package com.dslplatform.ocd
package impl

package dsl {

import printer._
import types._

trait DslModuleStub
    extends DslComponent
    with DslModuleType
    with DslModuleStubPrinter {
  def name: String
  type children = DslModuleComponent
}

trait DslModuleComponent
    extends DslComponent
    with DslModuleComponentType

// -----------------------------------------------------------------------------
}

import dsl._

object module extends Dynamic {
  def apply(name: String) =
    new module(name, None) {
      def apply(unit: Unit) =
        new module(name, Some(Nil))

      def apply(components: DslModuleComponent*) =
        new module(name, Some(components))
    }

  def selectDynamic(name: String) =
    new module(name, None)

  def applyDynamic(name: String)(components: DslModuleComponent*) =
    new module(name, Some(components))
}

class module private[impl] (
  val name: String
, val components: Option[Seq[DslModuleComponent]]
) extends DslModuleStub
