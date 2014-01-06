package com.dslplatform.ocd
package types

trait `type.Time`
    extends OcdType {

  type typeType = `type.Time`

  val typeClass = classOf[`type.Time`]

  val typeName = "Time"

  override val typeAliases = Set(
    "TIME"
  , "time"
  )
}

case object `type.Time` extends `type.Time`
