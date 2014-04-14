package com.dslplatform.ocd
package boxes

trait `box.One`
    extends OcdBox {

  type boxType = `box.One`
  val boxClass = classOf[`box.One`]

  val boxName = "One"
  val boxNameShort = "1"
  val boxAliases = Set.empty[String]

  val isOne = true
  val isNullable = false
  val singleFamily = SingleFamily.One

  val isSingle = true
  val isCollection = false
  val collectionFamily = None

  val areElementsOne = None
  val areElementsNullable = None
  val elementFamily = None
}

case object `box.One` extends `box.One`
