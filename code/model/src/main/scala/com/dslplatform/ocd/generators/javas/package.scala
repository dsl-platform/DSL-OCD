package com.dslplatform.ocd.generators

package object javas {
  implicit def impaleTestValue(text: String) =
    new SingleJavaValue(text, Stable)

  implicit class unstableTestValue(val text: String) extends AnyVal {
    def ~(stability: Stability) = new SingleJavaValue(text, stability)
  }

  implicit def impaleStringSeq(texts: Seq[String]) =
    texts.map(new SingleJavaValue(_, Stable))
}

package javas {

import Types._
import Boxes._

class SingleJavaValue(
    text: String
  , val stability: Stability
  ) extends TestValue {

  override val toString =
    if (stability.isStable) {
      E"SingleJavaValue(${text})"
    }
    else {
      E"SingleJavaValue(${text}, Unstable)"
    }
}

case object NullJavaValue
    extends SingleJavaValue("null", Stable)

object JavaValueContainer {
  def apply(ct: CollectionType, clazz: String, values: TestValue*) = ct match {
    case CollectionType.Array =>
      ArrayOfJavaValues(clazz, values)

    case CollectionType.List =>
      ListOfJavaValues(clazz, values)

    case CollectionType.Set =>
      SetOfJavaValues(clazz, values)
  }
}

case class ArrayOfJavaValues(
    elementClass: String
  , val values: Seq[TestValue]
  ) extends TestValueContainer {

  override val toString = s"""ArrayOfJavaValues(${E"${elementClass}"},
      ${values.mkString("\n    , ")}
    )"""
}

case class ListOfJavaValues(
    elementClass: String
  , val values: Seq[TestValue]
  ) extends TestValueContainer {

  override val toString = s"""ListOfJavaValues(${E"${elementClass}"},
      ${values.mkString("\n    , ")}
    )"""
}

case class SetOfJavaValues(
    elementClass: String
  , val values: Seq[TestValue]
  ) extends TestValueContainer {

  override val toString = s"""SetOfJavaValues(${E"${elementClass}"},
      ${values.mkString("\n    , ")}
    )"""
}

object MapOfJavaValues {
  def apply(entries: Pair[String, String]*): MapOfJavaValues =
    MapOfJavaValues("String", "String", (entries.map { case (k, v) => (k: TestValue, v: TestValue)}).toMap)
}

case class MapOfJavaValues(
    keyClass: String
  , valueClass: String
  , val values: Map[TestValue, TestValue]
  ) extends TestEntryContainer {

  override val toString = s"""MapOfJavaValues(${E"${keyClass}"}, ${E"${valueClass}"},
        ${values.map{ case (k, v) => s"${k} -> ${v}"}.mkString("\n      , ")}
      )"""
}

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

  val defaultSingle: TestValue
  val nonDefaultValues: Seq[TestValue]

  def borderSingleValues =
    defaultSingle +: nonDefaultValues

  def defaultValue(box: Box) = box match {
    case Box(SingleType.Nullable, _, _*) =>
      NullJavaValue

    case Box(_, None, _*) =>
      defaultSingle

    case Box(_, Some((CollectionType.Array, SingleType.One)), _*) =>
      ("new " + (classPrimitive getOrElse classReference) + "[0]") ~ Stable

    case Box(_, Some((CollectionType.Array, _)), _*) =>
      ("new " + classReference + "[0]") ~ Stable

    case Box(_, Some((CollectionType.Set, _)), _*) =>
      ("new java.util.HashSet<" + classReference + ">(0)") ~ Stable

    case Box(_, Some((CollectionType.List, _)), _*) =>
      ("new java.util.ArrayList<" + classReference + ">(0)") ~ Stable
  }

  def defaultConcreteType(box: Box, values: TestValue*) = box.collectionType.get match {
    case (CollectionType.Array, SingleType.One) =>
      JavaValueContainer(CollectionType.Array, classPrimitive getOrElse classReference, values: _*)

    case (CollectionType.Array, _) =>
      JavaValueContainer(CollectionType.Array, classReference, values: _*)

    case (ct, _) =>
      JavaValueContainer(ct, classReference, values: _*)
  }

  def isPrimitive =
    classPrimitive.isDefined.toString

  def hasGenerics =
    classValue(_: Box).contains('<').toString

  def javaType(box: Box) = classValue(box) match {
    case cv if cv.contains('<') =>
      s"""CollectionType("${cv.replaceFirst("<.*>", "")}", JavaClass("${classReference}"))"""

    case cv =>
      s"""SimpleType("${cv}")"""
  }

  def nonDefaultValues(box: Box): Seq[TestValue] = box match {
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
        defaultConcreteType(box, NullJavaValue)
      , defaultConcreteType(box, defaultSingle)
      , defaultConcreteType(box, borderSingleValues.last)
      , defaultConcreteType(box, borderSingleValues: _*)
      , defaultConcreteType(box, NullJavaValue +: borderSingleValues: _*)
      )

    /* box.NulableArrayOfNullable, box.NulableSetOfNullable, box.NulableListOfNullable */
    case Box(SingleType.Nullable, s @ Some((base, SingleType.Nullable)), aliases @ _*) =>
       nonDefaultValues(Box(SingleType.One, s, aliases: _*))
  }
}

}
