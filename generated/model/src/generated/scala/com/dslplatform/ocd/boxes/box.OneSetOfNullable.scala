package com.dslplatform.ocd
package boxes

trait `box.OneSetOfNullable`
    extends OcdBox {

  type boxType = `box.OneSetOfNullable`

  val boxClass = classOf[`box.OneSetOfNullable`]

  val boxName = "OneSetOfNullable"

  val isNullable = false
  val areElementsNullable = Some(true)
}

case object `box.OneSetOfNullable` extends `box.OneSetOfNullable`
