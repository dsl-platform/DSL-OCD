package com.dslplatform.ocd
package types

trait `type.Map`
    extends OcdType {

  type typeType = `type.Map`
  val typeClass = classOf[`type.Map`]

  val typeName = "Map"
  val typeNameSafe = "Map"

  val typeSingleName = "Map"
  val typePluralName = "Maps"

  override val typeAliases = Set(
    "DICTIONARY"
  , "Dictionary"
  , "MAP"
  , "dictionary"
  , "map"
  )
}

case object `type.Map` extends `type.Map`
