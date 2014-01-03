package com.dslplatform.ocd
package impl

import box._
import types._
import tipe._

sealed trait ScalaDecimalStub
    extends ScalaImpl
    with `tipe.Decimal`
    with TipeUnconstrainedType
    with TipeEqualsComparableType
    with TipeStableType {

  def scalaDesc = "Decimal"
}

case object `scala.Decimal` extends ScalaDecimalStub with ScalaOne {
  def scalaClass = "BigDecimal"
  def defaultValue = "BigDecimal(0)"
}

case object `scala.Decimal?` extends ScalaDecimalStub with ScalaOpt {
  def scalaClass = "Option[BigDecimal]"
  def defaultValue = "None"
}

case object `scala.Decimal[]` extends ScalaDecimalStub with ScalaArray {
  def scalaClass = "Array[BigDecimal]"
  def defaultValue = "Array.empty[BigDecimal]"
}

case object `scala.Decimal?[]` extends ScalaDecimalStub with ScalaArrayOpt {
  def scalaClass = "Array[Option[BigDecimal]]"
  def defaultValue = "Array.empty[Option[BigDecimal]]"
}

case object `scala.Decimal[]?` extends ScalaDecimalStub with ScalaOptArray {
  def scalaClass = "Option[Array[BigDecimal]]"
  def defaultValue = "None"
}

case object `scala.Decimal?[]?` extends ScalaDecimalStub with ScalaOptArrayOpt {
  def scalaClass = "Option[Array[Option[BigDecimal]]]"
  def defaultValue = "None"
}

case object `scala.List<Decimal>` extends ScalaDecimalStub with ScalaList {
  def scalaClass = "IndexedSeq[BigDecimal]"
  def defaultValue = "IndexedSeq.empty[BigDecimal]"
}

case object `scala.List<Decimal?>` extends ScalaDecimalStub with ScalaListOpt {
  def scalaClass = "IndexedSeq[Option[BigDecimal]]"
  def defaultValue = "IndexedSeq.empty[Option[BigDecimal]]"
}

case object `scala.List<Decimal>?` extends ScalaDecimalStub with ScalaOptList {
  def scalaClass = "Option[IndexedSeq[BigDecimal]]"
  def defaultValue = "None"
}

case object `scala.List<Decimal?>?` extends ScalaDecimalStub with ScalaOptListOpt {
  def scalaClass = "Option[IndexedSeq[Option[BigDecimal]]]"
  def defaultValue = "None"
}

case object `scala.Set<Decimal>` extends ScalaDecimalStub with ScalaSet {
  def scalaClass = "Set[BigDecimal]"
  def defaultValue = "Set.empty[BigDecimal]"
}

case object `scala.Set<Decimal?>` extends ScalaDecimalStub with ScalaSetOpt {
  def scalaClass = "Set[Option[BigDecimal]]"
  def defaultValue = "Set.empty[Option[BigDecimal]]"
}

case object `scala.Set<Decimal>?` extends ScalaDecimalStub with ScalaOptSet {
  def scalaClass = "Option[Set[BigDecimal]]"
  def defaultValue = "None"
}

case object `scala.Set<Decimal?>?` extends ScalaDecimalStub with ScalaOptSetOpt {
  def scalaClass = "Option[Set[Option[BigDecimal]]]"
  def defaultValue = "None"
}
