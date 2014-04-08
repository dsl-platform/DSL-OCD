package com.dslplatform.ocd
package boxes

trait OcdBox {
  type boxType <: OcdBox
  val boxClass: Class[boxType]
  val boxName: String

  val boxAliases = Set.empty[String]

  val isNullable: Boolean
  val isCollection: Boolean

  val collectionType: Option[CollectionType]
  val areElementsNullable: Option[Boolean]
}

object OcdBox
    extends OcdBoxValues
