package com.dslplatform.ocd
package types

trait `type.Stream`
    extends OcdType {

  type typeType = `type.Stream`

  val typeClass = classOf[`type.Stream`]

  val typeName = "Stream"
  val typeSingleName = "Stream"
  val typePluralName = "Streams"

  override val typeAliases = Set(
    "STREAM"
  , "stream"
  )
}

case object `type.Stream` extends `type.Stream`
