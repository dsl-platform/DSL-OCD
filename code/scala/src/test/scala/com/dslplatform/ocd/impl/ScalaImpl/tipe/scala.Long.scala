package com.dslplatform.ocd
package impl

import box._
import types._
import tipe._

sealed trait ScalaLongStub
    extends ScalaImpl
    with `tipe.Long`
    with TipeUnconstrainedType
    with TipePrimitiveType
    with TipeStableType {

  def scalaDesc = "Long"
}

case object `scala.Long` extends ScalaLongStub with ScalaOne {
  def scalaClass = "Long"
  def defaultValue = "0L"
}

case object `scala.Long?` extends ScalaLongStub with ScalaOpt {
  def scalaClass = "Option[Long]"
  def defaultValue = "None"
}

case object `scala.Long[]` extends ScalaLongStub with ScalaArray {
  def scalaClass = "Array[Long]"
  def defaultValue = "Array.empty[Long]"
}

case object `scala.Long?[]` extends ScalaLongStub with ScalaArrayOpt {
  def scalaClass = "Array[Option[Long]]"
  def defaultValue = "Array.empty[Option[Long]]"
}

case object `scala.Long[]?` extends ScalaLongStub with ScalaOptArray {
  def scalaClass = "Option[Array[Long]]"
  def defaultValue = "None"
}

case object `scala.Long?[]?` extends ScalaLongStub with ScalaOptArrayOpt {
  def scalaClass = "Option[Array[Option[Long]]]"
  def defaultValue = "None"
}

case object `scala.List<Long>` extends ScalaLongStub with ScalaList {
  def scalaClass = "IndexedSeq[Long]"
  def defaultValue = "IndexedSeq.empty[Long]"
}

case object `scala.List<Long?>` extends ScalaLongStub with ScalaListOpt {
  def scalaClass = "IndexedSeq[Option[Long]]"
  def defaultValue = "IndexedSeq.empty[Option[Long]]"
}

case object `scala.List<Long>?` extends ScalaLongStub with ScalaOptList {
  def scalaClass = "Option[IndexedSeq[Long]]"
  def defaultValue = "None"
}

case object `scala.List<Long?>?` extends ScalaLongStub with ScalaOptListOpt {
  def scalaClass = "Option[IndexedSeq[Option[Long]]]"
  def defaultValue = "None"
}

case object `scala.Set<Long>` extends ScalaLongStub with ScalaSet {
  def scalaClass = "Set[Long]"
  def defaultValue = "Set.empty[Long]"
}

case object `scala.Set<Long?>` extends ScalaLongStub with ScalaSetOpt {
  def scalaClass = "Set[Option[Long]]"
  def defaultValue = "Set.empty[Option[Long]]"
}

case object `scala.Set<Long>?` extends ScalaLongStub with ScalaOptSet {
  def scalaClass = "Option[Set[Long]]"
  def defaultValue = "None"
}

case object `scala.Set<Long?>?` extends ScalaLongStub with ScalaOptSetOpt {
  def scalaClass = "Option[Set[Option[Long]]]"
  def defaultValue = "None"
}
