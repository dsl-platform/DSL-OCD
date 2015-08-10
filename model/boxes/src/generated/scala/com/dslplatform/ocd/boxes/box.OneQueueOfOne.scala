package com.dslplatform.ocd
package boxes

trait `box.OneQueueOfOne`
    extends OcdBox {

  type boxType = `box.OneQueueOfOne`
  val boxClass = classOf[`box.OneQueueOfOne`]

  val boxName = "OneQueueOfOne"
  val boxNameShort = "1Q1"
  val boxAliases = Set.empty[String]

  val isOne = true
  val isNullable = false
  val singleFamily = SingleFamily.One

  val isSingle = false
  val isCollection = true
  val collectionFamily = Some(CollectionFamily.Queue)

  val areElementsOne = Some(true)
  val areElementsNullable = Some(false)
  val elementFamily = Some(SingleFamily.One)
}

case object `box.OneQueueOfOne` extends `box.OneQueueOfOne`
