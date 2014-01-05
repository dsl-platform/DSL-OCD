package com.dslplatform.ocd
package types

trait `type.Float`
    extends OcdType {

  def typeName = "Float"

  def typeAliases = Set(
    "FLOAT"
  , "float"
  )
}

case object `type.Float` extends `type.Float`
