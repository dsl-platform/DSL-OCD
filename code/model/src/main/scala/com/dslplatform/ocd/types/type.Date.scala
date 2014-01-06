package com.dslplatform.ocd
package types

trait `type.Date`
    extends OcdType {

  type typeType = `type.Date`

  val typeClass = classOf[`type.Date`]

  val typeName = "Date"

  override val typeAliases = Set(
    "DATE"
  , "date"
  )
}

case object `type.Date` extends `type.Date`
