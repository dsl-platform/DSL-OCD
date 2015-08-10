package com.dslplatform.ocd
package boxes

trait `box.NullableQueueOfOne`
    extends OcdBox {

  type boxType = `box.NullableQueueOfOne`
  val boxClass = classOf[`box.NullableQueueOfOne`]

  val boxName = "NullableQueueOfOne"
  val boxNameShort = "0Q1"
  val boxAliases = Set.empty[String]

  val isOne = false
  val isNullable = true
  val singleFamily = SingleFamily.Nullable

  val isSingle = false
  val isCollection = true
  val collectionFamily = Some(CollectionFamily.Queue)

  val areElementsOne = Some(true)
  val areElementsNullable = Some(false)
  val elementFamily = Some(SingleFamily.One)
}

case object `box.NullableQueueOfOne` extends `box.NullableQueueOfOne`
