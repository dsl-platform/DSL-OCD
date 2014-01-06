package com.dslplatform.ocd
package types

trait `type.Phone`
    extends OcdType {

  type typeType = `type.Phone`

  val typeClass = classOf[`type.Phone`]

  val typeName = "Phone"

  override val typeAliases = Set(
    "PHONE"
  , "phone"
  )
}

case object `type.Phone` extends `type.Phone`
