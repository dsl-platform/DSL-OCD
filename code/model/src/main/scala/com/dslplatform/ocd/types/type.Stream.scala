package com.dslplatform.ocd
package types

trait `type.Stream`
    extends OcdType {

  def typeName = "Stream"

  def typeAliases = Set(
    "STREAM"
  , "stream"
  )
}

case object `type.Stream` extends `type.Stream`
