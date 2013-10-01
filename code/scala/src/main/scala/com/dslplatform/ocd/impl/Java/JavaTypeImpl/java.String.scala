package com.dslplatform.ocd

sealed trait JavaStringStub
extends JavaImplStub
with TipeStringType
with TipeComplexType
with TipeConstrainedType
with TipeStableType

case object `java.String` extends JavaStringStub with JavaOneImpl {
  def javaType = "String"
  def defaultValue = "new String()"
}
case object `java.String?` extends JavaStringStub with JavaOptImpl {
  def javaType = "String"
  def defaultValue = "null"
}
case object `java.String[]` extends JavaStringStub with JavaArrImpl {
  def javaType = "String[]"
  def defaultValue = "{}"
}
case object `java.String?[]` extends JavaStringStub with JavaArrOptImpl {
  def javaType = "String[]"
  def defaultValue = "{}"
}
case object `java.String[]?` extends JavaStringStub with JavaOptArrImpl {
  def javaType = "String[]"
  def defaultValue = "null"
}
case object `java.String?[]?` extends JavaStringStub with JavaOptArrOptImpl {
  def javaType = "String[]"
  def defaultValue = "null"
}
case object `java.List<String>` extends JavaStringStub with JavaListImpl {
  def javaType = "ArrayList<String>"
  def defaultValue = "new ArrayList<String>()"
}
case object `java.List<String?>` extends JavaStringStub with JavaListOptImpl {
  def javaType = "ArrayList<String>"
  def defaultValue = "new ArrayList<String>()"
}
case object `java.List<String>?` extends JavaStringStub with JavaOptListImpl {
  def javaType = "ArrayList<String>"
  def defaultValue = "null"
}
case object `java.List<String?>?` extends JavaStringStub with JavaOptListOptImpl {
  def javaType = "ArrayList<String>"
  def defaultValue = "null"
}
case object `java.Set<String>` extends JavaStringStub with JavaSetImpl {
  def javaType = "HashSet<String>"
  def defaultValue = "new HashSet<String>()"
}
case object `java.Set<String?>` extends JavaStringStub with JavaSetOptImpl {
  def javaType = "HashSet<String>"
  def defaultValue = "new HashSet<String>()"
}
case object `java.Set<String>?` extends JavaStringStub with JavaOptSetImpl {
  def javaType = "HashSet<String>"
  def defaultValue = "null"
}
case object `java.Set<String?>?` extends JavaStringStub with JavaOptSetOptImpl {
  def javaType = "HashSet<String>"
  def defaultValue = "null"
}
