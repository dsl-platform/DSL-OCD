package com.dslplatform.ocd
package boxes

trait `box.OneArrayOfOne`
    extends OcdBox {

  def boxName = "OneArrayOfOne"

  def boxAliases = Set(
    "OneBracketsOfOne"
  )
}

case object `box.OneArrayOfOne` extends `box.OneArrayOfOne`
