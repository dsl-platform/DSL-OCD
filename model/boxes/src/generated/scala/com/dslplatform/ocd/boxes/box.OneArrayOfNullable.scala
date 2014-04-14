package com.dslplatform.ocd
package boxes

trait `box.OneArrayOfNullable`
    extends OcdBox {

  type boxType = `box.OneArrayOfNullable`
  val boxClass = classOf[`box.OneArrayOfNullable`]

  val boxName = "OneArrayOfNullable"
  val boxNameShort = "1A0"
  val boxAliases = Set("OneBracketsOfNullable")

  val isOne = true
  val isNullable = false
  val singleFamily = SingleFamily.One

  val isSingle = false
  val isCollection = true
  val collectionFamily = Some(CollectionFamily.Array)

  val areElementsOne = Some(false)
  val areElementsNullable = Some(true)
  val elementFamily = Some(SingleFamily.Nullable)
}

case object `box.OneArrayOfNullable` extends `box.OneArrayOfNullable`
