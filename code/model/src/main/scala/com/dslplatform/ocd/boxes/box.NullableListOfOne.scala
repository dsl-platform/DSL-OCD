package com.dslplatform.ocd
package boxes

trait `box.NullableListOfOne`
    extends OcdBox {

  type boxType = `box.NullableListOfOne`

  val boxClass = classOf[`box.NullableListOfOne`]

  val boxName = "NullableListOfOne"
}

case object `box.NullableListOfOne` extends `box.NullableListOfOne`
