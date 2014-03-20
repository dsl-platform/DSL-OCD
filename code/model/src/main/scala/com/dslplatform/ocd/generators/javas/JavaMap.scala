package com.dslplatform.ocd.generators
package javas

import Types._
import Boxes._

object JavaMap
    extends JavaStub {

  val classReference = "java.util.Map<String, String>"

  override def classValue = (_ :Box)  match {
    case Box(_, Some((CollectionType.Array, _)), _*) =>
      classReference

    case box @ _ =>
      super.classValue(box)
  }

  val defaultSingle = "new java.util.HashMap<String, String>(0)"

  override def defaultValue(box: Box) = box match {
    case Box(SingleType.One, Some((CollectionType.Array, _)), _*) =>
      "new java.util.Map[0]"

    case _ =>
      super.defaultValue(box)
  }

  val nonDefaultValues = Seq(
    // TODO: via factory methods:
    E"""new java.util.HashMap<String, String>(){{ put("a","b"); }}"""
  , E"""new java.util.HashMap<String, String>(){{ put(${"""Quote: ", Solidus /, Backslash: \, Aphos: ', Brackets: [] () {}"""}); }}"""
  , E"""new java.util.HashMap<String, String>(){{ put("a","b"); put(${"""Quote: ", Solidus /, Backslash: \, Aphos: ', Brackets: [] () {}"""}); put("c","d");}}"""
  , E"""new java.util.HashMap<String, String>(){{ put("a","b"); put("b","c"); put("c","d");}}"""
  )
}
