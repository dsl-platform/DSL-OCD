package com.dslplatform.ocd
package types

trait `type.Url`
    extends OcdType {

  type typeType = `type.Url`

  val typeClass = classOf[`type.Url`]

  val typeName = "Url"

  override val typeAliases = Set(
    "LINK"
  , "Link"
  , "URL"
  , "link"
  , "url"
  )
}

case object `type.Url` extends `type.Url`
