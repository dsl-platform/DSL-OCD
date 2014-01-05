package com.dslplatform.ocd
package types

trait `type.Location`
    extends OcdType {

  def typeName = "Location"

  def typeAliases = Set(
    "LOCATION"
  , "location"
  )
}

case object `type.Location` extends `type.Location`
