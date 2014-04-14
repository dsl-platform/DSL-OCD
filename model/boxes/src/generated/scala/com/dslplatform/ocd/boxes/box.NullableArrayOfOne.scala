package com.dslplatform.ocd
package boxes

trait `box.NullableArrayOfOne`
    extends OcdBox {

  type boxType = `box.NullableArrayOfOne`
  val boxClass = classOf[`box.NullableArrayOfOne`]

  val boxName = "NullableArrayOfOne"
  val boxNameShort = "0A1"
  val boxAliases = Set("NullableBracketsOfOne")

  val isOne = false
  val isNullable = true
  val singleFamily = SingleFamily.Nullable

  val isSingle = false
  val isCollection = true
  val collectionFamily = Some(CollectionFamily.Array)

  val areElementsOne = Some(true)
  val areElementsNullable = Some(false)
  val elementFamily = Some(SingleFamily.One)
}

case object `box.NullableArrayOfOne` extends `box.NullableArrayOfOne`
