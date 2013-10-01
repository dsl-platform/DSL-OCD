package com.dslplatform.ocd

sealed trait JavaUUIDStub
extends JavaImplStub
with TipeGuidType
with TipeComplexType
with TipeUnconstrainedType
with TipeUnstableType

case object `java.Guid` extends JavaUUIDStub with JavaOneImpl {
  def javaType = "java.util.UUID"
  def defaultValue = "new java.util.UUID()"
}

case object `java.Guid?` extends JavaUUIDStub with JavaOptImpl {
  def javaType = "java.util.UUID"
  def defaultValue = "null"
}

case object `java.Guid[]` extends JavaUUIDStub with JavaArrImpl {
  def javaType = "java.util.UUID[]"
  def defaultValue = "{}"
}

case object `java.Guid?[]` extends JavaUUIDStub with JavaArrOptImpl {
  def javaType = "java.util.UUID[]"
  def defaultValue = "{}"
}

case object `java.Guid[]?` extends JavaUUIDStub with JavaOptArrImpl {
  def javaType = "java.util.UUID[]"
  def defaultValue = "null"
}

case object `java.Guid?[]?` extends JavaUUIDStub with JavaOptArrOptImpl {
  def javaType = "java.util.UUID[]"
  def defaultValue = "null"
}

case object `java.List<Guid>` extends JavaUUIDStub with JavaListImpl {
  def javaType = "ArrayList<java.util.UUID>"
  def defaultValue = "new ArrayList<java.util.UUID>()"
}

case object `java.List<Guid?>` extends JavaUUIDStub with JavaListOptImpl {
  def javaType = "ArrayList<java.util.UUID>"
  def defaultValue = "new ArrayList<java.util.UUID>()"
}

case object `java.List<Guid>?` extends JavaUUIDStub with JavaOptListImpl {
  def javaType = "ArrayList<java.util.UUID>"
  def defaultValue = "null"
}

case object `java.List<Guid?>?` extends JavaUUIDStub with JavaOptListOptImpl {
  def javaType = "ArrayList<java.util.UUID>"
  def defaultValue = "null"
}

case object `java.Set<Guid>` extends JavaUUIDStub with JavaSetImpl {
  def javaType = "HashSet<java.util.UUID>"
  def defaultValue = "new HashSet<java.util.UUID>()"
}

case object `java.Set<Guid?>` extends JavaUUIDStub with JavaSetOptImpl {
  def javaType = "HashSet<java.util.UUID>"
  def defaultValue = "new HashSet<java.util.UUID>()"
}

case object `java.Set<Guid>?` extends JavaUUIDStub with JavaOptSetImpl {
  def javaType = "HashSet<java.util.UUID>"
  def defaultValue = "null"
}

case object `java.Set<Guid?>?` extends JavaUUIDStub with JavaOptSetOptImpl {
  def javaType = "HashSet<java.util.UUID>"
  def defaultValue = "null"
}
