package com.dslplatform.ocd
package impl

import box._
import types._
import tipe._

sealed trait ScalaTimestampStub
    extends ScalaImpl
    with `tipe.Timestamp`
    with TipeUnconstrainedType
    with TipeEqualsComparableType
    with TipeUnstableType {

  def scalaDesc = "Timestamp"
}

case object `scala.Timestamp` extends ScalaTimestampStub with ScalaOne {
  def scalaClass = "org.joda.time.DateTime"
  def defaultValue = "org.joda.time.DateTime.now"
}

case object `scala.Timestamp?` extends ScalaTimestampStub with ScalaOpt {
  def scalaClass = "Option[org.joda.time.DateTime]"
  def defaultValue = "None"
}

case object `scala.Timestamp[]` extends ScalaTimestampStub with ScalaArray {
  def scalaClass = "Array[org.joda.time.DateTime]"
  def defaultValue = "Array.empty[org.joda.time.DateTime]"
}

case object `scala.Timestamp?[]` extends ScalaTimestampStub with ScalaArrayOpt {
  def scalaClass = "Array[Option[org.joda.time.DateTime]]"
  def defaultValue = "Array.empty[Option[org.joda.time.DateTime]]"
}

case object `scala.Timestamp[]?` extends ScalaTimestampStub with ScalaOptArray {
  def scalaClass = "Option[Array[org.joda.time.DateTime]]"
  def defaultValue = "None"
}

case object `scala.Timestamp?[]?` extends ScalaTimestampStub with ScalaOptArrayOpt {
  def scalaClass = "Option[Array[Option[org.joda.time.DateTime]]]"
  def defaultValue = "None"
}

case object `scala.List<Timestamp>` extends ScalaTimestampStub with ScalaList {
  def scalaClass = "IndexedSeq[org.joda.time.DateTime]"
  def defaultValue = "IndexedSeq.empty[org.joda.time.DateTime]"
}

case object `scala.List<Timestamp?>` extends ScalaTimestampStub with ScalaListOpt {
  def scalaClass = "IndexedSeq[Option[org.joda.time.DateTime]]"
  def defaultValue = "IndexedSeq.empty[Option[org.joda.time.DateTime]]"
}

case object `scala.List<Timestamp>?` extends ScalaTimestampStub with ScalaOptList {
  def scalaClass = "Option[IndexedSeq[org.joda.time.DateTime]]"
  def defaultValue = "None"
}

case object `scala.List<Timestamp?>?` extends ScalaTimestampStub with ScalaOptListOpt {
  def scalaClass = "Option[IndexedSeq[Option[org.joda.time.DateTime]]]"
  def defaultValue = "None"
}

case object `scala.Set<Timestamp>` extends ScalaTimestampStub with ScalaSet {
  def scalaClass = "Set[org.joda.time.DateTime]"
  def defaultValue = "Set.empty[org.joda.time.DateTime]"
}

case object `scala.Set<Timestamp?>` extends ScalaTimestampStub with ScalaSetOpt {
  def scalaClass = "Set[Option[org.joda.time.DateTime]]"
  def defaultValue = "Set.empty[Option[org.joda.time.DateTime]]"
}

case object `scala.Set<Timestamp>?` extends ScalaTimestampStub with ScalaOptSet {
  def scalaClass = "Option[Set[org.joda.time.DateTime]]"
  def defaultValue = "None"
}

case object `scala.Set<Timestamp?>?` extends ScalaTimestampStub with ScalaOptSetOpt {
  def scalaClass = "Option[Set[Option[org.joda.time.DateTime]]]"
  def defaultValue = "None"
}
