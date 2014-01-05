package com.dslplatform.ocd
package types

trait `type.Secret`
    extends OcdType {

  def typeName = "Secret"

  def typeAliases = Set(
    "SECRET"
  , "secret"
  )
}

case object `type.Secret` extends `type.Secret`
