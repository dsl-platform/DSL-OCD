package com.dslplatform.ocd.generators
package javas

import Types._
import Boxes._

trait JavaStub {
  val classPrimitive: Option[String] = None
  val classReference: String

  def classValue = (_: Box) match {
    case Box(SingleType.One, None, _*) =>
      classPrimitive getOrElse classReference

    case Box(_, None, _*) =>
      classReference

    case Box(_, Some((CollectionType.Array, SingleType.One)), _*) =>
      (classPrimitive getOrElse classReference) + "[]"

    case Box(_, Some((CollectionType.Array, _)), _*) =>
      classReference + "[]"

    case Box(_, Some((CollectionType.Set, _)), _*) =>
      "java.util.Set<" + classReference + ">"

    case Box(_, Some((CollectionType.List, _)), _*) =>
      "java.util.List<" + classReference + ">"
  }


  val defaultSingle: String

  def defaultValue = (_: Box) match {
    case Box(SingleType.Nullable, _, _*) =>
      "null"

    case Box(_, None, _*) =>
      defaultSingle

    case Box(_, Some((CollectionType.Array, SingleType.One)), _*) =>
      "new " + (classPrimitive getOrElse classReference) + "[0]"

    case Box(_, Some((CollectionType.Array, _)), _*) =>
      "new " + classReference + "[0]"

    case Box(_, Some((CollectionType.Set, _)), _*) =>
      "new java.util.HashSet<" + classReference + ">(0)"

    case Box(_, Some((CollectionType.List, _)), _*) =>
      "new java.util.ArrayList<" + classReference + ">(0)"
  }

  def isPrimitive =
    classPrimitive.isDefined.toString

  def hasGenerics =
    classValue(_: Box).contains('<').toString
}
