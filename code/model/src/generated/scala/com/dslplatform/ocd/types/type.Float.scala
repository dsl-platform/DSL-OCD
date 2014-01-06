package com.dslplatform.ocd
package types

trait `type.Float`
    extends OcdType {

  type typeType = `type.Float`

  val typeClass = classOf[`type.Float`]

  val typeName = "Float"

  override val typeAliases = Set(
    "FLOAT"
  , "float"
  )
}

case object `type.Float` extends `type.Float`
