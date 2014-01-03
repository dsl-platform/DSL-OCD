package com.dslplatform.ocd
package impl

import box._
import types._
import tipe._

sealed trait ScalaDoubleStub
    extends ScalaImpl
    with `tipe.Double`
    with TipeUnconstrainedType
    with TipePrimitiveType
    with TipeStableType {

  def scalaDesc = "Double"
}

case object `scala.Double` extends ScalaDoubleStub with ScalaOne {
  def scalaClass = "Double"
  def defaultValue = "0.0"
}

case object `scala.Double?` extends ScalaDoubleStub with ScalaOpt {
  def scalaClass = "Option[Double]"
  def defaultValue = "None"
}

case object `scala.Double[]` extends ScalaDoubleStub with ScalaArray {
  def scalaClass = "Array[Double]"
  def defaultValue = "Array.empty[Double]"
}

case object `scala.Double?[]` extends ScalaDoubleStub with ScalaArrayOpt {
  def scalaClass = "Array[Option[Double]]"
  def defaultValue = "Array.empty[Option[Double]]"
}

case object `scala.Double[]?` extends ScalaDoubleStub with ScalaOptArray {
  def scalaClass = "Option[Array[Double]]"
  def defaultValue = "None"
}

case object `scala.Double?[]?` extends ScalaDoubleStub with ScalaOptArrayOpt {
  def scalaClass = "Option[Array[Option[Double]]]"
  def defaultValue = "None"
}

case object `scala.List<Double>` extends ScalaDoubleStub with ScalaList {
  def scalaClass = "IndexedSeq[Double]"
  def defaultValue = "IndexedSeq.empty[Double]"
}

case object `scala.List<Double?>` extends ScalaDoubleStub with ScalaListOpt {
  def scalaClass = "IndexedSeq[Option[Double]]"
  def defaultValue = "IndexedSeq.empty[Option[Double]]"
}

case object `scala.List<Double>?` extends ScalaDoubleStub with ScalaOptList {
  def scalaClass = "Option[IndexedSeq[Double]]"
  def defaultValue = "None"
}

case object `scala.List<Double?>?` extends ScalaDoubleStub with ScalaOptListOpt {
  def scalaClass = "Option[IndexedSeq[Option[Double]]]"
  def defaultValue = "None"
}

case object `scala.Set<Double>` extends ScalaDoubleStub with ScalaSet {
  def scalaClass = "Set[Double]"
  def defaultValue = "Set.empty[Double]"
}

case object `scala.Set<Double?>` extends ScalaDoubleStub with ScalaSetOpt {
  def scalaClass = "Set[Option[Double]]"
  def defaultValue = "Set.empty[Option[Double]]"
}

case object `scala.Set<Double>?` extends ScalaDoubleStub with ScalaOptSet {
  def scalaClass = "Option[Set[Double]]"
  def defaultValue = "None"
}

case object `scala.Set<Double?>?` extends ScalaDoubleStub with ScalaOptSetOpt {
  def scalaClass = "Option[Set[Option[Double]]]"
  def defaultValue = "None"
}
