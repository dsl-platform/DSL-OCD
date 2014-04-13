package com.dslplatform.ocd
package types

import kinds._

trait OcdType
    extends OcdKind {

  type typeType <: OcdType
  def typeClass: Class[typeType]

  def typeName: String
  def typeNameSafe: String

  def typeSingleName: String
  def typePluralName: String

  def typeAliases = Set.empty[String]
}

object OcdType
    extends OcdTypeValues
