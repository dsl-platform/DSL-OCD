package com.dslplatform.ocd
package generator
package javas
package javatypes

import types._
import boxes._

object JavaMap
    extends JavaStub {

  val classReference = "java.util.Map<String, Object>"

  val defaultSingle: TestValue = "new java.util.HashMap<String, Object>(0)"

  override def defaultValue(box: Box) = box match {
    case Box(SingleFamily.One, Some((CollectionFamily.Array, _)), _*) =>
      "new java.util.Map[0]"

    case _ =>
      super.defaultValue(box)
  }

  override def defaultConcreteType(box: Box, values: TestValue*) = box.collectionFamily.get match {
    case (CollectionFamily.Array, _) =>
      JavaValueContainer(CollectionFamily.Array, "java.util.Map", values: _*)

    case _ =>
      super.defaultConcreteType(box, values: _*)
  }

  override def javaType(box: Box) = box match {
    case Box(_, None, _*) =>
      s"""JavaGenericType("java.util.Map", JavaClass("String"), JavaClass("Object"))"""

    case Box(_, Some((CollectionFamily.Array, _)), _*) =>
      s"""JavaSimpleType("java.util.Map[]")"""

    case Box(_, Some((collectionFamily, _)), _*) =>
      s"""JavaCollectionType("java.util.${collectionFamily}", JavaGenericType("java.util.Map", JavaClass("String"), JavaClass("Object")))"""
  }

  val nonDefaultValues: Seq[TestValue] = Seq(
    MapOfJavaValues(E"${"a"}" -> "-128L")
  , MapOfJavaValues(E"${"""Quote: ", Solidus /"""}" -> E"${"""Backslash: \, Aphos: ', Brackets: [] () {}"""}")
  , MapOfJavaValues(E"${""}" -> E"${"empty-key"}", E"${"null"}" -> "null", E"${"long"}" -> E"1234567890123456789L", E"${"str"}" -> E"${"text"}")
  )
}
