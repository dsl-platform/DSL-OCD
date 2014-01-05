package com.dslplatform.ocd
package types

trait `type.Date`
    extends OcdType {

  def typeName = "Date"

  def typeAliases = Set(
    "DATE"
  , "date"
  )
}

case object `type.Date` extends `type.Date`
