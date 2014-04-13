package com.dslplatform.ocd
package boxes

trait `box.NullableSetOfNullable`
    extends OcdBox {

  type boxType = `box.NullableSetOfNullable`
  val boxClass = classOf[`box.NullableSetOfNullable`]

  val boxName = "NullableSetOfNullable"
  val boxAliases = Set.empty[String]

  val isOne = false
  val isNullable = true
  val singleFamily = SingleFamily.Nullable

  val isSingle = false
  val isCollection = true
  val collectionFamily = Some(CollectionFamily.Set)

  val areElementsOne = Some(false)
  val areElementsNullable = Some(true)
  val elementFamily = Some(SingleFamily.Nullable)
}

case object `box.NullableSetOfNullable` extends `box.NullableSetOfNullable`
