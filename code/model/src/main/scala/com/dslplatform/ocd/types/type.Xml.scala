package com.dslplatform.ocd
package types

trait `type.Xml`
    extends OcdType {

  def typeName = "Xml"

  def typeAliases = Set(
    "XML"
  , "xml"
  )
}

case object `type.Xml` extends `type.Xml`
