package com.dslplatform.ocd

sealed trait JavaLocalDateStub
extends JavaImplStub
with TipeDateType
with TipeComplexType
with TipeUnconstrainedType
with TipeUnstableType

case object `java.Date` extends JavaLocalDateStub with JavaOneImpl {
  def javaType = "org.joda.time.LocalDate"
  def defaultValue = "new org.joda.time.LocalDate()"
}

case object `java.Date?` extends JavaLocalDateStub with JavaOptImpl {
  def javaType = "org.joda.time.LocalDate"
  def defaultValue = "null"
}

case object `java.Date[]` extends JavaLocalDateStub with JavaArrImpl {
  def javaType = "org.joda.time.LocalDate[]"
  def defaultValue = "{}"
}

case object `java.Date?[]` extends JavaLocalDateStub with JavaArrOptImpl {
  def javaType = "org.joda.time.LocalDate[]"
  def defaultValue = "{}"
}

case object `java.Date[]?` extends JavaLocalDateStub with JavaOptArrImpl {
  def javaType = "org.joda.time.LocalDate[]"
  def defaultValue = "null"
}

case object `java.Date?[]?` extends JavaLocalDateStub with JavaOptArrOptImpl {
  def javaType = "org.joda.time.LocalDate[]"
  def defaultValue = "null"
}

case object `java.List<Date>` extends JavaLocalDateStub with JavaListImpl {
  def javaType = "ArrayList<org.joda.time.LocalDate>"
  def defaultValue = "new ArrayList<org.joda.time.LocalDate>()"
}

case object `java.List<Date?>` extends JavaLocalDateStub with JavaListOptImpl {
  def javaType = "ArrayList<org.joda.time.LocalDate>"
  def defaultValue = "new ArrayList<org.joda.time.LocalDate>()"
}

case object `java.List<Date>?` extends JavaLocalDateStub with JavaOptListImpl {
  def javaType = "ArrayList<org.joda.time.LocalDate>"
  def defaultValue = "null"
}

case object `java.List<Date?>?` extends JavaLocalDateStub with JavaOptListOptImpl {
  def javaType = "ArrayList<org.joda.time.LocalDate>"
  def defaultValue = "null"
}

case object `java.Set<Date>` extends JavaLocalDateStub with JavaSetImpl {
  def javaType = "HashSet<org.joda.time.LocalDate>"
  def defaultValue = "new HashSet<org.joda.time.LocalDate>()"
}

case object `java.Set<Date?>` extends JavaLocalDateStub with JavaSetOptImpl {
  def javaType = "HashSet<org.joda.time.LocalDate>"
  def defaultValue = "new HashSet<org.joda.time.LocalDate>()"
}

case object `java.Set<Date>?` extends JavaLocalDateStub with JavaOptSetImpl {
  def javaType = "HashSet<org.joda.time.LocalDate>"
  def defaultValue = "null"
}

case object `java.Set<Date?>?` extends JavaLocalDateStub with JavaOptSetOptImpl {
  def javaType = "HashSet<org.joda.time.LocalDate>"
  def defaultValue = "null"
}
