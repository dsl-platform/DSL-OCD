package com.dslplatform.ocd
package types

trait `type.Text`
    extends OcdType {

  def typeName = "Text"

  def typeAliases = Set(
    "TEXT"
  , "text"
  )
}

case object `type.Text` extends `type.Text`
