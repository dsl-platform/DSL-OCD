package com.dslplatform.ocd
package types

trait `type.Url`
    extends OcdType {

  def typeName = "Url"

  def typeAliases = Set(
    "LINK"
  , "Link"
  , "URL"
  , "link"
  , "url"
  )
}

case object `type.Url` extends `type.Url`
