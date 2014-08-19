package com.dslplatform.ocd
package types

trait `type.Guid`
    extends OcdType {

  type typeType = `type.Guid`
  val typeClass = classOf[`type.Guid`]

  val typeName = "Guid"
  val typeNameShort = "Gu"
  val typeNameSafe = "Guid"

  val typeSingleName = "Guid"
  val typePluralName = "Guids"

  override val typeAliases = Set(
    "GUID"
  , "UUID"
  , "Uuid"
  , "guid"
  , "uuid"
  )
}

case object `type.Guid` extends `type.Guid`
