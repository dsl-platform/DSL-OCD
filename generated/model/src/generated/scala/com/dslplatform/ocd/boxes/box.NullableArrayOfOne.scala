package com.dslplatform.ocd
package boxes

trait `box.NullableArrayOfOne`
    extends OcdBox {

  type boxType = `box.NullableArrayOfOne`

  val boxClass = classOf[`box.NullableArrayOfOne`]

  val boxName = "NullableArrayOfOne"

  val isNullable = true
  val areElementsNullable = Some(false)

  override val boxAliases = Set(
    "NullableBracketsOfOne"
  )
}

case object `box.NullableArrayOfOne` extends `box.NullableArrayOfOne`
