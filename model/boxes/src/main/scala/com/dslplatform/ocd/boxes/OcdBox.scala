package com.dslplatform.ocd
package boxes

trait OcdBox {
  type boxType <: OcdBox
  val boxClass: Class[boxType]

  val boxName: String
  val boxAliases: Set[String]

  val isOne: Boolean
  val isNullable: Boolean
  val singleFamily: SingleFamily

  val isSingle: Boolean
  val isCollection: Boolean
  val collectionFamily: Option[CollectionFamily]

  val areElementsOne: Option[Boolean]
  val areElementsNullable: Option[Boolean]
  val elementFamily: Option[SingleFamily]
}

object OcdBox
    extends OcdBoxValues
