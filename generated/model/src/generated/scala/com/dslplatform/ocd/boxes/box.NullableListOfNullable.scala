package com.dslplatform.ocd
package boxes

trait `box.NullableListOfNullable`
    extends OcdBox {

  type boxType = `box.NullableListOfNullable`

  val boxClass = classOf[`box.NullableListOfNullable`]

  val boxName = "NullableListOfNullable"

  val isNullable = true
  val areElementsNullable = Some(true)
}

case object `box.NullableListOfNullable` extends `box.NullableListOfNullable`
