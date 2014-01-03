package com.dslplatform.ocd
package impl

import box._
import types._
import tipe._

sealed trait ScalaIntStub
    extends ScalaImpl
    with `tipe.Integer`
    with TipeUnconstrainedType
    with TipePrimitiveType
    with TipeStableType {

  def scalaDesc = "Int"
}

case object `scala.Int` extends ScalaIntStub with ScalaOne {
  def scalaClass = "Int"
  def defaultValue = "0"
}

case object `scala.Int?` extends ScalaIntStub with ScalaOpt {
  def scalaClass = "Option[Int]"
  def defaultValue = "None"
}

case object `scala.Int[]` extends ScalaIntStub with ScalaArray {
  def scalaClass = "Array[Int]"
  def defaultValue = "Array.empty[Int]"
}

case object `scala.Int?[]` extends ScalaIntStub with ScalaArrayOpt {
  def scalaClass = "Array[Option[Int]]"
  def defaultValue = "Array.empty[Option[Int]]"
}

case object `scala.Int[]?` extends ScalaIntStub with ScalaOptArray {
  def scalaClass = "Option[Array[Int]]"
  def defaultValue = "None"
}

case object `scala.Int?[]?` extends ScalaIntStub with ScalaOptArrayOpt {
  def scalaClass = "Option[Array[Option[Int]]]"
  def defaultValue = "None"
}

case object `scala.List<Int>` extends ScalaIntStub with ScalaList {
  def scalaClass = "IndexedSeq[Int]"
  def defaultValue = "IndexedSeq.empty[Int]"
}

case object `scala.List<Int?>` extends ScalaIntStub with ScalaListOpt {
  def scalaClass = "IndexedSeq[Option[Int]]"
  def defaultValue = "IndexedSeq.empty[Option[Int]]"
}

case object `scala.List<Int>?` extends ScalaIntStub with ScalaOptList {
  def scalaClass = "Option[IndexedSeq[Int]]"
  def defaultValue = "None"
}

case object `scala.List<Int?>?` extends ScalaIntStub with ScalaOptListOpt {
  def scalaClass = "Option[IndexedSeq[Option[Int]]]"
  def defaultValue = "None"
}

case object `scala.Set<Int>` extends ScalaIntStub with ScalaSet {
  def scalaClass = "Set[Int]"
  def defaultValue = "Set.empty[Int]"
}

case object `scala.Set<Int?>` extends ScalaIntStub with ScalaSetOpt {
  def scalaClass = "Set[Option[Int]]"
  def defaultValue = "Set.empty[Option[Int]]"
}

case object `scala.Set<Int>?` extends ScalaIntStub with ScalaOptSet {
  def scalaClass = "Option[Set[Int]]"
  def defaultValue = "None"
}

case object `scala.Set<Int?>?` extends ScalaIntStub with ScalaOptSetOpt {
  def scalaClass = "Option[Set[Option[Int]]]"
  def defaultValue = "None"
}
