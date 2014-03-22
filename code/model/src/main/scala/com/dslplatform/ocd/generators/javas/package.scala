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
  val nonDefaultValues: Seq[String]

  def borderSingleValues =
    defaultSingle +: nonDefaultValues

  def defaultValue(box: Box) = box match {
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

  protected implicit class ArrayConstants(arrayElements: Seq[String]) {
    val asBrackets = arrayElements.mkString(" { ", ", ", " }")
    val asInnerClass = arrayElements.mkString(" {{ add(", "); add(", "); }}")
  }

  def defaultConcreteType(box: Box, arrayElements: String*) = box.collectionType.get._1 match {
    case CollectionType.Array =>
      "new " + classValue(box) + arrayElements.asBrackets

    case CollectionType.Set =>
      "new java.util.HashSet<" + classReference + ">()" + arrayElements.asInnerClass

    case CollectionType.List =>
      "new java.util.ArrayList<" + classReference + ">()" + arrayElements.asInnerClass
  }

  def isPrimitive =
    classPrimitive.isDefined.toString

  def hasGenerics =
    classValue(_: Box).contains('<').toString

  def nonDefaultValues(box: Box): Seq[String] = box match {
    /* box.One */
    case Box(SingleType.One, None, _*) =>
      nonDefaultValues

    /* box.Nullable */
    case Box(SingleType.Nullable, None, aliases @ _*) =>
       defaultSingle +: nonDefaultValues(Box(SingleType.One, None, aliases: _*))

    /* box.OneArrayOfOne,  box.OneListOfOne, box.OneSetOfOne*/
    case Box(SingleType.One, Some((_, SingleType.One)), _*) =>
      Seq(
        defaultConcreteType(box, defaultSingle)
      , defaultConcreteType(box, borderSingleValues.last)
      , defaultConcreteType(box, borderSingleValues: _*)
      )

    /* box.NulableArrayOfOne, box.NulableSetOfOne, box.NulableListOfOne */
    case Box(SingleType.Nullable, s @ Some((base, SingleType.One)), aliases @ _*) =>
       nonDefaultValues(Box(SingleType.One, s, aliases: _*))

    /* box.OneArrayOfNullable,  box.OneListOfNullable, box.OneSetOfNullable */
    case Box(SingleType.One, Some((_, SingleType.Nullable)), _*) =>
      Seq(
        defaultConcreteType(box, "null")
      , defaultConcreteType(box, defaultSingle)
      , defaultConcreteType(box, borderSingleValues.last)
      , defaultConcreteType(box, borderSingleValues: _*)
      , defaultConcreteType(box, "null" +: borderSingleValues: _*)
      )

    /* box.NulableArrayOfNullable, box.NulableSetOfNullable, box.NulableListOfNullable */
    case Box(SingleType.Nullable, s @ Some((base, SingleType.Nullable)), aliases @ _*) =>
       nonDefaultValues(Box(SingleType.One, s, aliases: _*))
  }
}
