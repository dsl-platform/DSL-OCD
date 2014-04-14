package com.dslplatform.ocd
package types

trait `type.Ip`
    extends OcdType {

  type typeType = `type.Ip`
  val typeClass = classOf[`type.Ip`]

  val typeName = "Ip"
  val typeNameShort = "Ip"
  val typeNameSafe = "Ip"

  val typeSingleName = "Ip"
  val typePluralName = "Ips"

  override val typeAliases = Set(
    "IP"
  , "ip"
  )
}

case object `type.Ip` extends `type.Ip`
