package com.dslplatform.ocd
package boxes

trait `box.Nullable`
    extends OcdBox {

  type boxType = `box.Nullable`
  val boxClass = classOf[`box.Nullable`]

  val boxName = "Nullable"
  val boxAliases = Set.empty[String]

  val isOne = false
  val isNullable = true
  val singleFamily = SingleFamily.Nullable

  val isSingle = true
  val isCollection = false
  val collectionFamily = None

  val areElementsOne = None
  val areElementsNullable = None
  val elementFamily = None
}

case object `box.Nullable` extends `box.Nullable`
