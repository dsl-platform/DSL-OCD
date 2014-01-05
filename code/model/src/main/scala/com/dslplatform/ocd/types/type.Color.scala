package com.dslplatform.ocd
package types

trait `type.Color`
    extends OcdType {

  def typeName = "Color"

  def typeAliases = Set(
    "COLOR"
  , "color"
  )
}

case object `type.Color` extends `type.Color`
