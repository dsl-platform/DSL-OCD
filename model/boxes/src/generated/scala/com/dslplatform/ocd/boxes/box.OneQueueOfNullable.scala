package com.dslplatform.ocd
package boxes

trait `box.OneQueueOfNullable`
    extends OcdBox {

  type boxType = `box.OneQueueOfNullable`
  val boxClass = classOf[`box.OneQueueOfNullable`]

  val boxName = "OneQueueOfNullable"
  val boxNameShort = "1Q0"
  val boxAliases = Set.empty[String]

  val isOne = true
  val isNullable = false
  val singleFamily = SingleFamily.One

  val isSingle = false
  val isCollection = true
  val collectionFamily = Some(CollectionFamily.Queue)

  val areElementsOne = Some(false)
  val areElementsNullable = Some(true)
  val elementFamily = Some(SingleFamily.Nullable)
}

case object `box.OneQueueOfNullable` extends `box.OneQueueOfNullable`
