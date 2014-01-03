package com.dslplatform.ocd
package impl

import box._
import types._
import tipe._

sealed trait JavaTimestampStub
    extends JavaImpl
    with `tipe.Timestamp`
    with TipeUnconstrainedType
    with TipeEqualsComparableType
    with TipeUnstableType {

  def javaDesc = "Timestamp"
}

case object `java.Timestamp` extends JavaTimestampStub with JavaOne {
  def javaClass = "org.joda.time.DateTime"
  def defaultValue = "org.joda.time.DateTime.now()"
}

case object `java.Timestamp?` extends JavaTimestampStub with JavaOpt {
  def javaClass = "org.joda.time.DateTime"
  def defaultValue = "null"
}

case object `java.Timestamp[]` extends JavaTimestampStub with JavaArray {
  def javaClass = "org.joda.time.DateTime[]"
  def defaultValue = "new org.joda.time.DateTime[0]"
}

case object `java.Timestamp?[]` extends JavaTimestampStub with JavaArrayOpt {
  def javaClass = "org.joda.time.DateTime[]"
  def defaultValue = "new org.joda.time.DateTime[0]"
}

case object `java.Timestamp[]?` extends JavaTimestampStub with JavaOptArray {
  def javaClass = "org.joda.time.DateTime[]"
  def defaultValue = "null"
}

case object `java.Timestamp?[]?` extends JavaTimestampStub with JavaOptArrayOpt {
  def javaClass = "org.joda.time.DateTime[]"
  def defaultValue = "null"
}

case object `java.List<Timestamp>` extends JavaTimestampStub with JavaList {
  def javaClass = "List<org.joda.time.DateTime>"
  def defaultValue = "new ArrayList<org.joda.time.DateTime>(0)"
}

case object `java.List<Timestamp?>` extends JavaTimestampStub with JavaListOpt {
  def javaClass = "List<org.joda.time.DateTime>"
  def defaultValue = "new ArrayList<org.joda.time.DateTime>(0)"
}

case object `java.List<Timestamp>?` extends JavaTimestampStub with JavaOptList {
  def javaClass = "List<org.joda.time.DateTime>"
  def defaultValue = "null"
}

case object `java.List<Timestamp?>?` extends JavaTimestampStub with JavaOptListOpt {
  def javaClass = "List<org.joda.time.DateTime>"
  def defaultValue = "null"
}

case object `java.Set<Timestamp>` extends JavaTimestampStub with JavaSet {
  def javaClass = "Set<org.joda.time.DateTime>"
  def defaultValue = "new HashSet<org.joda.time.DateTime>(0)"
}

case object `java.Set<Timestamp?>` extends JavaTimestampStub with JavaSetOpt {
  def javaClass = "Set<org.joda.time.DateTime>"
  def defaultValue = "new HashSet<org.joda.time.DateTime>(0)"
}

case object `java.Set<Timestamp>?` extends JavaTimestampStub with JavaOptSet {
  def javaClass = "Set<org.joda.time.DateTime>"
  def defaultValue = "null"
}

case object `java.Set<Timestamp?>?` extends JavaTimestampStub with JavaOptSetOpt {
  def javaClass = "Set<org.joda.time.DateTime>"
  def defaultValue = "null"
}
