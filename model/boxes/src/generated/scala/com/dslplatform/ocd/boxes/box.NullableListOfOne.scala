package com.dslplatform.ocd
package boxes

trait `box.NullableListOfOne`
    extends OcdBox {

  type boxType = `box.NullableListOfOne`
  val boxClass = classOf[`box.NullableListOfOne`]

  val boxName = "NullableListOfOne"
  val boxAliases = Set.empty[String]

  val isOne = false
  val isNullable = true
  val singleFamily = SingleFamily.Nullable

  val isSingle = false
  val isCollection = true
  val collectionFamily = Some(CollectionFamily.List)

  val areElementsOne = Some(true)
  val areElementsNullable = Some(false)
  val elementFamily = Some(SingleFamily.One)
}

case object `box.NullableListOfOne` extends `box.NullableListOfOne`
