package com.dslplatform.ocd

sealed trait JavaIntStub
extends JavaImplStub
with TipeIntegerType
with TipeScalarType
with TipeUnconstrainedType
with TipeStableType

case object `java.Integer` extends JavaIntStub with JavaOneImpl {
  def javaType = "int"
  def defaultValue = "0"
}

case object `java.Integer?` extends JavaIntStub with JavaOptImpl {
  def javaType = "Integer"
  def defaultValue = "null"
}

case object `java.Integer[]` extends JavaIntStub with JavaArrImpl {
  def javaType = "int[]"
  def defaultValue = "{}"
}

case object `java.Integer?[]` extends JavaIntStub with JavaArrOptImpl {
  def javaType = "Integer[]"
  def defaultValue = "{}"
}

case object `java.Integer[]?` extends JavaIntStub with JavaOptArrImpl {
  def javaType = "int[]"
  def defaultValue = "null"
}

case object `java.Integer?[]?` extends JavaIntStub with JavaOptArrOptImpl {
  def javaType = "Integer[]"
  def defaultValue = "null"
}

case object `java.List<Integer>` extends JavaIntStub with JavaListImpl {
  def javaType = "ArrayList<int>"
  def defaultValue = "new ArrayList<int>()"
}

case object `java.List<Integer?>` extends JavaIntStub with JavaListOptImpl {
  def javaType = "ArrayList<Integer>"
  def defaultValue = "new ArrayList<Integer>()"
}

case object `java.List<Integer>?` extends JavaIntStub with JavaOptListImpl {
  def javaType = "ArrayList<int>"
  def defaultValue = "null"
}

case object `java.List<Integer?>?` extends JavaIntStub with JavaOptListOptImpl {
  def javaType = "ArrayList<Integer>"
  def defaultValue = "null"
}

case object `java.Set<Integer>` extends JavaIntStub with JavaSetImpl {
  def javaType = "HashSet<int>"
  def defaultValue = "new HashSet<int>()"
}

case object `java.Set<Integer?>` extends JavaIntStub with JavaSetOptImpl {
  def javaType = "HashSet<Integer>"
  def defaultValue = "new HashSet<Integer>()"
}

case object `java.Set<Integer>?` extends JavaIntStub with JavaOptSetImpl {
  def javaType = "HashSet<int>"
  def defaultValue = "null"
}

case object `java.Set<Integer?>?` extends JavaIntStub with JavaOptSetOptImpl {
  def javaType = "HashSet<Integer>"
  def defaultValue = "null"
}
