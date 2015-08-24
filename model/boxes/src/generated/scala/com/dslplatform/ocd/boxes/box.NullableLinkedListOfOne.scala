package com.dslplatform.ocd
package boxes

trait `box.NullableLinkedListOfOne`
    extends OcdBox {

  type boxType = `box.NullableLinkedListOfOne`
  val boxClass = classOf[`box.NullableLinkedListOfOne`]

  val boxName = "NullableLinkedListOfOne"
  val boxNameShort = "0K1"
  val boxAliases = Set.empty[String]

  val isOne = false
  val isNullable = true
  val singleFamily = SingleFamily.Nullable

  val isSingle = false
  val isCollection = true
  val collectionFamily = Some(CollectionFamily.LinkedList)

  val areElementsOne = Some(true)
  val areElementsNullable = Some(false)
  val elementFamily = Some(SingleFamily.One)
}

case object `box.NullableLinkedListOfOne` extends `box.NullableLinkedListOfOne`
