package com.dslplatform.ocd
package boxes

trait `box.OneListOfNullable`
    extends OcdBox {

  type boxType = `box.OneListOfNullable`

  val boxClass = classOf[`box.OneListOfNullable`]

  val boxName = "OneListOfNullable"
}

case object `box.OneListOfNullable` extends `box.OneListOfNullable`
