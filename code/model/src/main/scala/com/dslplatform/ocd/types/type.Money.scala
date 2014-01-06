package com.dslplatform.ocd
package types

trait `type.Money`
    extends OcdType {

  type typeType = `type.Money`

  val typeClass = classOf[`type.Money`]

  val typeName = "Money"

  override val typeAliases = Set(
    "MONEY"
  , "money"
  )
}

case object `type.Money` extends `type.Money`
