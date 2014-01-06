package com.dslplatform.ocd
package boxes

trait `box.NullableArrayOfNullable`
    extends OcdBox {

  type boxType = `box.NullableArrayOfNullable`

  val boxClass = classOf[`box.NullableArrayOfNullable`]

  val boxName = "NullableArrayOfNullable"

  override val boxAliases = Set(
    "NullableBracketsOfNullable"
  )
}

case object `box.NullableArrayOfNullable` extends `box.NullableArrayOfNullable`
