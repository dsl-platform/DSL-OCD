package com.dslplatform.ocd
package impl

import box._
import types._
import tipe._

sealed trait ScalaMoneyStub
    extends ScalaImpl
    with `tipe.Money`
    with TipeConstrainedType
    with TipeEqualsComparableType
    with TipeStableType {

  def scalaDesc = "Money"
}

case object `scala.Money` extends ScalaMoneyStub with ScalaOne {
  def scalaClass = "BigDecimal"
  def defaultValue = "BigDecimal(0)"
}

case object `scala.Money?` extends ScalaMoneyStub with ScalaOpt {
  def scalaClass = "Option[BigDecimal]"
  def defaultValue = "None"
}

case object `scala.Money[]` extends ScalaMoneyStub with ScalaArray {
  def scalaClass = "Array[BigDecimal]"
  def defaultValue = "Array.empty[BigDecimal]"
}

case object `scala.Money?[]` extends ScalaMoneyStub with ScalaArrayOpt {
  def scalaClass = "Array[Option[BigDecimal]]"
  def defaultValue = "Array.empty[Option[BigDecimal]]"
}

case object `scala.Money[]?` extends ScalaMoneyStub with ScalaOptArray {
  def scalaClass = "Option[Array[BigDecimal]]"
  def defaultValue = "None"
}

case object `scala.Money?[]?` extends ScalaMoneyStub with ScalaOptArrayOpt {
  def scalaClass = "Option[Array[Option[BigDecimal]]]"
  def defaultValue = "None"
}

case object `scala.List<Money>` extends ScalaMoneyStub with ScalaList {
  def scalaClass = "IndexedSeq[BigDecimal]"
  def defaultValue = "IndexedSeq.empty[BigDecimal]"
}

case object `scala.List<Money?>` extends ScalaMoneyStub with ScalaListOpt {
  def scalaClass = "IndexedSeq[Option[BigDecimal]]"
  def defaultValue = "IndexedSeq.empty[Option[BigDecimal]]"
}

case object `scala.List<Money>?` extends ScalaMoneyStub with ScalaOptList {
  def scalaClass = "Option[IndexedSeq[BigDecimal]]"
  def defaultValue = "None"
}

case object `scala.List<Money?>?` extends ScalaMoneyStub with ScalaOptListOpt {
  def scalaClass = "Option[IndexedSeq[Option[BigDecimal]]]"
  def defaultValue = "None"
}

case object `scala.Set<Money>` extends ScalaMoneyStub with ScalaSet {
  def scalaClass = "Set[BigDecimal]"
  def defaultValue = "Set.empty[BigDecimal]"
}

case object `scala.Set<Money?>` extends ScalaMoneyStub with ScalaSetOpt {
  def scalaClass = "Set[Option[BigDecimal]]"
  def defaultValue = "Set.empty[Option[BigDecimal]]"
}

case object `scala.Set<Money>?` extends ScalaMoneyStub with ScalaOptSet {
  def scalaClass = "Option[Set[BigDecimal]]"
  def defaultValue = "None"
}

case object `scala.Set<Money?>?` extends ScalaMoneyStub with ScalaOptSetOpt {
  def scalaClass = "Option[Set[Option[BigDecimal]]]"
  def defaultValue = "None"
}
