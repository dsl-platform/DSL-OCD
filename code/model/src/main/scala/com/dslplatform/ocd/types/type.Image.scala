package com.dslplatform.ocd
package types

trait `type.Image`
    extends OcdType {

  def typeName = "Image"

  def typeAliases = Set(
    "IMAGE"
  , "PICTURE"
  , "Picture"
  , "image"
  , "picture"
  )
}

case object `type.Image` extends `type.Image`
