package com.dslplatform.ocd
package boxes

trait `box.NullableArrayOfNullable`
    extends OcdBox {

  type boxType = `box.NullableArrayOfNullable`
  val boxClass = classOf[`box.NullableArrayOfNullable`]

  val boxName = "NullableArrayOfNullable"
  val boxAliases = Set("NullableBracketsOfNullable")

  val isOne = false
  val isNullable = true
  val singleFamily = SingleFamily.Nullable

  val isSingle = false
  val isCollection = true
  val collectionFamily = Some(CollectionFamily.Array)

  val areElementsOne = Some(false)
  val areElementsNullable = Some(true)
  val elementFamily = Some(SingleFamily.Nullable)
}

case object `box.NullableArrayOfNullable` extends `box.NullableArrayOfNullable`
