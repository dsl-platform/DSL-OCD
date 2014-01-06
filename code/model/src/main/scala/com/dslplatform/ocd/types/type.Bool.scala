package com.dslplatform.ocd
package types

trait `type.Bool`
    extends OcdType {

  type typeType = `type.Bool`

  val typeClass = classOf[`type.Bool`]

  val typeName = "Bool"

  override val typeAliases = Set(
    "BOOL"
  , "BOOLEAN"
  , "Boolean"
  , "bool"
  , "boolean"
  )
}

case object `type.Bool` extends `type.Bool`
