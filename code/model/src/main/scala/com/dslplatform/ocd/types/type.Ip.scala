package com.dslplatform.ocd
package types

trait `type.Ip`
    extends OcdType {

  type typeType = `type.Ip`

  val typeClass = classOf[`type.Ip`]

  val typeName = "Ip"

  override val typeAliases = Set(
    "IP"
  , "ip"
  )
}

case object `type.Ip` extends `type.Ip`
