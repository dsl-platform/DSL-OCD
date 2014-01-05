package com.dslplatform.ocd
package types

trait `type.Phone`
    extends OcdType {

  def typeName = "Phone"

  def typeAliases = Set(
    "PHONE"
  , "phone"
  )
}

case object `type.Phone` extends `type.Phone`
