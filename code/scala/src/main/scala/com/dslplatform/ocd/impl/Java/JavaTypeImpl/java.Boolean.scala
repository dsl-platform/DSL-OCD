package com.dslplatform.ocd

sealed trait JavaBooleanStub
extends JavaImplStub
with TipeBoolType
with TipeScalarType
with TipeUnconstrainedType
with TipeStableType

case object `java.Bool` extends JavaBooleanStub with JavaOneImpl {
  def javaType = "boolean"
  def defaultValue = "false"
}

case object `java.Bool?` extends JavaBooleanStub with JavaOptImpl {
  def javaType = "Boolean"
  def defaultValue = "null"
}

case object `java.Bool[]` extends JavaBooleanStub with JavaArrImpl {
  def javaType = "boolean[]"
  def defaultValue = "{}"
}

case object `java.Bool?[]` extends JavaBooleanStub with JavaArrOptImpl {
  def javaType = "Boolean[]"
  def defaultValue = "{}"
}

case object `java.Bool[]?` extends JavaBooleanStub with JavaOptArrImpl {
  def javaType = "boolean[]"
  def defaultValue = "null"
}

case object `java.Bool?[]?` extends JavaBooleanStub with JavaOptArrOptImpl {
  def javaType = "Boolean[]"
  def defaultValue = "null"
}

case object `java.List<Bool>` extends JavaBooleanStub with JavaListImpl {
  def javaType = "ArrayList<boolean>"
  def defaultValue = "new ArrayList<boolean>()"
}

case object `java.List<Bool?>` extends JavaBooleanStub with JavaListOptImpl {
  def javaType = "ArrayList<Boolean>"
  def defaultValue = "new ArrayList<Boolean>()"
}

case object `java.List<Bool>?` extends JavaBooleanStub with JavaOptListImpl {
  def javaType = "ArrayList<boolean>"
  def defaultValue = "null"
}

case object `java.List<Bool?>?` extends JavaBooleanStub with JavaOptListOptImpl {
  def javaType = "ArrayList<Boolean>"
  def defaultValue = "null"
}

case object `java.Set<Bool>` extends JavaBooleanStub with JavaSetImpl {
  def javaType = "HashSet<boolean>"
  def defaultValue = "new HashSet<boolean>()"
}

case object `java.Set<Bool?>` extends JavaBooleanStub with JavaSetOptImpl {
  def javaType = "HashSet<Boolean>"
  def defaultValue = "new HashSet<Boolean>()"
}

case object `java.Set<Bool>?` extends JavaBooleanStub with JavaOptSetImpl {
  def javaType = "HashSet<boolean>"
  def defaultValue = "null"
}

case object `java.Set<Bool?>?` extends JavaBooleanStub with JavaOptSetOptImpl {
  def javaType = "HashSet<Boolean>"
  def defaultValue = "null"
}
