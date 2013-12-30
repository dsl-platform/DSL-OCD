package com.dslplatform.ocd
package impl

import box._
import types._
import tipe._

sealed trait ScalaMapStub
    extends ScalaImpl
    with `tipe.KeyValue`
    with TipeUnconstrainedType
    with TipeEqualsComparableType
    with TipeStableType {

  def scalaDesc = "Map"
}

case object `scala.Map` extends ScalaMapStub with ScalaOne {
  def scalaClass = "Map[String, String]"
  def defaultValue = "Map.empty[String, String]"
}

case object `scala.Map?` extends ScalaMapStub with ScalaOpt {
  def scalaClass = "Option[Map[String, String]]"
  def defaultValue = "None"
}

case object `scala.Map[]` extends ScalaMapStub with ScalaArray {
  def scalaClass = "Array[Map[String, String]]"
  def defaultValue = "Array.empty[Map[String, String]]"
}

case object `scala.Map?[]` extends ScalaMapStub with ScalaArrayOpt {
  def scalaClass = "Array[Option[Map[String, String]]]"
  def defaultValue = "Array.empty[Option[Map[String, String]]]"
}

case object `scala.Map[]?` extends ScalaMapStub with ScalaOptArray {
  def scalaClass = "Option[Array[Map[String, String]]]"
  def defaultValue = "None"
}

case object `scala.Map?[]?` extends ScalaMapStub with ScalaOptArrayOpt {
  def scalaClass = "Option[Array[Option[Map[String, String]]]]"
  def defaultValue = "None"
}

case object `scala.List<Map>` extends ScalaMapStub with ScalaList {
  def scalaClass = "IndexedSeq[Map[String, String]]"
  def defaultValue = "IndexedSeq.empty[Map[String, String]]"
}

case object `scala.List<Map?>` extends ScalaMapStub with ScalaListOpt {
  def scalaClass = "IndexedSeq[Option[Map[String, String]]]"
  def defaultValue = "IndexedSeq.empty[Option[Map[String, String]]]"
}

case object `scala.List<Map>?` extends ScalaMapStub with ScalaOptList {
  def scalaClass = "Option[IndexedSeq[Map[String, String]]]"
  def defaultValue = "None"
}

case object `scala.List<Map?>?` extends ScalaMapStub with ScalaOptListOpt {
  def scalaClass = "Option[IndexedSeq[Option[Map[String, String]]]]"
  def defaultValue = "None"
}

case object `scala.Set<Map>` extends ScalaMapStub with ScalaSet {
  def scalaClass = "Set[Map[String, String]]"
  def defaultValue = "Set.empty[Map[String, String]]"
}

case object `scala.Set<Map?>` extends ScalaMapStub with ScalaSetOpt {
  def scalaClass = "Set[Option[Map[String, String]]]"
  def defaultValue = "Set.empty[Option[Map[String, String]]]"
}

case object `scala.Set<Map>?` extends ScalaMapStub with ScalaOptSet {
  def scalaClass = "Option[Set[Map[String, String]]]"
  def defaultValue = "None"
}

case object `scala.Set<Map?>?` extends ScalaMapStub with ScalaOptSetOpt {
  def scalaClass = "Option[Set[Option[Map[String, String]]]]"
  def defaultValue = "None"
}
