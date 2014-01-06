package com.dslplatform.ocd
package types

trait `type.Image`
    extends OcdType {

  type typeType = `type.Image`

  val typeClass = classOf[`type.Image`]

  val typeName = "Image"

  override val typeAliases = Set(
    "IMAGE"
  , "PICTURE"
  , "Picture"
  , "image"
  , "picture"
  )
}

case object `type.Image` extends `type.Image`
