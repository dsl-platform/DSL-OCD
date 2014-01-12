package com.dslplatform.ocd
package boxes

trait `box.OneArrayOfOne`
    extends OcdBox {

  type boxType = `box.OneArrayOfOne`

  val boxClass = classOf[`box.OneArrayOfOne`]

  val boxName = "OneArrayOfOne"

  val isNullable = false
  val areElementsNullable = Some(false)

  override val boxAliases = Set(
    "OneBracketsOfOne"
  )
}

case object `box.OneArrayOfOne` extends `box.OneArrayOfOne`
