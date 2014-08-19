package com.dslplatform.ocd
package types

trait `type.Rectangle`
    extends OcdType {

  type typeType = `type.Rectangle`
  val typeClass = classOf[`type.Rectangle`]

  val typeName = "Rectangle"
  val typeNameShort = "Re"
  val typeNameSafe = "Rectangle"

  val typeSingleName = "Rectangle"
  val typePluralName = "Rectangles"

  override val typeAliases = Set(
    "BOX"
  , "Box"
  , "RECTANGLE"
  , "box"
  , "rectangle"
  )
}

case object `type.Rectangle` extends `type.Rectangle`
