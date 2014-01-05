package com.dslplatform.ocd
package types

trait `type.Map`
    extends OcdType {

  def typeName = "Map"

  def typeAliases = Set(
    "DICTIONARY"
  , "Dictionary"
  , "MAP"
  , "dictionary"
  , "map"
  )
}

case object `type.Map` extends `type.Map`
