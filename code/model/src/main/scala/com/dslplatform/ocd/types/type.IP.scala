package com.dslplatform.ocd
package types

trait `type.IP`
    extends OcdType {

  def typeName = "IP"

  def typeAliases = Set(
    "ip"
  )
}

case object `type.IP` extends `type.IP`
