package com.dslplatform.ocd
package types

trait `type.Decimal(#)`
    extends OcdType {

  type typeType = `type.Decimal(#)`

  val typeClass = classOf[`type.Decimal(#)`]

  val typeName = "Decimal(#)"

  override val typeAliases = Set(
    "DECIMAL(#)"
  , "decimal(#)"
  )
}

case object `type.Decimal(#)` extends `type.Decimal(#)`
