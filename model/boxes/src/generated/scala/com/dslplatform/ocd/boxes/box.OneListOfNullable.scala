package com.dslplatform.ocd
package boxes

trait `box.OneListOfNullable`
    extends OcdBox {

  type boxType = `box.OneListOfNullable`
  val boxClass = classOf[`box.OneListOfNullable`]

  val boxName = "OneListOfNullable"
  val boxNameShort = "1L0"
  val boxAliases = Set.empty[String]

  val isOne = true
  val isNullable = false
  val singleFamily = SingleFamily.One

  val isSingle = false
  val isCollection = true
  val collectionFamily = Some(CollectionFamily.List)

  val areElementsOne = Some(false)
  val areElementsNullable = Some(true)
  val elementFamily = Some(SingleFamily.Nullable)
}

case object `box.OneListOfNullable` extends `box.OneListOfNullable`
