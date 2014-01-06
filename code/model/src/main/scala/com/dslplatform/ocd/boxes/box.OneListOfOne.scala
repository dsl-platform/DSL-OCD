package com.dslplatform.ocd
package boxes

trait `box.OneListOfOne`
    extends OcdBox {

  type boxType = `box.OneListOfOne`

  val boxClass = classOf[`box.OneListOfOne`]

  val boxName = "OneListOfOne"
}

case object `box.OneListOfOne` extends `box.OneListOfOne`
