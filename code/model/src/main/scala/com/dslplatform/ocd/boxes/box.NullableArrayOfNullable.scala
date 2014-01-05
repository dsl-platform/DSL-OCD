package com.dslplatform.ocd
package boxes

trait `box.NullableArrayOfNullable`
    extends OcdBox {

  def boxName = "NullableArrayOfNullable"

  def boxAliases = Set(
    "NullableBracketsOfNullable"
  )
}

case object `box.NullableArrayOfNullable` extends `box.NullableArrayOfNullable`
