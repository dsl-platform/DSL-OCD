package com.dslplatform.ocd

sealed trait JavaBinaryStub
extends JavaImplStub
with TipeBinaryType
with TipeSpecialEqualsType
with TipeUnconstrainedType
with TipeStableType

case object `java.Binary` extends JavaBinaryStub with JavaOneImpl {
  def javaType = "byte[]"
  def defaultValue = "{}"
}

case object `java.Binary?` extends JavaBinaryStub with JavaOptImpl {
  def javaType = "byte[]"
  def defaultValue = "null"
}

case object `java.Binary[]` extends JavaBinaryStub with JavaArrImpl {
  def javaType = "byte[][]"
  def defaultValue = "{}"
}

case object `java.Binary?[]` extends JavaBinaryStub with JavaArrOptImpl {
  def javaType = "byte[][]"
  def defaultValue = "{}"
}

case object `java.Binary[]?` extends JavaBinaryStub with JavaOptArrImpl {
  def javaType = "byte[][]"
  def defaultValue = "null"
}

case object `java.Binary?[]?` extends JavaBinaryStub with JavaOptArrOptImpl {
  def javaType = "byte[][]"
  def defaultValue = "null"
}

case object `java.List<Binary>` extends JavaBinaryStub with JavaListImpl {
  def javaType = "ArrayList<byte[]>"
  def defaultValue = "new ArrayList<byte[]>()"
}

case object `java.List<Binary?>` extends JavaBinaryStub with JavaListOptImpl {
  def javaType = "ArrayList<byte[]>"
  def defaultValue = "new ArrayList<byte[]>()"
}

case object `java.List<Binary>?` extends JavaBinaryStub with JavaOptListImpl {
  def javaType = "ArrayList<byte[]>"
  def defaultValue = "null"
}

case object `java.List<Binary?>?` extends JavaBinaryStub with JavaOptListOptImpl {
  def javaType = "ArrayList<byte[]>"
  def defaultValue = "null"
}

case object `java.Set<Binary>` extends JavaBinaryStub with JavaSetImpl {
  def javaType = "HashSet<byte[]>"
  def defaultValue = "new HashSet<byte[]>()"
}

case object `java.Set<Binary?>` extends JavaBinaryStub with JavaSetOptImpl {
  def javaType = "HashSet<byte[]>"
  def defaultValue = "new HashSet<byte[]>()"
}

case object `java.Set<Binary>?` extends JavaBinaryStub with JavaOptSetImpl {
  def javaType = "HashSet<byte[]>"
  def defaultValue = "null"
}

case object `java.Set<Binary?>?` extends JavaBinaryStub with JavaOptSetOptImpl {
  def javaType = "HashSet<byte[]>"
  def defaultValue = "null"
}
