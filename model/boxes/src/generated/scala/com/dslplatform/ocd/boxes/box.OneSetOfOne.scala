package com.dslplatform.ocd
package boxes

trait `box.OneSetOfOne`
    extends OcdBox {

  type boxType = `box.OneSetOfOne`
  val boxClass = classOf[`box.OneSetOfOne`]

  val boxName = "OneSetOfOne"
  val boxNameShort = "1S1"
  val boxAliases = Set.empty[String]

  val isOne = true
  val isNullable = false
  val singleFamily = SingleFamily.One

  val isSingle = false
  val isCollection = true
  val collectionFamily = Some(CollectionFamily.Set)

  val areElementsOne = Some(true)
  val areElementsNullable = Some(false)
  val elementFamily = Some(SingleFamily.One)
}

case object `box.OneSetOfOne` extends `box.OneSetOfOne`
