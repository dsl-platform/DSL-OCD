package com.dslplatform.ocd
package boxes

trait `box.OneArrayOfNullable`
    extends OcdBox {

  def boxName = "OneArrayOfNullable"

  def boxAliases = Set(
    "OneBracketsOfNullable"
  )
}

case object `box.OneArrayOfNullable` extends `box.OneArrayOfNullable`
