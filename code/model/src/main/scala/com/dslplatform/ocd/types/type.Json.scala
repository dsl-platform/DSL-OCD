package com.dslplatform.ocd
package types

trait `type.Json`
    extends OcdType {

  type typeType = `type.Json`

  val typeClass = classOf[`type.Json`]

  val typeName = "Json"

  override val typeAliases = Set(
    "JSON"
  , "json"
  )
}

case object `type.Json` extends `type.Json`
