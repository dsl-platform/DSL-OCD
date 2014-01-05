package com.dslplatform.ocd
package types

trait `type.Binary`
    extends OcdType {

  def typeName = "Binary"

  def typeAliases = Set(
    "BINARY"
  , "binary"
  )
}

case object `type.Binary` extends `type.Binary`
