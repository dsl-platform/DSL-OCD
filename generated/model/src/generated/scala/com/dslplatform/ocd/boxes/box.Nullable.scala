package com.dslplatform.ocd
package boxes

trait `box.Nullable`
    extends OcdBox {

  type boxType = `box.Nullable`

  val boxClass = classOf[`box.Nullable`]

  val boxName = "Nullable"

  val isNullable = true
  val areElementsNullable = None
}

case object `box.Nullable` extends `box.Nullable`
