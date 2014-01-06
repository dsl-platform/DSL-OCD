package com.dslplatform.ocd
package boxes

trait `box.One`
    extends OcdBox {

  type boxType = `box.One`

  val boxClass = classOf[`box.One`]

  val boxName = "One"
}

case object `box.One` extends `box.One`
