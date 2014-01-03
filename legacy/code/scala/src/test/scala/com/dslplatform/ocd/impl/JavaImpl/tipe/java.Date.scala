package com.dslplatform.ocd
package impl

import box._
import types._
import tipe._

sealed trait JavaDateStub
    extends JavaImpl
    with `tipe.Date`
    with TipeUnconstrainedType
    with TipeEqualsComparableType
    with TipeUnstableType {

  def javaDesc = "Date"
}

case object `java.Date` extends JavaDateStub with JavaOne {
  def javaClass = "org.joda.time.LocalDate"
  def defaultValue = "org.joda.time.LocalDate.now()"
}

case object `java.Date?` extends JavaDateStub with JavaOpt {
  def javaClass = "org.joda.time.LocalDate"
  def defaultValue = "null"
}

case object `java.Date[]` extends JavaDateStub with JavaArray {
  def javaClass = "org.joda.time.LocalDate[]"
  def defaultValue = "new org.joda.time.LocalDate[0]"
}

case object `java.Date?[]` extends JavaDateStub with JavaArrayOpt {
  def javaClass = "org.joda.time.LocalDate[]"
  def defaultValue = "new org.joda.time.LocalDate[0]"
}

case object `java.Date[]?` extends JavaDateStub with JavaOptArray {
  def javaClass = "org.joda.time.LocalDate[]"
  def defaultValue = "null"
}

case object `java.Date?[]?` extends JavaDateStub with JavaOptArrayOpt {
  def javaClass = "org.joda.time.LocalDate[]"
  def defaultValue = "null"
}

case object `java.List<Date>` extends JavaDateStub with JavaList {
  def javaClass = "List<org.joda.time.LocalDate>"
  def defaultValue = "new ArrayList<org.joda.time.LocalDate>(0)"
}

case object `java.List<Date?>` extends JavaDateStub with JavaListOpt {
  def javaClass = "List<org.joda.time.LocalDate>"
  def defaultValue = "new ArrayList<org.joda.time.LocalDate>(0)"
}

case object `java.List<Date>?` extends JavaDateStub with JavaOptList {
  def javaClass = "List<org.joda.time.LocalDate>"
  def defaultValue = "null"
}

case object `java.List<Date?>?` extends JavaDateStub with JavaOptListOpt {
  def javaClass = "List<org.joda.time.LocalDate>"
  def defaultValue = "null"
}

case object `java.Set<Date>` extends JavaDateStub with JavaSet {
  def javaClass = "Set<org.joda.time.LocalDate>"
  def defaultValue = "new HashSet<org.joda.time.LocalDate>(0)"
}

case object `java.Set<Date?>` extends JavaDateStub with JavaSetOpt {
  def javaClass = "Set<org.joda.time.LocalDate>"
  def defaultValue = "new HashSet<org.joda.time.LocalDate>(0)"
}

case object `java.Set<Date>?` extends JavaDateStub with JavaOptSet {
  def javaClass = "Set<org.joda.time.LocalDate>"
  def defaultValue = "null"
}

case object `java.Set<Date?>?` extends JavaDateStub with JavaOptSetOpt {
  def javaClass = "Set<org.joda.time.LocalDate>"
  def defaultValue = "null"
}
