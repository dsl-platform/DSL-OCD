package com.dslplatform.ocd
package types

trait `type.Rectangle`
    extends OcdType {

  def typeName = "Rectangle"

  def typeAliases = Set(
    "BOX"
  , "Box"
  , "RECTANGLE"
  , "box"
  , "rectangle"
  )
}

case object `type.Rectangle` extends `type.Rectangle`
