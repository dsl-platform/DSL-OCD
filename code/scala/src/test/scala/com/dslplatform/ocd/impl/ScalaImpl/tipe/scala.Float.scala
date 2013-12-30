package com.dslplatform.ocd
package impl

import box._
import types._
import tipe._

sealed trait ScalaFloatStub
    extends ScalaImpl
    with `tipe.Float`
    with TipeUnconstrainedType
    with TipePrimitiveType
    with TipeStableType {

  def scalaDesc = "Float"
}

case object `scala.Float` extends ScalaFloatStub with ScalaOne {
  def scalaClass = "Float"
  def defaultValue = "0.0f"
}

case object `scala.Float?` extends ScalaFloatStub with ScalaOpt {
  def scalaClass = "Option[Float]"
  def defaultValue = "None"
}

case object `scala.Float[]` extends ScalaFloatStub with ScalaArray {
  def scalaClass = "Array[Float]"
  def defaultValue = "Array.empty[Float]"
}

case object `scala.Float?[]` extends ScalaFloatStub with ScalaArrayOpt {
  def scalaClass = "Array[Option[Float]]"
  def defaultValue = "Array.empty[Option[Float]]"
}

case object `scala.Float[]?` extends ScalaFloatStub with ScalaOptArray {
  def scalaClass = "Option[Array[Float]]"
  def defaultValue = "None"
}

case object `scala.Float?[]?` extends ScalaFloatStub with ScalaOptArrayOpt {
  def scalaClass = "Option[Array[Option[Float]]]"
  def defaultValue = "None"
}

case object `scala.List<Float>` extends ScalaFloatStub with ScalaList {
  def scalaClass = "IndexedSeq[Float]"
  def defaultValue = "IndexedSeq.empty[Float]"
}

case object `scala.List<Float?>` extends ScalaFloatStub with ScalaListOpt {
  def scalaClass = "IndexedSeq[Option[Float]]"
  def defaultValue = "IndexedSeq.empty[Option[Float]]"
}

case object `scala.List<Float>?` extends ScalaFloatStub with ScalaOptList {
  def scalaClass = "Option[IndexedSeq[Float]]"
  def defaultValue = "None"
}

case object `scala.List<Float?>?` extends ScalaFloatStub with ScalaOptListOpt {
  def scalaClass = "Option[IndexedSeq[Option[Float]]]"
  def defaultValue = "None"
}

case object `scala.Set<Float>` extends ScalaFloatStub with ScalaSet {
  def scalaClass = "Set[Float]"
  def defaultValue = "Set.empty[Float]"
}

case object `scala.Set<Float?>` extends ScalaFloatStub with ScalaSetOpt {
  def scalaClass = "Set[Option[Float]]"
  def defaultValue = "Set.empty[Option[Float]]"
}

case object `scala.Set<Float>?` extends ScalaFloatStub with ScalaOptSet {
  def scalaClass = "Option[Set[Float]]"
  def defaultValue = "None"
}

case object `scala.Set<Float?>?` extends ScalaFloatStub with ScalaOptSetOpt {
  def scalaClass = "Option[Set[Option[Float]]]"
  def defaultValue = "None"
}
