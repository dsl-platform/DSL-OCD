package com.dslplatform.ocd
package impl

import box._
import types._
import tipe._

sealed trait ScalaDateStub
    extends ScalaImpl
    with `tipe.Date`
    with TipeUnconstrainedType
    with TipeEqualsComparableType
    with TipeUnstableType {

  def scalaDesc = "Date"
}

case object `scala.Date` extends ScalaDateStub with ScalaOne {
  def scalaClass = "org.joda.time.LocalDate"
  def defaultValue = "org.joda.time.LocalDate.now"
}

case object `scala.Date?` extends ScalaDateStub with ScalaOpt {
  def scalaClass = "Option[org.joda.time.LocalDate]"
  def defaultValue = "None"
}

case object `scala.Date[]` extends ScalaDateStub with ScalaArray {
  def scalaClass = "Array[org.joda.time.LocalDate]"
  def defaultValue = "Array.empty[org.joda.time.LocalDate]"
}

case object `scala.Date?[]` extends ScalaDateStub with ScalaArrayOpt {
  def scalaClass = "Array[Option[org.joda.time.LocalDate]]"
  def defaultValue = "Array.empty[Option[org.joda.time.LocalDate]]"
}

case object `scala.Date[]?` extends ScalaDateStub with ScalaOptArray {
  def scalaClass = "Option[Array[org.joda.time.LocalDate]]"
  def defaultValue = "None"
}

case object `scala.Date?[]?` extends ScalaDateStub with ScalaOptArrayOpt {
  def scalaClass = "Option[Array[Option[org.joda.time.LocalDate]]]"
  def defaultValue = "None"
}

case object `scala.List<Date>` extends ScalaDateStub with ScalaList {
  def scalaClass = "IndexedSeq[org.joda.time.LocalDate]"
  def defaultValue = "IndexedSeq.empty[org.joda.time.LocalDate]"
}

case object `scala.List<Date?>` extends ScalaDateStub with ScalaListOpt {
  def scalaClass = "IndexedSeq[Option[org.joda.time.LocalDate]]"
  def defaultValue = "IndexedSeq.empty[Option[org.joda.time.LocalDate]]"
}

case object `scala.List<Date>?` extends ScalaDateStub with ScalaOptList {
  def scalaClass = "Option[IndexedSeq[org.joda.time.LocalDate]]"
  def defaultValue = "None"
}

case object `scala.List<Date?>?` extends ScalaDateStub with ScalaOptListOpt {
  def scalaClass = "Option[IndexedSeq[Option[org.joda.time.LocalDate]]]"
  def defaultValue = "None"
}

case object `scala.Set<Date>` extends ScalaDateStub with ScalaSet {
  def scalaClass = "Set[org.joda.time.LocalDate]"
  def defaultValue = "Set.empty[org.joda.time.LocalDate]"
}

case object `scala.Set<Date?>` extends ScalaDateStub with ScalaSetOpt {
  def scalaClass = "Set[Option[org.joda.time.LocalDate]]"
  def defaultValue = "Set.empty[Option[org.joda.time.LocalDate]]"
}

case object `scala.Set<Date>?` extends ScalaDateStub with ScalaOptSet {
  def scalaClass = "Option[Set[org.joda.time.LocalDate]]"
  def defaultValue = "None"
}

case object `scala.Set<Date?>?` extends ScalaDateStub with ScalaOptSetOpt {
  def scalaClass = "Option[Set[Option[org.joda.time.LocalDate]]]"
  def defaultValue = "None"
}
