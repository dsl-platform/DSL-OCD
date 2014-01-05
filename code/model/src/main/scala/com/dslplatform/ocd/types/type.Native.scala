package com.dslplatform.ocd
package types

trait `type.Native`
    extends OcdType {

  def typeName = "Native"

  def typeAliases = Set(
    "NATIVE"
  , "native"
  )
}

case object `type.Native` extends `type.Native`
