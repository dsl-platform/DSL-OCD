package com.dslplatform.ocd
package boxes

trait `box.NullableVectorOfOne`
    extends OcdBox {

  type boxType = `box.NullableVectorOfOne`
  val boxClass = classOf[`box.NullableVectorOfOne`]

  val boxName = "NullableVectorOfOne"
  val boxNameShort = "0V1"
  val boxAliases = Set.empty[String]

  val isOne = false
  val isNullable = true
  val singleFamily = SingleFamily.Nullable

  val isSingle = false
  val isCollection = true
  val collectionFamily = Some(CollectionFamily.Vector)

  val areElementsOne = Some(true)
  val areElementsNullable = Some(false)
  val elementFamily = Some(SingleFamily.One)
}

case object `box.NullableVectorOfOne` extends `box.NullableVectorOfOne`
