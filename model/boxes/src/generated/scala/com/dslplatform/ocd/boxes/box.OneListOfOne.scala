package com.dslplatform.ocd
package boxes

trait `box.OneListOfOne`
    extends OcdBox {

  type boxType = `box.OneListOfOne`
  val boxClass = classOf[`box.OneListOfOne`]

  val boxName = "OneListOfOne"
  val boxNameShort = "1L1"
  val boxAliases = Set.empty[String]

  val isOne = true
  val isNullable = false
  val singleFamily = SingleFamily.One

  val isSingle = false
  val isCollection = true
  val collectionFamily = Some(CollectionFamily.List)

  val areElementsOne = Some(true)
  val areElementsNullable = Some(false)
  val elementFamily = Some(SingleFamily.One)
}

case object `box.OneListOfOne` extends `box.OneListOfOne`
