package com.dslplatform.ocd
package boxes

trait `box.NullableStackOfNullable`
    extends OcdBox {

  type boxType = `box.NullableStackOfNullable`
  val boxClass = classOf[`box.NullableStackOfNullable`]

  val boxName = "NullableStackOfNullable"
  val boxNameShort = "0C0"
  val boxAliases = Set.empty[String]

  val isOne = false
  val isNullable = true
  val singleFamily = SingleFamily.Nullable

  val isSingle = false
  val isCollection = true
  val collectionFamily = Some(CollectionFamily.Stack)

  val areElementsOne = Some(false)
  val areElementsNullable = Some(true)
  val elementFamily = Some(SingleFamily.Nullable)
}

case object `box.NullableStackOfNullable` extends `box.NullableStackOfNullable`
