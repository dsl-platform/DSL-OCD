package com.dslplatform.ocd
package types

trait `type.Money`
    extends OcdType {

  def typeName = "Money"

  def typeAliases = Set(
    "MONEY"
  , "money"
  )
}

case object `type.Money` extends `type.Money`
