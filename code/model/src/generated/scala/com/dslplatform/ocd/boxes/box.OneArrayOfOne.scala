package com.dslplatform.ocd
package boxes

trait `box.OneArrayOfOne`
    extends OcdBox {

  type boxType = `box.OneArrayOfOne`

  val boxClass = classOf[`box.OneArrayOfOne`]

  val boxName = "OneArrayOfOne"

  override val boxAliases = Set(
    "OneBracketsOfOne"
  )
}

case object `box.OneArrayOfOne` extends `box.OneArrayOfOne`
