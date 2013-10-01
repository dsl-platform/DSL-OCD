package com.dslplatform.ocd

sealed trait JavaLongStub extends JavaImplStub with TipeLongType with TipeScalarType with TipeUnconstrainedType with TipeStableType

case object `java.Long` extends JavaLongStub with JavaOneImpl {
  def javaType = "long"
  def defaultValue = "0l"
}
case object `java.Long?` extends JavaLongStub with JavaOptImpl {
  def javaType = "Long"
  def defaultValue = "null"
}
case object `java.Long[]` extends JavaLongStub with JavaArrImpl {
  def javaType = "long[]"
  def defaultValue = "{}"
}
case object `java.Long?[]` extends JavaLongStub with JavaArrOptImpl {
  def javaType = "Long[]"
  def defaultValue = "{}"
}
case object `java.Long[]?` extends JavaLongStub with JavaOptArrImpl {
  def javaType = "long[]"
  def defaultValue = "null"
}
case object `java.Long?[]?` extends JavaLongStub with JavaOptArrOptImpl {
  def javaType = "Long[]"
  def defaultValue = "null"
}
case object `java.List<Long>` extends JavaLongStub with JavaListImpl {
  def javaType = "ArrayList<long>"
  def defaultValue = "new ArrayList<long>()"
}
case object `java.List<Long?>` extends JavaLongStub with JavaListOptImpl {
  def javaType = "ArrayList<Long>"
  def defaultValue = "new ArrayList<Long>()"
}
case object `java.List<Long>?` extends JavaLongStub with JavaOptListImpl {
  def javaType = "ArrayList<long>"
  def defaultValue = "null"
}
case object `java.List<Long?>?` extends JavaLongStub with JavaOptListOptImpl {
  def javaType = "ArrayList<Long>"
  def defaultValue = "null"
}
case object `java.Set<Long>` extends JavaLongStub with JavaSetImpl {
  def javaType = "HashSet<long>"
  def defaultValue = "new HashSet<long>()"
}
case object `java.Set<Long?>` extends JavaLongStub with JavaSetOptImpl {
  def javaType = "HashSet<Long>"
  def defaultValue = "new HashSet<Long>()"
}
case object `java.Set<Long>?` extends JavaLongStub with JavaOptSetImpl {
  def javaType = "HashSet<long>"
  def defaultValue = "null"
}
case object `java.Set<Long?>?` extends JavaLongStub with JavaOptSetOptImpl {
  def javaType = "HashSet<Long>"
  def defaultValue = "null"
}
