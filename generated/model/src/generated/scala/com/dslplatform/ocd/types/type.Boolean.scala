package com.dslplatform.ocd
package types

trait `type.Boolean`
    extends OcdType {

  type typeType = `type.Boolean`

  val typeClass = classOf[`type.Boolean`]

  val typeName = "Boolean"
  val typeSingleName = "Boolean"
  val typePluralName = "Booleans"

  override val typeAliases = Set(
    "BOOL"
  , "BOOLEAN"
  , "Bool"
  , "bool"
  , "boolean"
  )
}

case object `type.Boolean` extends `type.Boolean`
