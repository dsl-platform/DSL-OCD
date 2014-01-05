package com.dslplatform.ocd
package types

trait `type.Key-Value`
    extends OcdType {

  def typeName = "Key-Value"

  def typeAliases = Set(
    "DICTIONARY"
  , "Dictionary"
  , "KEY-VALUE"
  , "MAP"
  , "Map"
  , "dictionary"
  , "key-value"
  , "map"
  )
}

case object `type.Key-Value` extends `type.Key-Value`
