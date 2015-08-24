package com.dslplatform.ocd
package boxes

trait `box.NullableLinkedListOfNullable`
    extends OcdBox {

  type boxType = `box.NullableLinkedListOfNullable`
  val boxClass = classOf[`box.NullableLinkedListOfNullable`]

  val boxName = "NullableLinkedListOfNullable"
  val boxNameShort = "0K0"
  val boxAliases = Set.empty[String]

  val isOne = false
  val isNullable = true
  val singleFamily = SingleFamily.Nullable

  val isSingle = false
  val isCollection = true
  val collectionFamily = Some(CollectionFamily.LinkedList)

  val areElementsOne = Some(false)
  val areElementsNullable = Some(true)
  val elementFamily = Some(SingleFamily.Nullable)
}

case object `box.NullableLinkedListOfNullable` extends `box.NullableLinkedListOfNullable`
