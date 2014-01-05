package com.dslplatform.ocd
package types

trait `type.Bool`
    extends OcdType {

  def typeName = "Bool"

  def typeAliases = Set(
    "BOOL"
  , "BOOLEAN"
  , "Boolean"
  , "bool"
  , "boolean"
  )
}

case object `type.Bool` extends `type.Bool`
