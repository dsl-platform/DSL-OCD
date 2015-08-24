package com.dslplatform.ocd
package boxes

trait `box.OneStackOfOne`
    extends OcdBox {

  type boxType = `box.OneStackOfOne`
  val boxClass = classOf[`box.OneStackOfOne`]

  val boxName = "OneStackOfOne"
  val boxNameShort = "1C1"
  val boxAliases = Set.empty[String]

  val isOne = true
  val isNullable = false
  val singleFamily = SingleFamily.One

  val isSingle = false
  val isCollection = true
  val collectionFamily = Some(CollectionFamily.Stack)

  val areElementsOne = Some(true)
  val areElementsNullable = Some(false)
  val elementFamily = Some(SingleFamily.One)
}

case object `box.OneStackOfOne` extends `box.OneStackOfOne`
