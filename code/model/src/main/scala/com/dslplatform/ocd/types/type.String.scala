package com.dslplatform.ocd
package types

trait `type.String`
    extends OcdType {

  def typeName = "String"

  def typeAliases = Set(
    "STRING"
  , "string"
  )
}

case object `type.String` extends `type.String`
