package com.dslplatform.ocd

sealed trait JavaHashMapStub
extends JavaImplStub
with TipeKeyValueType
with TipeUnconstrainedType
with TipeStableType

case object `java.KeyValue` extends JavaHashMapStub with JavaOneImpl {
  def javaType = "HashMap<String, String>"
  def defaultValue = "new HashMap<String, String>()"
}

case object `java.KeyValue?` extends JavaHashMapStub with JavaOptImpl {
  def javaType = "HashMap<String, String>"
  def defaultValue = "null"
}

case object `java.KeyValue[]` extends JavaHashMapStub with JavaArrImpl {
  def javaType = "HashMap<String, String>[]"
  def defaultValue = "{}"
}

case object `java.KeyValue?[]` extends JavaHashMapStub with JavaArrOptImpl {
  def javaType = "HashMap<String, String>[]"
  def defaultValue = "{}"
}

case object `java.KeyValue[]?` extends JavaHashMapStub with JavaOptArrImpl {
  def javaType = "HashMap<String, String>[]"
  def defaultValue = "null"
}

case object `java.KeyValue?[]?` extends JavaHashMapStub with JavaOptArrOptImpl {
  def javaType = "HashMap<String, String>[]"
  def defaultValue = "null"
}

case object `java.List<KeyValue>` extends JavaHashMapStub with JavaListImpl {
  def javaType = "ArrayList<HashMap<String, String>>"
  def defaultValue = "new ArrayList<HashMap<String, String>>()"
}

case object `java.List<KeyValue?>` extends JavaHashMapStub with JavaListOptImpl {
  def javaType = "ArrayList<HashMap<String, String>>"
  def defaultValue = "new ArrayList<HashMap<String, String>>()"
}

case object `java.List<KeyValue>?` extends JavaHashMapStub with JavaOptListImpl {
  def javaType = "ArrayList<HashMap<String, String>>"
  def defaultValue = "null"
}

case object `java.List<KeyValue?>?` extends JavaHashMapStub with JavaOptListOptImpl {
  def javaType = "ArrayList<HashMap<String, String>>"
  def defaultValue = "null"
}

case object `java.Set<KeyValue>` extends JavaHashMapStub with JavaSetImpl {
  def javaType = "HashSet<HashMap<String, String>>"
  def defaultValue = "new HashSet<HashMap<String, String>>()"
}

case object `java.Set<KeyValue?>` extends JavaHashMapStub with JavaSetOptImpl {
  def javaType = "HashSet<HashMap<String, String>>"
  def defaultValue = "new HashSet<HashMap<String, String>>()"
}

case object `java.Set<KeyValue>?` extends JavaHashMapStub with JavaOptSetImpl {
  def javaType = "HashSet<HashMap<String, String>>"
  def defaultValue = "null"
}

case object `java.Set<KeyValue?>?` extends JavaHashMapStub with JavaOptSetOptImpl {
  def javaType = "HashSet<HashMap<String, String>>"
  def defaultValue = "null"
}
