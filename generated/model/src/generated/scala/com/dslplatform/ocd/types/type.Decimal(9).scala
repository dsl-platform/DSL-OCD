package com.dslplatform.ocd
package types

trait `type.Decimal(9)`
    extends OcdType {

  type typeType = `type.Decimal(9)`

  val typeClass = classOf[`type.Decimal(9)`]

  val typeName = "Decimal(9)"
  val typeSingleName = "DecimalWithScaleOf9"
  val typePluralName = "DecimalsWithScaleOf9"

  override val typeAliases = Set(
    "DECIMAL(9)"
  , "decimal(9)"
  )
}

case object `type.Decimal(9)` extends `type.Decimal(9)`
