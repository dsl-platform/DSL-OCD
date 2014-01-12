package com.dslplatform.ocd
package types

trait `type.Phone`
    extends OcdType {

  type typeType = `type.Phone`

  val typeClass = classOf[`type.Phone`]

  val typeName = "Phone"
  val typeSingleName = "Phone"
  val typePluralName = "Phones"

  override val typeAliases = Set(
    "PHONE"
  , "phone"
  )
}

case object `type.Phone` extends `type.Phone`
