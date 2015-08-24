package com.dslplatform.ocd
package boxes

trait `box.OneVectorOfNullable`
    extends OcdBox {

  type boxType = `box.OneVectorOfNullable`
  val boxClass = classOf[`box.OneVectorOfNullable`]

  val boxName = "OneVectorOfNullable"
  val boxNameShort = "1V0"
  val boxAliases = Set.empty[String]

  val isOne = true
  val isNullable = false
  val singleFamily = SingleFamily.One

  val isSingle = false
  val isCollection = true
  val collectionFamily = Some(CollectionFamily.Vector)

  val areElementsOne = Some(false)
  val areElementsNullable = Some(true)
  val elementFamily = Some(SingleFamily.Nullable)
}

case object `box.OneVectorOfNullable` extends `box.OneVectorOfNullable`
