package com.dslplatform.ocd
package types

trait `type.String`
    extends OcdType {

  type typeType = `type.String`

  val typeClass = classOf[`type.String`]

  val typeName = "String"

  override val typeAliases = Set(
    "STRING"
  , "string"
  )
}

case object `type.String` extends `type.String`
