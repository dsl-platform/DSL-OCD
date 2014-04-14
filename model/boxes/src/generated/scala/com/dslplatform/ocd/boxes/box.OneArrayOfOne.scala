package com.dslplatform.ocd
package boxes

trait `box.OneArrayOfOne`
    extends OcdBox {

  type boxType = `box.OneArrayOfOne`
  val boxClass = classOf[`box.OneArrayOfOne`]

  val boxName = "OneArrayOfOne"
  val boxNameShort = "1A1"
  val boxAliases = Set("OneBracketsOfOne")

  val isOne = true
  val isNullable = false
  val singleFamily = SingleFamily.One

  val isSingle = false
  val isCollection = true
  val collectionFamily = Some(CollectionFamily.Array)

  val areElementsOne = Some(true)
  val areElementsNullable = Some(false)
  val elementFamily = Some(SingleFamily.One)
}

case object `box.OneArrayOfOne` extends `box.OneArrayOfOne`
