package com.dslplatform.ocd
package impl

import box._
import types._
import tipe._

sealed trait ScalaBinaryStub
    extends ScalaImpl
    with `tipe.Binary`
    with TipeUnconstrainedType
    with TipeSpecialEqualsType
    with TipeStableType {

  def scalaDesc = "Binary"
}

case object `scala.Binary` extends ScalaBinaryStub with ScalaOne {
  def scalaClass = "Array[Byte]"
  def defaultValue = "Array.empty[Byte]"
}

case object `scala.Binary?` extends ScalaBinaryStub with ScalaOpt {
  def scalaClass = "Option[Array[Byte]]"
  def defaultValue = "None"
}

case object `scala.Binary[]` extends ScalaBinaryStub with ScalaArray {
  def scalaClass = "Array[Array[Byte]]"
  def defaultValue = "Array.empty[Array[Byte]]"
}

case object `scala.Binary?[]` extends ScalaBinaryStub with ScalaArrayOpt {
  def scalaClass = "Array[Option[Array[Byte]]]"
  def defaultValue = "Array.empty[Option[Array[Byte]]]"
}

case object `scala.Binary[]?` extends ScalaBinaryStub with ScalaOptArray {
  def scalaClass = "Option[Array[Array[Byte]]]"
  def defaultValue = "None"
}

case object `scala.Binary?[]?` extends ScalaBinaryStub with ScalaOptArrayOpt {
  def scalaClass = "Option[Array[Option[Array[Byte]]]]"
  def defaultValue = "None"
}

case object `scala.List<Binary>` extends ScalaBinaryStub with ScalaList {
  def scalaClass = "IndexedSeq[Array[Byte]]"
  def defaultValue = "IndexedSeq.empty[Array[Byte]]"
}

case object `scala.List<Binary?>` extends ScalaBinaryStub with ScalaListOpt {
  def scalaClass = "IndexedSeq[Option[Array[Byte]]]"
  def defaultValue = "IndexedSeq.empty[Option[Array[Byte]]]"
}

case object `scala.List<Binary>?` extends ScalaBinaryStub with ScalaOptList {
  def scalaClass = "Option[IndexedSeq[Array[Byte]]]"
  def defaultValue = "None"
}

case object `scala.List<Binary?>?` extends ScalaBinaryStub with ScalaOptListOpt {
  def scalaClass = "Option[IndexedSeq[Option[Array[Byte]]]]"
  def defaultValue = "None"
}

case object `scala.Set<Binary>` extends ScalaBinaryStub with ScalaSet {
  def scalaClass = "Set[Array[Byte]]"
  def defaultValue = "Set.empty[Array[Byte]]"
}

case object `scala.Set<Binary?>` extends ScalaBinaryStub with ScalaSetOpt {
  def scalaClass = "Set[Option[Array[Byte]]]"
  def defaultValue = "Set.empty[Option[Array[Byte]]]"
}

case object `scala.Set<Binary>?` extends ScalaBinaryStub with ScalaOptSet {
  def scalaClass = "Option[Set[Array[Byte]]]"
  def defaultValue = "None"
}

case object `scala.Set<Binary?>?` extends ScalaBinaryStub with ScalaOptSetOpt {
  def scalaClass = "Option[Set[Option[Array[Byte]]]]"
  def defaultValue = "None"
}
