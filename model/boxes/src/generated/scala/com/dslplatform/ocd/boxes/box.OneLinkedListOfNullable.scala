package com.dslplatform.ocd
package boxes

trait `box.OneLinkedListOfNullable`
    extends OcdBox {

  type boxType = `box.OneLinkedListOfNullable`
  val boxClass = classOf[`box.OneLinkedListOfNullable`]

  val boxName = "OneLinkedListOfNullable"
  val boxNameShort = "1K0"
  val boxAliases = Set.empty[String]

  val isOne = true
  val isNullable = false
  val singleFamily = SingleFamily.One

  val isSingle = false
  val isCollection = true
  val collectionFamily = Some(CollectionFamily.LinkedList)

  val areElementsOne = Some(false)
  val areElementsNullable = Some(true)
  val elementFamily = Some(SingleFamily.Nullable)
}

case object `box.OneLinkedListOfNullable` extends `box.OneLinkedListOfNullable`
