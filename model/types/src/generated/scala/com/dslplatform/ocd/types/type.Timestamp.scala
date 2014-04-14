package com.dslplatform.ocd
package types

trait `type.Timestamp`
    extends OcdType {

  type typeType = `type.Timestamp`
  val typeClass = classOf[`type.Timestamp`]

  val typeName = "Timestamp"
  val typeNameShort = "Ts"
  val typeNameSafe = "Timestamp"

  val typeSingleName = "Timestamp"
  val typePluralName = "Timestamps"

  override val typeAliases = Set(
    "DATETIME"
  , "DateTime"
  , "Datetime"
  , "TIMESTAMP"
  , "datetime"
  , "timestamp"
  )
}

case object `type.Timestamp` extends `type.Timestamp`
