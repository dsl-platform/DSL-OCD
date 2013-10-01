package com.dslplatform.ocd

sealed trait JavaDoubleStub
extends JavaImplStub
with TipeDoubleType
with TipeScalarType
with TipeUnconstrainedType
with TipeStableType

case object `java.Double` extends JavaDoubleStub with JavaOneImpl {
  def javaType = "double"
  def defaultValue = "0d"
}

case object `java.Double?` extends JavaDoubleStub with JavaOptImpl {
  def javaType = "Double"
  def defaultValue = "null"
}

case object `java.Double[]` extends JavaDoubleStub with JavaArrImpl {
  def javaType = "double[]"
  def defaultValue = "{}"
}

case object `java.Double?[]` extends JavaDoubleStub with JavaArrOptImpl {
  def javaType = "Double[]"
  def defaultValue = "{}"
}

case object `java.Double[]?` extends JavaDoubleStub with JavaOptArrImpl {
  def javaType = "double[]"
  def defaultValue = "null"
}

case object `java.Double?[]?` extends JavaDoubleStub with JavaOptArrOptImpl {
  def javaType = "Double[]"
  def defaultValue = "null"
}

case object `java.List<Double>` extends JavaDoubleStub with JavaListImpl {
  def javaType = "ArrayList<double>"
  def defaultValue = "new ArrayList<double>()"
}

case object `java.List<Double?>` extends JavaDoubleStub with JavaListOptImpl {
  def javaType = "ArrayList<Double>"
  def defaultValue = "new ArrayList<Double>()"
}

case object `java.List<Double>?` extends JavaDoubleStub with JavaOptListImpl {
  def javaType = "ArrayList<double>"
  def defaultValue = "null"
}

case object `java.List<Double?>?` extends JavaDoubleStub with JavaOptListOptImpl {
  def javaType = "ArrayList<Double>"
  def defaultValue = "null"
}

case object `java.Set<Double>` extends JavaDoubleStub with JavaSetImpl {
  def javaType = "HashSet<double>"
  def defaultValue = "new HashSet<double>()"
}

case object `java.Set<Double?>` extends JavaDoubleStub with JavaSetOptImpl {
  def javaType = "HashSet<Double>"
  def defaultValue = "new HashSet<Double>()"
}

case object `java.Set<Double>?` extends JavaDoubleStub with JavaOptSetImpl {
  def javaType = "HashSet<double>"
  def defaultValue = "null"
}

case object `java.Set<Double?>?` extends JavaDoubleStub with JavaOptSetOptImpl {
  def javaType = "HashSet<Double>"
  def defaultValue = "null"
}
