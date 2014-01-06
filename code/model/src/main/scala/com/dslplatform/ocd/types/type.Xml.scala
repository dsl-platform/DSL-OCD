package com.dslplatform.ocd
package types

trait `type.Xml`
    extends OcdType {

  type typeType = `type.Xml`

  val typeClass = classOf[`type.Xml`]

  val typeName = "Xml"

  override val typeAliases = Set(
    "XML"
  , "xml"
  )
}

case object `type.Xml` extends `type.Xml`
