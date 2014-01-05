package com.dslplatform.ocd
package types

trait `type.Guid`
    extends OcdType {

  def typeName = "Guid"

  def typeAliases = Set(
    "GUID"
  , "UUID"
  , "Uuid"
  , "guid"
  , "uuid"
  )
}

case object `type.Guid` extends `type.Guid`
