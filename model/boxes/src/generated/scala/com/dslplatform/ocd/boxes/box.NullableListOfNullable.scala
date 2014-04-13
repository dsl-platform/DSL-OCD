package com.dslplatform.ocd
package boxes

trait `box.NullableListOfNullable`
    extends OcdBox {

  type boxType = `box.NullableListOfNullable`
  val boxClass = classOf[`box.NullableListOfNullable`]

  val boxName = "NullableListOfNullable"
  val boxAliases = Set.empty[String]

  val isOne = false
  val isNullable = true
  val singleFamily = SingleFamily.Nullable

  val isSingle = false
  val isCollection = true
  val collectionFamily = Some(CollectionFamily.List)

  val areElementsOne = Some(false)
  val areElementsNullable = Some(true)
  val elementFamily = Some(SingleFamily.Nullable)
}

case object `box.NullableListOfNullable` extends `box.NullableListOfNullable`
