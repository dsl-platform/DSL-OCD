package com.dslplatform.ocd
package javas

trait JavaValue {
  def stability: JavaStability
  def isNull = toString == "null"
}

trait JavaValueContainer extends JavaValue {
  def values: Seq[JavaValue]

  def stability = JavaStability.getStable(
      values.forall(_.stability.isStable))
}

trait JavaEntryContainer extends JavaValue {
  def values: Seq[(JavaValue, JavaValue)]

  def stability = JavaStability.getStable(
      values.forall{ case (k, v) => k.stability.isStable && v.stability.isStable})
}

case class SingleJavaValue(
    text: String
  , val stability: JavaStability
  ) extends JavaValue {

  override val toString = text
}

case object DisallowedNullValue extends JavaValue {
  val stability = JavaStability.Stable
  override val toString = "null"
}

object SingleJavaValue {
  def apply(text: String): SingleJavaValue =
    SingleJavaValue(text, JavaStability.Stable)
}

case class ArrayOfJavaValues(
    elementClass: String
  , values: JavaValue*
  ) extends JavaValueContainer {

  override val toString = "new " + elementClass + "[] " + values.mkString("{ ", ", ", " }")
}

case class ListOfJavaValues(
    elementClass: String
  , values: JavaValue*
  ) extends JavaValueContainer {

  override val toString = "new java.util.ArrayList<" + elementClass + values.map(_ match {
    case x if x.isNull => "(" + elementClass + ") " + x
    case x => x
  }).mkString(">(java.util.Arrays.<" + elementClass + ">asList(", ", ", "))")
}

case class SetOfJavaValues(
    elementClass: String
  , values: JavaValue*
  ) extends JavaValueContainer {

  override val toString = "new java.util.HashSet<" + elementClass + values.map(_ match {
    case x if x.isNull => "(" + elementClass + ") " + x
    case x => x
  }).mkString(">(java.util.Arrays.<" + elementClass + ">asList(", ", ", "))")
}

case class QueueOfJavaValues(
    elementClass: String
  , values: JavaValue*
  ) extends JavaValueContainer {

  override val toString = "new java.util.ArrayDeque<" + elementClass + values.map(_ match {
    case x if x.isNull => "(" + elementClass + ") " + x
    case x => x
  }).mkString(">(java.util.Arrays.<" + elementClass + ">asList(", ", ", "))")
}

case class LinkedListOfJavaValues(
    elementClass: String
  , values: JavaValue*
  ) extends JavaValueContainer {

  override val toString = "new java.util.LinkedList<" + elementClass + values.map(_ match {
    case x if x.isNull => "(" + elementClass + ") " + x
    case x => x
  }).mkString(">(java.util.Arrays.<" + elementClass + ">asList(", ", ", "))")
}

case class StackOfJavaValues(
    elementClass: String
  , values: JavaValue*
  ) extends JavaValueContainer {

  override val toString = "new java.util.Stack<" + elementClass + values.map(_ match {
    case x if x.isNull => "(" + elementClass + ") " + x
    case x => x
  }).mkString(">() {{ addAll(java.util.Arrays.<" + elementClass + ">asList(", ", ", ")); } private static final long serialVersionUID = 0; }")
}

case class VectorOfJavaValues(
    elementClass: String
  , values: JavaValue*
  ) extends JavaValueContainer {

  override val toString = "new java.util.Vector<" + elementClass + values.map(_ match {
    case x if x.isNull => "(" + elementClass + ") " + x
    case x => x
  }).mkString(">(java.util.Arrays.<" + elementClass + ">asList(", ", ", "))")
}

case class MapOfJavaValues(
    keyClass: String
  , valueClass: String
  , values: (JavaValue, JavaValue)*
  ) extends JavaEntryContainer {

  override val toString = "new java.util.HashMap<" + keyClass + ", " + valueClass + ">() " + (values.map{ case (k, v) =>
    "put(" + k + ", " + v + ");"
  }).mkString("{{ ", " ", " } private static final long serialVersionUID = 0; }")
}
