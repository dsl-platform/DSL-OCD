package com.dslplatform.ocd
package boxes

trait `box.NullableStackOfOne`
    extends OcdBox {

  type boxType = `box.NullableStackOfOne`
  val boxClass = classOf[`box.NullableStackOfOne`]

  val boxName = "NullableStackOfOne"
  val boxNameShort = "0C1"
  val boxAliases = Set.empty[String]

  val isOne = false
  val isNullable = true
  val singleFamily = SingleFamily.Nullable

  val isSingle = false
  val isCollection = true
  val collectionFamily = Some(CollectionFamily.Stack)

  val areElementsOne = Some(true)
  val areElementsNullable = Some(false)
  val elementFamily = Some(SingleFamily.One)
}

case object `box.NullableStackOfOne` extends `box.NullableStackOfOne`
