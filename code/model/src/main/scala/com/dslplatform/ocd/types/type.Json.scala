package com.dslplatform.ocd
package types

trait `type.Json`
    extends OcdType {

  def typeName = "Json"

  def typeAliases = Set(
    "JSON"
  , "json"
  )
}

case object `type.Json` extends `type.Json`
