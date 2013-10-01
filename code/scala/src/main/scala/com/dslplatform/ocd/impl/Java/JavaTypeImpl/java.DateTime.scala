package com.dslplatform.ocd

sealed trait JavaDateTimeStub
extends JavaImplStub
with TipeDateType
with TipeComplexType
with TipeUnconstrainedType
with TipeUnstableType

case object `java.Timestamp` extends JavaDateTimeStub with JavaOneImpl {
  def javaType = "org.joda.time.DateTime"
  def defaultValue = "new org.joda.time.DateTime()"
}

case object `java.Timestamp?` extends JavaDateTimeStub with JavaOptImpl {
  def javaType = "org.joda.time.DateTime"
  def defaultValue = "null"
}

case object `java.Timestamp[]` extends JavaDateTimeStub with JavaArrImpl {
  def javaType = "org.joda.time.DateTime[]"
  def defaultValue = "{}"
}

case object `java.Timestamp?[]` extends JavaDateTimeStub with JavaArrOptImpl {
  def javaType = "org.joda.time.DateTime[]"
  def defaultValue = "{}"
}

case object `java.Timestamp[]?` extends JavaDateTimeStub with JavaOptArrImpl {
  def javaType = "org.joda.time.DateTime[]"
  def defaultValue = "null"
}

case object `java.Timestamp?[]?` extends JavaDateTimeStub with JavaOptArrOptImpl {
  def javaType = "org.joda.time.DateTime[]"
  def defaultValue = "null"
}

case object `java.List<Timestamp>` extends JavaDateTimeStub with JavaListImpl {
  def javaType = "ArrayList<org.joda.time.DateTime>"
  def defaultValue = "new ArrayList<org.joda.time.DateTime>()"
}

case object `java.List<Timestamp?>` extends JavaDateTimeStub with JavaListOptImpl {
  def javaType = "ArrayList<org.joda.time.DateTime>"
  def defaultValue = "new ArrayList<org.joda.time.DateTime>()"
}

case object `java.List<Timestamp>?` extends JavaDateTimeStub with JavaOptListImpl {
  def javaType = "ArrayList<org.joda.time.DateTime>"
  def defaultValue = "null"
}

case object `java.List<Timestamp?>?` extends JavaDateTimeStub with JavaOptListOptImpl {
  def javaType = "ArrayList<org.joda.time.DateTime>"
  def defaultValue = "null"
}

case object `java.Set<Timestamp>` extends JavaDateTimeStub with JavaSetImpl {
  def javaType = "HashSet<org.joda.time.DateTime>"
  def defaultValue = "new HashSet<org.joda.time.DateTime>()"
}

case object `java.Set<Timestamp?>` extends JavaDateTimeStub with JavaSetOptImpl {
  def javaType = "HashSet<org.joda.time.DateTime>"
  def defaultValue = "new HashSet<org.joda.time.DateTime>()"
}

case object `java.Set<Timestamp>?` extends JavaDateTimeStub with JavaOptSetImpl {
  def javaType = "HashSet<org.joda.time.DateTime>"
  def defaultValue = "null"
}

case object `java.Set<Timestamp?>?` extends JavaDateTimeStub with JavaOptSetOptImpl {
  def javaType = "HashSet<org.joda.time.DateTime>"
  def defaultValue = "null"
}

