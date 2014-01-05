package com.dslplatform.ocd
package types

trait `type.Time`
    extends OcdType {

  def typeName = "Time"

  def typeAliases = Set(
    "TIME"
  , "time"
  )
}

case object `type.Time` extends `type.Time`
