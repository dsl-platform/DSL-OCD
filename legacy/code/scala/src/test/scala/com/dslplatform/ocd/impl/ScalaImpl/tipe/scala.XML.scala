package com.dslplatform.ocd
package impl

import box._
import types._
import tipe._

sealed trait ScalaXMLStub
    extends ScalaImpl
    with `tipe.Xml`
    with TipeUnconstrainedType
    with TipeEqualsComparableType
    with TipeStableType {

  def scalaDesc = "XML"
}

case object `scala.XML` extends ScalaXMLStub with ScalaOne {
  def scalaClass = "scala.xml.Elem"
  def defaultValue = "null"
}

case object `scala.XML?` extends ScalaXMLStub with ScalaOpt {
  def scalaClass = "Option[scala.xml.Elem]"
  def defaultValue = "None"
}

case object `scala.XML[]` extends ScalaXMLStub with ScalaArray {
  def scalaClass = "Array[scala.xml.Elem]"
  def defaultValue = "Array.empty[scala.xml.Elem]"
}

case object `scala.XML?[]` extends ScalaXMLStub with ScalaArrayOpt {
  def scalaClass = "Array[Option[scala.xml.Elem]]"
  def defaultValue = "Array.empty[Option[scala.xml.Elem]]"
}

case object `scala.XML[]?` extends ScalaXMLStub with ScalaOptArray {
  def scalaClass = "Option[Array[scala.xml.Elem]]"
  def defaultValue = "None"
}

case object `scala.XML?[]?` extends ScalaXMLStub with ScalaOptArrayOpt {
  def scalaClass = "Option[Array[Option[scala.xml.Elem]]]"
  def defaultValue = "None"
}

case object `scala.List<XML>` extends ScalaXMLStub with ScalaList {
  def scalaClass = "IndexedSeq[scala.xml.Elem]"
  def defaultValue = "IndexedSeq.empty[scala.xml.Elem]"
}

case object `scala.List<XML?>` extends ScalaXMLStub with ScalaListOpt {
  def scalaClass = "IndexedSeq[Option[scala.xml.Elem]]"
  def defaultValue = "IndexedSeq.empty[Option[scala.xml.Elem]]"
}

case object `scala.List<XML>?` extends ScalaXMLStub with ScalaOptList {
  def scalaClass = "Option[IndexedSeq[scala.xml.Elem]]"
  def defaultValue = "None"
}

case object `scala.List<XML?>?` extends ScalaXMLStub with ScalaOptListOpt {
  def scalaClass = "Option[IndexedSeq[Option[scala.xml.Elem]]]"
  def defaultValue = "None"
}

case object `scala.Set<XML>` extends ScalaXMLStub with ScalaSet {
  def scalaClass = "Set[scala.xml.Elem]"
  def defaultValue = "Set.empty[scala.xml.Elem]"
}

case object `scala.Set<XML?>` extends ScalaXMLStub with ScalaSetOpt {
  def scalaClass = "Set[Option[scala.xml.Elem]]"
  def defaultValue = "Set.empty[Option[scala.xml.Elem]]"
}

case object `scala.Set<XML>?` extends ScalaXMLStub with ScalaOptSet {
  def scalaClass = "Option[Set[scala.xml.Elem]]"
  def defaultValue = "None"
}

case object `scala.Set<XML?>?` extends ScalaXMLStub with ScalaOptSetOpt {
  def scalaClass = "Option[Set[Option[scala.xml.Elem]]]"
  def defaultValue = "None"
}
