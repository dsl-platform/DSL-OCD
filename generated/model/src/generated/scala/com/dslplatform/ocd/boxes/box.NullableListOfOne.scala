package com.dslplatform.ocd
package boxes

trait `box.NullableListOfOne`
    extends OcdBox {

  type boxType = `box.NullableListOfOne`

  val boxClass = classOf[`box.NullableListOfOne`]

  val boxName = "NullableListOfOne"

  val isNullable = true
  val areElementsNullable = Some(false)
}

case object `box.NullableListOfOne` extends `box.NullableListOfOne`
