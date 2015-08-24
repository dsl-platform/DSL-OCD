package com.dslplatform.ocd
package boxes

trait `box.OneLinkedListOfOne`
    extends OcdBox {

  type boxType = `box.OneLinkedListOfOne`
  val boxClass = classOf[`box.OneLinkedListOfOne`]

  val boxName = "OneLinkedListOfOne"
  val boxNameShort = "1K1"
  val boxAliases = Set.empty[String]

  val isOne = true
  val isNullable = false
  val singleFamily = SingleFamily.One

  val isSingle = false
  val isCollection = true
  val collectionFamily = Some(CollectionFamily.LinkedList)

  val areElementsOne = Some(true)
  val areElementsNullable = Some(false)
  val elementFamily = Some(SingleFamily.One)
}

case object `box.OneLinkedListOfOne` extends `box.OneLinkedListOfOne`
