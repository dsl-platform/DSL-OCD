package com.dslplatform.ocd
package types

trait `type.Map`
    extends OcdType {

  type typeType = `type.Map`

  val typeClass = classOf[`type.Map`]

  val typeName = "Map"

  override val typeAliases = Set(
    "DICTIONARY"
  , "Dictionary"
  , "MAP"
  , "dictionary"
  , "map"
  )
}

case object `type.Map` extends `type.Map`
