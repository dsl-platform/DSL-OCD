package com.dslplatform.ocd
package generator

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

import types._
import boxes._

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

case object DisallowedNullValue extends TestValue {
  def stability = Stable
  override val toString = "DisallowedNullValue"
}

case object NullJavaValue
    extends SingleJavaValue("null", Stable)

object JavaValueContainer {
  def apply(ct: CollectionFamily, clazz: String, values: TestValue*) = ct match {
    case CollectionFamily.Array =>
      ArrayOfJavaValues(clazz, values)

    case CollectionFamily.List =>
      ListOfJavaValues(clazz, values)

    case CollectionFamily.Set =>
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
    case Box(SingleFamily.One, None, _*) =>
      classPrimitive getOrElse classReference

    case Box(_, None, _*) =>
      classReference

    case Box(_, Some((CollectionFamily.Array, SingleFamily.One)), _*) =>
      (classPrimitive getOrElse classReference) + "[]"

    case Box(_, Some((CollectionFamily.Array, _)), _*) =>
      classReference + "[]"

    case Box(_, Some((CollectionFamily.Set, _)), _*) =>
      "java.util.Set<" + classReference + ">"

    case Box(_, Some((CollectionFamily.List, _)), _*) =>
      "java.util.List<" + classReference + ">"
  }

  val defaultSingle: TestValue
  val nonDefaultValues: Seq[TestValue]

  def borderSingleValues =
    (if (isDissalowed) Nil else Seq(defaultSingle)) ++ nonDefaultValues

  def defaultValue(box: Box) = box match {
    case Box(SingleFamily.Nullable, _, _*) =>
      NullJavaValue

    case Box(_, None, _*) =>
      defaultSingle

    case Box(_, Some((CollectionFamily.Array, SingleFamily.One)), _*) =>
      ("new " + (classPrimitive getOrElse classReference) + "[0]") ~ Stable

    case Box(_, Some((CollectionFamily.Array, _)), _*) =>
      ("new " + classReference + "[0]") ~ Stable

    case Box(_, Some((CollectionFamily.Set, _)), _*) =>
      ("new java.util.HashSet<" + classReference + ">(0)") ~ Stable

    case Box(_, Some((CollectionFamily.List, _)), _*) =>
      ("new java.util.ArrayList<" + classReference + ">(0)") ~ Stable
  }

  def defaultConcreteType(box: Box, values: TestValue*) = box.collectionFamily.get match {
    case (CollectionFamily.Array, SingleFamily.One) =>
      JavaValueContainer(CollectionFamily.Array, classPrimitive getOrElse classReference, values: _*)

    case (CollectionFamily.Array, _) =>
      JavaValueContainer(CollectionFamily.Array, classReference, values: _*)

    case (ct, _) =>
      JavaValueContainer(ct, classReference, values: _*)
  }

  def isPrimitive =
    classPrimitive.isDefined.toString

  def hasGenerics =
    classValue(_: Box).contains('<').toString

  def javaType(box: Box) = classValue(box) match {
    case cv if cv.contains('<') =>
      s"""JavaCollectionType("${cv.replaceFirst("<.*>", "")}", JavaClass("${classReference}"))"""

    case cv =>
      s"""JavaSimpleType("${cv}")"""
  }

  def isDissalowed = defaultSingle eq DisallowedNullValue

  def nonDefaultValues(box: Box): Seq[TestValue] = box match {
    /* box.One */
    case Box(SingleFamily.One, None, _*) =>
      nonDefaultValues

    /* box.Nullable */
    case Box(SingleFamily.Nullable, None, aliases @ _*) =>
       (if (isDissalowed) Nil else Seq(defaultSingle)) ++
       nonDefaultValues(Box(SingleFamily.One, None, aliases: _*))

    /* box.OneArrayOfOne,  box.OneListOfOne, box.OneSetOfOne*/
    case Box(SingleFamily.One, Some((_, SingleFamily.One)), _*) =>
      (if (isDissalowed) Nil else Seq(
        defaultConcreteType(box, defaultSingle)
      )) ++
      Seq(
        defaultConcreteType(box, nonDefaultValues.last)
      , defaultConcreteType(box, borderSingleValues: _*)
      )

    /* box.NulableArrayOfOne, box.NulableSetOfOne, box.NulableListOfOne */
    case Box(SingleFamily.Nullable, s @ Some((base, SingleFamily.One)), aliases @ _*) =>
       nonDefaultValues(Box(SingleFamily.One, s, aliases: _*))

    /* box.OneArrayOfNullable,  box.OneListOfNullable, box.OneSetOfNullable */
    case Box(SingleFamily.One, Some((_, SingleFamily.Nullable)), _*) =>
      Seq(
        defaultConcreteType(box, NullJavaValue)
      ) ++
      (if (isDissalowed) Nil else Seq(
        defaultConcreteType(box, defaultSingle)
      )) ++
      Seq(
        defaultConcreteType(box, nonDefaultValues.last)
      , defaultConcreteType(box, borderSingleValues: _*)
      , defaultConcreteType(box, NullJavaValue +: borderSingleValues: _*)
      )

    /* box.NulableArrayOfNullable, box.NulableSetOfNullable, box.NulableListOfNullable */
    case Box(SingleFamily.Nullable, s @ Some((base, SingleFamily.Nullable)), aliases @ _*) =>
       nonDefaultValues(Box(SingleFamily.One, s, aliases: _*))
  }
}

}
