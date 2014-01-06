package com.dslplatform.ocd
package types

trait `type.Long`
    extends OcdType {

  type typeType = `type.Long`

  val typeClass = classOf[`type.Long`]

  val typeName = "Long"

  override val typeAliases = Set(
    "BIGINT"
  , "BigInt"
  , "Bigint"
  , "LONG"
  , "bigint"
  , "long"
  )
}

case object `type.Long` extends `type.Long`
