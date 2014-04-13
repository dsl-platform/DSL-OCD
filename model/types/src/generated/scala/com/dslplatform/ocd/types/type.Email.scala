package com.dslplatform.ocd
package types

trait `type.Email`
    extends OcdType {

  type typeType = `type.Email`
  val typeClass = classOf[`type.Email`]

  val typeName = "Email"
  val typeNameSafe = "Email"

  val typeSingleName = "Email"
  val typePluralName = "Emails"

  override val typeAliases = Set(
    "EMAIL"
  , "email"
  )
}

case object `type.Email` extends `type.Email`
