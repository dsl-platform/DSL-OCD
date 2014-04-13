package com.dslplatform.ocd
package types

trait `type.JsonOf<Map>`
    extends OcdType {

  type typeType = `type.JsonOf<Map>`
  val typeClass = classOf[`type.JsonOf<Map>`]

  val typeName = "JsonOf<Map>"
  val typeNameSafe = "JsonOfMap"

  val typeSingleName = "JsonOfMapKind"
  val typePluralName = "JsonsOfMapKind"

  override val typeAliases = Set(
    "JSONOF<MAP>"
  , "Jsonof<map>"
  , "jsonof<map>"
  )
}

case object `type.JsonOf<Map>` extends `type.JsonOf<Map>`
