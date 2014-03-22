package com.dslplatform.ocd.generators
package javas

import Types._
import Boxes._

object JavaMap
    extends JavaStub {

  val classReference = "java.util.Map<String, String>"

  val defaultSingle = "new java.util.HashMap<String, String>(0)"

  override def defaultValue(box: Box) = box match {
    case Box(SingleType.One, Some((CollectionType.Array, _)), _*) =>
      "new java.util.Map[0]"

    case _ =>
      super.defaultValue(box)
  }

  override def defaultConcreteType(box: Box, arrayElements: String*) = box.collectionType.get._1 match {
    case CollectionType.Array =>
      "new java.util.Map[]" + arrayElements.asBrackets

    case _ =>
      super.defaultConcreteType(box, arrayElements: _*)
  }

  val nonDefaultValues = Seq(
    // TODO: via factory methods:
    E"""new java.util.HashMap<String, String>() {{ put("a", "b"); }}"""
  , E"""new java.util.HashMap<String, String>() {{ put(${"""Quote: ", Solidus /"""}, ${"""Backslash: \, Aphos: ', Brackets: [] () {}"""}); }}"""
  , E"""new java.util.HashMap<String, String>() {{ put("a", "b"); put("b", "c"); put("c", "d"); }}"""
  )
}
