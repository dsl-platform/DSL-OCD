package com.dslplatform.ocd
package boxes

trait `box.NullableSetOfNullable`
    extends OcdBox {

  type boxType = `box.NullableSetOfNullable`

  val boxClass = classOf[`box.NullableSetOfNullable`]

  val boxName = "NullableSetOfNullable"

  val isNullable = true
  val areElementsNullable = Some(true)
}

case object `box.NullableSetOfNullable` extends `box.NullableSetOfNullable`
