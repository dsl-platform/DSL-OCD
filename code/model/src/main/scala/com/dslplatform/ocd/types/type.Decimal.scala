package com.dslplatform.ocd
package types

trait `type.Decimal`
    extends OcdType {

  def typeName = "Decimal"

  def typeAliases = Set(
    "DECIMAL"
  , "decimal"
  )
}

case object `type.Decimal` extends `type.Decimal`
