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

object DisallowedNullValue
    extends SingleJavaValue("null", JavaStability.Stable)

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

  override val toString = "new java.util.ArrayList<" + elementClass + ">() " + values.mkString("{{ add(", "); add(", "); }}")
}

case class SetOfJavaValues(
    elementClass: String
  , values: JavaValue*
  ) extends JavaValueContainer {

  override val toString = "new java.util.HashSet<" + elementClass + ">() " + values.mkString("{{ add(", "); add(", "); }}")
}

case class MapOfJavaValues(
    keyClass: String
  , valueClass: String
  , values: Pair[JavaValue, JavaValue]*
  ) extends JavaEntryContainer {

  override val toString = "new java.util.HashMap<" + keyClass + ", " + valueClass + ">() " + (values.map{ case (k, v) =>
    "put(" + k + ", " + v + ");"
  }).mkString("{{ ", " ", " }}")
}
