package com.dslplatform.ocd
package types

trait `type.Image`
    extends OcdType {

  type typeType = `type.Image`
  val typeClass = classOf[`type.Image`]

  val typeName = "Image"
  val typeNameShort = "Im"
  val typeNameSafe = "Image"

  val typeSingleName = "Image"
  val typePluralName = "Images"

  override val typeAliases = Set(
    "IMAGE"
  , "PICTURE"
  , "Picture"
  , "image"
  , "picture"
  )
}

case object `type.Image` extends `type.Image`
