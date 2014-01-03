package com.dslplatform.ocd
package impl

package dsl {

import printer._
import types._

trait DslPropertyComponent
    extends DslComponent
    with DslPropertyComponentType
    with DslPropertyComponentPrinter {
  def body: String
  type children = DslPropertyComponent
  val components = None
}

class StringlyTypedDslPropertyComponent(val body: String)
    extends DslPropertyComponent

// -----------------------------------------------------------------------------
}

import dsl._

case object Indexed
    extends { val body = "Indexed" } with DslPropertyComponent

case object Unique
    extends { val body = "Unique" } with DslPropertyComponent

case object Sequence
    extends { val body = "Sequence" } with DslPropertyComponent
