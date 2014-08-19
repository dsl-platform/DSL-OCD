package com.dslplatform.ocd
package types

trait `type.Color`
    extends OcdType {

  type typeType = `type.Color`
  val typeClass = classOf[`type.Color`]

  val typeName = "Color"
  val typeNameShort = "Co"
  val typeNameSafe = "Color"

  val typeSingleName = "Color"
  val typePluralName = "Colors"

  override val typeAliases = Set(
    "COLOR"
  , "color"
  )
}

case object `type.Color` extends `type.Color`
