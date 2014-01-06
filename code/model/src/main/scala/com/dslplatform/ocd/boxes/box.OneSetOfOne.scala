package com.dslplatform.ocd
package boxes

trait `box.OneSetOfOne`
    extends OcdBox {

  type boxType = `box.OneSetOfOne`

  val boxClass = classOf[`box.OneSetOfOne`]

  val boxName = "OneSetOfOne"
}

case object `box.OneSetOfOne` extends `box.OneSetOfOne`
