package com.dslplatform.ocd
package boxes

trait `box.One`
    extends OcdBox {

  type boxType = `box.One`

  val boxClass = classOf[`box.One`]

  val boxName = "One"

  val isNullable = false
  val areElementsNullable = None
}

case object `box.One` extends `box.One`
