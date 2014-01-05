package com.dslplatform.ocd
package types

trait `type.Email`
    extends OcdType {

  def typeName = "Email"

  def typeAliases = Set(
    "EMAIL"
  , "email"
  )
}

case object `type.Email` extends `type.Email`
