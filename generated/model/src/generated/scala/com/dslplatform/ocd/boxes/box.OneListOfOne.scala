package com.dslplatform.ocd
package boxes

trait `box.OneListOfOne`
    extends OcdBox {

  type boxType = `box.OneListOfOne`

  val boxClass = classOf[`box.OneListOfOne`]

  val boxName = "OneListOfOne"

  val isNullable = false
  val areElementsNullable = Some(false)
}

case object `box.OneListOfOne` extends `box.OneListOfOne`
