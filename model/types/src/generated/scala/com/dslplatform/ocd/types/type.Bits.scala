package com.dslplatform.ocd
package types

trait `type.Bits`
    extends OcdType {

  type typeType = `type.Bits`
  val typeClass = classOf[`type.Bits`]

  val typeName = "Bits"
  val typeNameSafe = "Bits"

  val typeSingleName = "Bits"
  val typePluralName = "Bitses"

  override val typeAliases = Set(
    "BITS"
  , "bits"
  )
}

case object `type.Bits` extends `type.Bits`
