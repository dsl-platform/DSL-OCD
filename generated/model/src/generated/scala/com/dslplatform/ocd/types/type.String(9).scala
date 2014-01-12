package com.dslplatform.ocd
package types

trait `type.String(9)`
    extends OcdType {

  type typeType = `type.String(9)`

  val typeClass = classOf[`type.String(9)`]

  val typeName = "String(9)"
  val typeSingleName = "StringWithMaxLengthOf9"
  val typePluralName = "StringsWithMaxLengthOf9"

  override val typeAliases = Set(
    "STRING(9)"
  , "string(9)"
  )
}

case object `type.String(9)` extends `type.String(9)`
