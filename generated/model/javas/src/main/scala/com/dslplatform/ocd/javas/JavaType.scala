package com.dslplatform.ocd
package javas

sealed trait JavaType { def baseClass: String }
case class JavaClass(baseClass: String) extends JavaType
case class JavaSimpleType(baseClass: String) extends JavaType
case class JavaCollectionType(baseClass: String, elementType: JavaType) extends JavaType
case class JavaGenericType(baseClass: String, elementTypes: JavaType*) extends JavaType
