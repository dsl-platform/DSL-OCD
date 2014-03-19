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
  val borderSingleValues: Seq[String] = Seq(
      "dinamo"
    , "hajduk"
      )

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

  private implicit class ArrayConstants(arrayElements: Seq[String]) {
    val asBrackets = arrayElements.mkString("[] { ", ", ", " }")
    val asList = arrayElements.mkString("java.util.Arrays.asList(", ", ", ")")
  }

  def defaultConcreteType(box: Box, arrayElements: String*) = box match {
    case Box(_, Some((CollectionType.Array, SingleType.One)), _*) =>
      "new " + (classPrimitive getOrElse classReference) + arrayElements.asBrackets

    case Box(_, Some((CollectionType.Array, _)), _*) =>
      "new " + classReference + arrayElements.asBrackets

    case Box(_, Some((CollectionType.Set, _)), _*) =>
      "new java.util.HashSet<" + classReference + ">(" + arrayElements.asList + ")"

    case Box(_, Some((CollectionType.List, _)), _*) =>
      "new java.util.ArrayList<" + classReference + ">(" + arrayElements.asList + ")"

    case _ =>
      "null"
  }

  def isPrimitive =
    classPrimitive.isDefined.toString

  def hasGenerics =
    classValue(_: Box).contains('<').toString

    def borderValues(box: Box): Seq[String] =
    box match {
      /* box.One */
      case Box(SingleType.One, None, _*) =>
        borderSingleValues
      /* box.Nullable */
      case Box(SingleType.Nullable, None, aliases@_*) =>
        "null" +: borderValues(Box(SingleType.One, None, aliases:_*))

      /* box.OneArrayOfOne,  box.OneListOfOne, box.OneSetOfOne*/
      case Box(SingleType.One, Some((_, SingleType.One)), _*) =>
        Seq(
          defaultValue(box)
        , defaultConcreteType(box, defaultSingle)
        , defaultConcreteType(box, borderSingleValues.last)
        , defaultConcreteType(box, borderSingleValues: _*)
        )
      /* box.NulableArrayOfOne, box.NulableSetOfOne, box.NulableListOfOne */
      case Box(SingleType.Nullable, Some((base, SingleType.One)), aliases@_*) =>
        "null" +:  borderValues(Box(SingleType.One, Some((base, SingleType.One)), aliases:_*))

      /* box.OneArrayOfNullable,  box.OneListOfNullable, box.OneSetOfNullable */
      case Box(SingleType.One, Some((_, SingleType.Nullable)), _*) =>
        Seq(
          defaultValue(box)
        , defaultConcreteType(box, "null")
        , defaultConcreteType(box, defaultSingle)
        , defaultConcreteType(box, borderSingleValues.last)
        , defaultConcreteType(box, borderSingleValues: _*)
        , defaultConcreteType(box, "null" +: borderSingleValues: _*)
        )
      /* box.NulableArrayOfNullable, box.NulableSetOfNullable, box.NulableListOfNullable */
      case Box(SingleType.Nullable, Some((base, SingleType.Nullable)), aliases@_*) =>
        "null" +: borderValues(Box(SingleType.One, Some((base, SingleType.Nullable)), aliases:_*))

      case _ =>
        Seq("dinamo", "hajduk") // TODO:
    }

}
