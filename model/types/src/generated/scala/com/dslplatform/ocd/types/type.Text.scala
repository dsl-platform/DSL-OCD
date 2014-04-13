package com.dslplatform.ocd
package types

trait `type.Text`
    extends OcdType {

  type typeType = `type.Text`
  val typeClass = classOf[`type.Text`]

  val typeName = "Text"
  val typeNameSafe = "Text"

  val typeSingleName = "Text"
  val typePluralName = "Texts"

  override val typeAliases = Set(
    "TEXT"
  , "text"
  )
}

case object `type.Text` extends `type.Text`
