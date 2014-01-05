package com.dslplatform.ocd
package types

trait `type.Timestamp`
    extends OcdType {

  def typeName = "Timestamp"

  def typeAliases = Set(
    "DATETIME"
  , "DateTime"
  , "Datetime"
  , "TIMESTAMP"
  , "datetime"
  , "timestamp"
  )
}

case object `type.Timestamp` extends `type.Timestamp`
