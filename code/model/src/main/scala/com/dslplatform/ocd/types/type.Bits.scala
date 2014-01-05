package com.dslplatform.ocd
package types

trait `type.Bits`
    extends OcdType {

  def typeName = "Bits"

  def typeAliases = Set(
    "BITS"
  , "bits"
  )
}

case object `type.Bits` extends `type.Bits`
