package com.dslplatform.ocd
package impl

import box._
import types._
import tipe._

sealed trait ScalaStringStub
    extends ScalaImpl
    with `tipe.String`
    with TipeUnconstrainedType
    with TipePrimitiveType
    with TipeStableType {

  def scalaDesc = "String"
}

case object `scala.String` extends ScalaStringStub with ScalaOne {
  def scalaClass = "String"
  def defaultValue = "\"\""
}

case object `scala.String?` extends ScalaStringStub with ScalaOpt {
  def scalaClass = "Option[String]"
  def defaultValue = "None"
}

case object `scala.String[]` extends ScalaStringStub with ScalaArray {
  def scalaClass = "Array[String]"
  def defaultValue = "Array.empty[String]"
}

case object `scala.String?[]` extends ScalaStringStub with ScalaArrayOpt {
  def scalaClass = "Array[Option[String]]"
  def defaultValue = "Array.empty[Option[String]]"
}

case object `scala.String[]?` extends ScalaStringStub with ScalaOptArray {
  def scalaClass = "Option[Array[String]]"
  def defaultValue = "None"
}

case object `scala.String?[]?` extends ScalaStringStub with ScalaOptArrayOpt {
  def scalaClass = "Option[Array[Option[String]]]"
  def defaultValue = "None"
}

case object `scala.List<String>` extends ScalaStringStub with ScalaList {
  def scalaClass = "IndexedSeq[String]"
  def defaultValue = "IndexedSeq.empty[String]"
}

case object `scala.List<String?>` extends ScalaStringStub with ScalaListOpt {
  def scalaClass = "IndexedSeq[Option[String]]"
  def defaultValue = "IndexedSeq.empty[Option[String]]"
}

case object `scala.List<String>?` extends ScalaStringStub with ScalaOptList {
  def scalaClass = "Option[IndexedSeq[String]]"
  def defaultValue = "None"
}

case object `scala.List<String?>?` extends ScalaStringStub with ScalaOptListOpt {
  def scalaClass = "Option[IndexedSeq[Option[String]]]"
  def defaultValue = "None"
}

case object `scala.Set<String>` extends ScalaStringStub with ScalaSet {
  def scalaClass = "Set[String]"
  def defaultValue = "Set.empty[String]"
}

case object `scala.Set<String?>` extends ScalaStringStub with ScalaSetOpt {
  def scalaClass = "Set[Option[String]]"
  def defaultValue = "Set.empty[Option[String]]"
}

case object `scala.Set<String>?` extends ScalaStringStub with ScalaOptSet {
  def scalaClass = "Option[Set[String]]"
  def defaultValue = "None"
}

case object `scala.Set<String?>?` extends ScalaStringStub with ScalaOptSetOpt {
  def scalaClass = "Option[Set[Option[String]]]"
  def defaultValue = "None"
}
