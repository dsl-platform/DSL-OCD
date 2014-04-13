package com.dslplatform.ocd
package types

trait `type.Long`
    extends OcdType {

  type typeType = `type.Long`
  val typeClass = classOf[`type.Long`]

  val typeName = "Long"
  val typeNameSafe = "Long"

  val typeSingleName = "Long"
  val typePluralName = "Longs"

  override val typeAliases = Set(
    "LONG"
  , "long"
  )
}

case object `type.Long` extends `type.Long`
