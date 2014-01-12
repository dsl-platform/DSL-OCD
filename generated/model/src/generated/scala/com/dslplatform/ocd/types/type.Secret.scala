package com.dslplatform.ocd
package types

trait `type.Secret`
    extends OcdType {

  type typeType = `type.Secret`

  val typeClass = classOf[`type.Secret`]

  val typeName = "Secret"
  val typeSingleName = "Secret"
  val typePluralName = "Secrets"

  override val typeAliases = Set(
    "SECRET"
  , "secret"
  )
}

case object `type.Secret` extends `type.Secret`
