package com.dslplatform.ocd
package types

trait OcdType {
  type typeType <: OcdType

  val typeClass: Class[typeType]

  val typeName: String
  val typeNameSafe: String

  val typeSingleName: String
  val typePluralName: String

  val typeAliases = Set.empty[String]
}

object OcdType
    extends OcdTypeValues
