package com.dslplatform.ocd
package types

trait `type.Point`
    extends OcdType {

  def typeName = "Point"

  def typeAliases = Set(
    "POINT"
  , "point"
  )
}

case object `type.Point` extends `type.Point`
