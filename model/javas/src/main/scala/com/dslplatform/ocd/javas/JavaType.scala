package com.dslplatform.ocd
package javas

sealed trait JavaType {
  def baseClass: String
  override def toString = baseClass
}

case class JavaClass(baseClass: String) extends JavaType
case class JavaSimpleType(baseClass: String) extends JavaType

case class JavaCollectionType(baseClass: String, elementType: JavaType) extends JavaType {
  override def toString = s"${baseClass}<${elementType}>"
}

case class JavaGenericType(baseClass: String, elementTypes: JavaType*) extends JavaType {
  override def toString = s"${baseClass}<${elementTypes.mkString(", ")}>"
}
