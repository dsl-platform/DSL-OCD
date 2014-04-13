package com.dslplatform.ocd
package boxes

trait `box.OneSetOfNullable`
    extends OcdBox {

  type boxType = `box.OneSetOfNullable`
  val boxClass = classOf[`box.OneSetOfNullable`]

  val boxName = "OneSetOfNullable"
  val boxAliases = Set.empty[String]

  val isOne = true
  val isNullable = false
  val singleFamily = SingleFamily.One

  val isSingle = false
  val isCollection = true
  val collectionFamily = Some(CollectionFamily.Set)

  val areElementsOne = Some(false)
  val areElementsNullable = Some(true)
  val elementFamily = Some(SingleFamily.Nullable)
}

case object `box.OneSetOfNullable` extends `box.OneSetOfNullable`
