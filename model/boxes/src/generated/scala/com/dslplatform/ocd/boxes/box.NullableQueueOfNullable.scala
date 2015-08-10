package com.dslplatform.ocd
package boxes

trait `box.NullableQueueOfNullable`
    extends OcdBox {

  type boxType = `box.NullableQueueOfNullable`
  val boxClass = classOf[`box.NullableQueueOfNullable`]

  val boxName = "NullableQueueOfNullable"
  val boxNameShort = "0Q0"
  val boxAliases = Set.empty[String]

  val isOne = false
  val isNullable = true
  val singleFamily = SingleFamily.Nullable

  val isSingle = false
  val isCollection = true
  val collectionFamily = Some(CollectionFamily.Queue)

  val areElementsOne = Some(false)
  val areElementsNullable = Some(true)
  val elementFamily = Some(SingleFamily.Nullable)
}

case object `box.NullableQueueOfNullable` extends `box.NullableQueueOfNullable`
