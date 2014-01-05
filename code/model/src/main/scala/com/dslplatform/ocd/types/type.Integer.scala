package com.dslplatform.ocd
package types

trait `type.Integer`
    extends OcdType {

  def typeName = "Integer"

  def typeAliases = Set(
    "INT"
  , "INTEGER"
  , "Int"
  , "int"
  , "integer"
  )
}

case object `type.Integer` extends `type.Integer`
