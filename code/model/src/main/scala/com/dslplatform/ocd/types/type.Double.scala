package com.dslplatform.ocd
package types

trait `type.Double`
    extends OcdType {

  type typeType = `type.Double`

  val typeClass = classOf[`type.Double`]

  val typeName = "Double"

  override val typeAliases = Set(
    "DOUBLE"
  , "double"
  )
}

case object `type.Double` extends `type.Double`
