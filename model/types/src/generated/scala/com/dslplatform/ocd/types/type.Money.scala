package com.dslplatform.ocd
package types

trait `type.Money`
    extends OcdType {

  type typeType = `type.Money`
  val typeClass = classOf[`type.Money`]

  val typeName = "Money"
  val typeNameSafe = "Money"

  val typeSingleName = "Money"
  val typePluralName = "Monies"

  override val typeAliases = Set(
    "MONEY"
  , "money"
  )
}

case object `type.Money` extends `type.Money`
