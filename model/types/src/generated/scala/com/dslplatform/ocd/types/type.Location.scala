package com.dslplatform.ocd
package types

trait `type.Location`
    extends OcdType {

  type typeType = `type.Location`
  val typeClass = classOf[`type.Location`]

  val typeName = "Location"
  val typeNameShort = "Lc"
  val typeNameSafe = "Location"

  val typeSingleName = "Location"
  val typePluralName = "Locations"

  override val typeAliases = Set(
    "LOCATION"
  , "location"
  )
}

case object `type.Location` extends `type.Location`
