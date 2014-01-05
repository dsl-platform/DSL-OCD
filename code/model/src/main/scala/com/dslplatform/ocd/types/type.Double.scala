package com.dslplatform.ocd
package types

trait `type.Double`
    extends OcdType {

  def typeName = "Double"

  def typeAliases = Set(
    "DOUBLE"
  , "double"
  )
}

case object `type.Double` extends `type.Double`
