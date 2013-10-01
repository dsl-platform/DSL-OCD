package com.dslplatform.ocd

sealed trait JavaFloatStub
extends JavaImplStub
with TipeFloatType
with TipeScalarType
with TipeUnconstrainedType
with TipeStableType

case object `java.Float` extends JavaFloatStub with JavaOneImpl {
  def javaType = "float"
  def defaultValue = "0f"
}

case object `java.Float?` extends JavaFloatStub with JavaOptImpl {
  def javaType = "Float"
  def defaultValue = "null"
}

case object `java.Float[]` extends JavaFloatStub with JavaArrImpl {
  def javaType = "float[]"
  def defaultValue = "{}"
}

case object `java.Float?[]` extends JavaFloatStub with JavaArrOptImpl {
  def javaType = "Float[]"
  def defaultValue = "{}"
}

case object `java.Float[]?` extends JavaFloatStub with JavaOptArrImpl {
  def javaType = "float[]"
  def defaultValue = "null"
}

case object `java.Float?[]?` extends JavaFloatStub with JavaOptArrOptImpl {
  def javaType = "Float[]"
  def defaultValue = "null"
}

case object `java.List<Float>` extends JavaFloatStub with JavaListImpl {
  def javaType = "ArrayList<float>"
  def defaultValue = "new ArrayList<float>()"
}

case object `java.List<Float?>` extends JavaFloatStub with JavaListOptImpl {
  def javaType = "ArrayList<Float>"
  def defaultValue = "new ArrayList<Float>()"
}

case object `java.List<Float>?` extends JavaFloatStub with JavaOptListImpl {
  def javaType = "ArrayList<float>"
  def defaultValue = "null"
}

case object `java.List<Float?>?` extends JavaFloatStub with JavaOptListOptImpl {
  def javaType = "ArrayList<Float>"
  def defaultValue = "null"
}

case object `java.Set<Float>` extends JavaFloatStub with JavaSetImpl {
  def javaType = "HashSet<float>"
  def defaultValue = "new HashSet<float>()"
}

case object `java.Set<Float?>` extends JavaFloatStub with JavaSetOptImpl {
  def javaType = "HashSet<Float>"
  def defaultValue = "new HashSet<Float>()"
}

case object `java.Set<Float>?` extends JavaFloatStub with JavaOptSetImpl {
  def javaType = "HashSet<float>"
  def defaultValue = "null"
}

case object `java.Set<Float?>?` extends JavaFloatStub with JavaOptSetOptImpl {
  def javaType = "HashSet<Float>"
  def defaultValue = "null"
}
