package com.dslplatform.ocd
package boxes

trait `box.NullableSetOfOne`
    extends OcdBox {

  type boxType = `box.NullableSetOfOne`

  val boxClass = classOf[`box.NullableSetOfOne`]

  val boxName = "NullableSetOfOne"

  val isNullable = true
  val areElementsNullable = Some(false)
}

case object `box.NullableSetOfOne` extends `box.NullableSetOfOne`
