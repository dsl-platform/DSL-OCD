package com.dslplatform.ocd
package boxes

trait `box.NullableListOfNullable`
    extends OcdBox {

  type boxType = `box.NullableListOfNullable`

  val boxClass = classOf[`box.NullableListOfNullable`]

  val boxName = "NullableListOfNullable"
}

case object `box.NullableListOfNullable` extends `box.NullableListOfNullable`
