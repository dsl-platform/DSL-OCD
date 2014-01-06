package com.dslplatform.ocd
package types

trait `type.Native`
    extends OcdType {

  type typeType = `type.Native`

  val typeClass = classOf[`type.Native`]

  val typeName = "Native"

  override val typeAliases = Set(
    "NATIVE"
  , "native"
  )
}

case object `type.Native` extends `type.Native`
