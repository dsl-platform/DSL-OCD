package com.dslplatform.ocd
package impl

import box._
import types._
import tipe._

sealed trait ScalaBooleanStub
    extends ScalaImpl
    with `tipe.Bool`
    with TipeUnconstrainedType
    with TipePrimitiveType
    with TipeStableType {

  def scalaDesc = "Boolean"
}

case object `scala.Boolean` extends ScalaBooleanStub with ScalaOne {
  def scalaClass = "Boolean"
  def defaultValue = "false"
}

case object `scala.Boolean?` extends ScalaBooleanStub with ScalaOpt {
  def scalaClass = "Option[Boolean]"
  def defaultValue = "None"
}

case object `scala.Boolean[]` extends ScalaBooleanStub with ScalaArray {
  def scalaClass = "Array[Boolean]"
  def defaultValue = "Array.empty[Boolean]"
}

case object `scala.Boolean?[]` extends ScalaBooleanStub with ScalaArrayOpt {
  def scalaClass = "Array[Option[Boolean]]"
  def defaultValue = "Array.empty[Option[Boolean]]"
}

case object `scala.Boolean[]?` extends ScalaBooleanStub with ScalaOptArray {
  def scalaClass = "Option[Array[Boolean]]"
  def defaultValue = "None"
}

case object `scala.Boolean?[]?` extends ScalaBooleanStub with ScalaOptArrayOpt {
  def scalaClass = "Option[Array[Option[Boolean]]]"
  def defaultValue = "None"
}

case object `scala.List<Boolean>` extends ScalaBooleanStub with ScalaList {
  def scalaClass = "IndexedSeq[Boolean]"
  def defaultValue = "IndexedSeq.empty[Boolean]"
}

case object `scala.List<Boolean?>` extends ScalaBooleanStub with ScalaListOpt {
  def scalaClass = "IndexedSeq[Option[Boolean]]"
  def defaultValue = "IndexedSeq.empty[Option[Boolean]]"
}

case object `scala.List<Boolean>?` extends ScalaBooleanStub with ScalaOptList {
  def scalaClass = "Option[IndexedSeq[Boolean]]"
  def defaultValue = "None"
}

case object `scala.List<Boolean?>?` extends ScalaBooleanStub with ScalaOptListOpt {
  def scalaClass = "Option[IndexedSeq[Option[Boolean]]]"
  def defaultValue = "None"
}

case object `scala.Set<Boolean>` extends ScalaBooleanStub with ScalaSet {
  def scalaClass = "Set[Boolean]"
  def defaultValue = "Set.empty[Boolean]"
}

case object `scala.Set<Boolean?>` extends ScalaBooleanStub with ScalaSetOpt {
  def scalaClass = "Set[Option[Boolean]]"
  def defaultValue = "Set.empty[Option[Boolean]]"
}

case object `scala.Set<Boolean>?` extends ScalaBooleanStub with ScalaOptSet {
  def scalaClass = "Option[Set[Boolean]]"
  def defaultValue = "None"
}

case object `scala.Set<Boolean?>?` extends ScalaBooleanStub with ScalaOptSetOpt {
  def scalaClass = "Option[Set[Option[Boolean]]]"
  def defaultValue = "None"
}
