package com.dslplatform.ocd
package boxes

trait `box.NullableArrayOfOne`
    extends OcdBox {

  def boxName = "NullableArrayOfOne"

  def boxAliases = Set(
    "NullableBracketsOfOne"
  )
}

case object `box.NullableArrayOfOne` extends `box.NullableArrayOfOne`
