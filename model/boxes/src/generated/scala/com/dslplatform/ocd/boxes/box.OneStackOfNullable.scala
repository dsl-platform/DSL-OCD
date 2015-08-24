package com.dslplatform.ocd
package boxes

trait `box.OneStackOfNullable`
    extends OcdBox {

  type boxType = `box.OneStackOfNullable`
  val boxClass = classOf[`box.OneStackOfNullable`]

  val boxName = "OneStackOfNullable"
  val boxNameShort = "1C0"
  val boxAliases = Set.empty[String]

  val isOne = true
  val isNullable = false
  val singleFamily = SingleFamily.One

  val isSingle = false
  val isCollection = true
  val collectionFamily = Some(CollectionFamily.Stack)

  val areElementsOne = Some(false)
  val areElementsNullable = Some(true)
  val elementFamily = Some(SingleFamily.Nullable)
}

case object `box.OneStackOfNullable` extends `box.OneStackOfNullable`
