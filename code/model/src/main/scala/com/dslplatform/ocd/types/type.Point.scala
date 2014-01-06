package com.dslplatform.ocd
package types

trait `type.Point`
    extends OcdType {

  type typeType = `type.Point`

  val typeClass = classOf[`type.Point`]

  val typeName = "Point"

  override val typeAliases = Set(
    "POINT"
  , "point"
  )
}

case object `type.Point` extends `type.Point`
