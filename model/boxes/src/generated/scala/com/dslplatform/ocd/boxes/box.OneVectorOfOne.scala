package com.dslplatform.ocd
package boxes

trait `box.OneVectorOfOne`
    extends OcdBox {

  type boxType = `box.OneVectorOfOne`
  val boxClass = classOf[`box.OneVectorOfOne`]

  val boxName = "OneVectorOfOne"
  val boxNameShort = "1V1"
  val boxAliases = Set.empty[String]

  val isOne = true
  val isNullable = false
  val singleFamily = SingleFamily.One

  val isSingle = false
  val isCollection = true
  val collectionFamily = Some(CollectionFamily.Vector)

  val areElementsOne = Some(true)
  val areElementsNullable = Some(false)
  val elementFamily = Some(SingleFamily.One)
}

case object `box.OneVectorOfOne` extends `box.OneVectorOfOne`
