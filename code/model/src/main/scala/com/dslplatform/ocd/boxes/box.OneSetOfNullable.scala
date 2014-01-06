package com.dslplatform.ocd
package boxes

trait `box.OneSetOfNullable`
    extends OcdBox {

  type boxType = `box.OneSetOfNullable`

  val boxClass = classOf[`box.OneSetOfNullable`]

  val boxName = "OneSetOfNullable"
}

case object `box.OneSetOfNullable` extends `box.OneSetOfNullable`
