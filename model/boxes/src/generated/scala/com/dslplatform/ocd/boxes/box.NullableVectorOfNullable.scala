package com.dslplatform.ocd
package boxes

trait `box.NullableVectorOfNullable`
    extends OcdBox {

  type boxType = `box.NullableVectorOfNullable`
  val boxClass = classOf[`box.NullableVectorOfNullable`]

  val boxName = "NullableVectorOfNullable"
  val boxNameShort = "0V0"
  val boxAliases = Set.empty[String]

  val isOne = false
  val isNullable = true
  val singleFamily = SingleFamily.Nullable

  val isSingle = false
  val isCollection = true
  val collectionFamily = Some(CollectionFamily.Vector)

  val areElementsOne = Some(false)
  val areElementsNullable = Some(true)
  val elementFamily = Some(SingleFamily.Nullable)
}

case object `box.NullableVectorOfNullable` extends `box.NullableVectorOfNullable`
