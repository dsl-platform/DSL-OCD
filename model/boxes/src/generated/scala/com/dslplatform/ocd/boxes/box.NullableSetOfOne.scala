package com.dslplatform.ocd
package boxes

trait `box.NullableSetOfOne`
    extends OcdBox {

  type boxType = `box.NullableSetOfOne`
  val boxClass = classOf[`box.NullableSetOfOne`]

  val boxName = "NullableSetOfOne"
  val boxAliases = Set.empty[String]

  val isOne = false
  val isNullable = true
  val singleFamily = SingleFamily.Nullable

  val isSingle = false
  val isCollection = true
  val collectionFamily = Some(CollectionFamily.Set)

  val areElementsOne = Some(true)
  val areElementsNullable = Some(false)
  val elementFamily = Some(SingleFamily.One)
}

case object `box.NullableSetOfOne` extends `box.NullableSetOfOne`
