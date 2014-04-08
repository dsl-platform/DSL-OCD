package com.dslplatform.ocd.generators
package javas

import Types._
import Boxes._

object JavaMap
    extends JavaStub {

  val classReference = "java.util.Map<String, String>"

  val defaultSingle: TestValue = "new java.util.HashMap<String, String>(0)"

  override def defaultValue(box: Box) = box match {
    case Box(SingleType.One, Some((CollectionType.Array, _)), _*) =>
      "new java.util.Map[0]"

    case _ =>
      super.defaultValue(box)
  }

  override def defaultConcreteType(box: Box, values: TestValue*) = box.collectionType.get match {
    case (CollectionType.Array, _) =>
      JavaValueContainer(CollectionType.Array, "java.util.Map", values: _*)

    case _ =>
      super.defaultConcreteType(box, values: _*)
  }

  override def javaType(box: Box) = box match {
    case Box(_, None, _*) =>
      s"""JavaGenericType("java.util.Map", JavaClass("String"), JavaClass("String"))"""

    case Box(_, Some((CollectionType.Array, _)), _*) =>
      s"""JavaSimpleType("java.util.Map[]")"""

    case Box(_, Some((CollectionType.List, _)), _*) =>
      s"""JavaCollectionType("java.util.List", JavaGenericType("java.util.Map", JavaClass("String"), JavaClass("String")))"""

    case Box(_, Some((CollectionType.Set, _)), _*) =>
      s"""JavaCollectionType("java.util.Set", JavaGenericType("java.util.Map", JavaClass("String"), JavaClass("String")))"""
  }

  val nonDefaultValues: Seq[TestValue] = Seq(
    MapOfJavaValues(E"${"a"}" -> E"${"b"}")
  , MapOfJavaValues(E"${"""Quote: ", Solidus /"""}" -> E"${"""Backslash: \, Aphos: ', Brackets: [] () {}"""}")
  , MapOfJavaValues(E"${""}" -> E"${"empty"}", E"${"a"}" -> E"${"1"}", E"${"b"}" -> E"${"2"}", E"${"c"}" -> E"${"3"}")
  )
}
