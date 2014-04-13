package com.dslplatform.ocd
package types

trait `type.Binary`
    extends OcdType {

  type typeType = `type.Binary`
  val typeClass = classOf[`type.Binary`]

  val typeName = "Binary"
  val typeNameSafe = "Binary"

  val typeSingleName = "Binary"
  val typePluralName = "Binaries"

  override val typeAliases = Set(
    "BINARY"
  , "binary"
  )
}

case object `type.Binary` extends `type.Binary`
