package com.dslplatform.ocd
package types

trait `type.Url`
    extends OcdType {

  def typeName = "Url"

  def typeAliases = Set(
    "URL"
  , "url"
  )
}

case object `type.Url` extends `type.Url`
