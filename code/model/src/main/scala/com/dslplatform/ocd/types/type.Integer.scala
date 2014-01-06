package com.dslplatform.ocd
package types

trait `type.Integer`
    extends OcdType {

  type typeType = `type.Integer`

  val typeClass = classOf[`type.Integer`]

  val typeName = "Integer"

  override val typeAliases = Set(
    "INT"
  , "INTEGER"
  , "Int"
  , "int"
  , "integer"
  )
}

case object `type.Integer` extends `type.Integer`
