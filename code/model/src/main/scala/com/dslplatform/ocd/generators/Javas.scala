package com.dslplatform.ocd.generators

import scalax.file._
import Types._
import Boxes._
import scalax.file._
import javas._

import scala.collection.mutable.LinkedHashSet

object Javas
    extends Generator {

  private def singleTypeToJavaName(st: SingleType) =
    (_: String) + (st match {
      case SingleType.One => ""
      case SingleType.Nullable => "?"
    })

  private def boxToJava(b: Box) =
    b match {
      case Box(base, None, _*) =>
        singleTypeToJavaName(base)

      case Box(base, Some((CollectionType.Array, et)), _*) =>
        (t: String) => singleTypeToJavaName(base)(singleTypeToJavaName(et)(t) + "[]")

      case Box(base, Some((ct, et)), _*) =>
        (t: String) => singleTypeToJavaName(base)(ct + "<" + singleTypeToJavaName(et)(t) + ">")
    }

  private def boxToJavaName(b: Box) =
    b match {
      case Box(base, None, _*) =>
        singleTypeToJavaName(base)

      case Box(base, Some((CollectionType.Array, et)), _*) =>
        (t: String) => singleTypeToJavaName(base)(singleTypeToJavaName(et)(t) + "[]")

      case Box(base, Some((ct, et)), _*) =>
        (t: String) => singleTypeToJavaName(base)(ct + "<" + singleTypeToJavaName(et)(t) + ">")
    }

  val stubs = Map(
    "Binary" -> JavaBinary
  , "Boolean" -> JavaBool
  , "Date" -> JavaDate
  , "Decimal" -> JavaDecimal
  , "Decimal(9)" -> JavaDecimalWithScale
  , "Double" -> JavaDouble
  , "Float" -> JavaFloat
  , "Guid" -> JavaGuid
  , "Image" -> JavaImage
  , "Integer" -> JavaInteger
  , "Ip" -> JavaIp
  , "Location" -> JavaLocation
  , "Long" -> JavaLong
  , "Map" -> JavaMap
  , "Money" -> JavaMoney
  , "Point" -> JavaPoint
  , "Rectangle" -> JavaRectangle
//  , "S3" -> JavaS3
  , "String" -> JavaString
  , "String(9)" -> JavaStringWithMaxLength
  , "Text" -> JavaText
  , "Timestamp" -> JavaTimestamp
  , "Url" -> JavaUrl
  , "Xml" -> JavaXml
  )

  def generate() {
    val root = spawnDirectory("javas", "scala")

    val values = new LinkedHashSet[String]

    for (t <- Types.types if stubs.isDefinedAt(t.name.grammarName)) yield {

      val name = t.name.grammarName
      val stub = stubs(name)

      (root / s"java.${name}.scala").write(
s"""package com.dslplatform.ocd
package javas

import types._
import boxes._

sealed trait Java${t.name.singleName}
    extends OcdJava
    with `type.${name}` {

  val isPrecise = ${stub match {
    case JavaFloat | JavaDouble | JavaLocation | JavaRectangle => true
    case _ => false
  }}
  val isPrimitive = ${stub.isPrimitive}
}

${
    Boxes.boxes.map{b =>
      val value = s"`java.${boxToJavaName(b)(name)}`"
      values += value

      val cv = stub.classValue(b)

s"""case object $value
    extends Java${t.name.singleName} with `box.${b.name}` {

  val javaClass = "${cv}"
  val javaType = ${stub.javaType(b)}

  def defaultValue = ${stub.defaultValue(b)}

  def nonDefaultValues = ${stub.nonDefaultValues(b).mkString(
    "IndexedSeq(\n    "
  , "\n  , "
  , "\n  )"
  )}

  val hasGenerics = ${stub.hasGenerics(b)}
}
"""
  }.mkString("\n")
}""")

    }

    (root / s"package.scala").write(
s"""package com.dslplatform.ocd
package javas

trait OcdJava
    extends types.OcdType
    with boxes.OcdBox {

  val javaClass: String
  val javaType: JavaType

  def defaultValue: JavaValue
  def nonDefaultValues: IndexedSeq[JavaValue]
  def borderValues = defaultValue +: nonDefaultValues

  val isPrecise: Boolean
  val isPrimitive: Boolean
  val hasGenerics: Boolean

  protected val Stable = JavaStability.Stable
  protected val Unstable = JavaStability.Unstable
}

object OcdJava extends {
  val values: IndexedSeq[OcdJava] = IndexedSeq(
    ${values.mkString("\n  , ")}
  )
} with OcdJavaResolver

sealed trait JavaType { def baseClass: String }
case class JavaClass(baseClass: String) extends JavaType
case class SimpleType(baseClass: String) extends JavaType
case class CollectionType(baseClass: String, elementType: JavaType) extends JavaType
case class GenericType(baseClass: String, elementTypes: JavaType*) extends JavaType

sealed trait JavaStability {
  def isStable = this == JavaStability.Stable
}

object JavaStability {
  case object Stable extends JavaStability
  case object Unstable extends JavaStability

  val values = IndexedSeq(Stable, Unstable)

  def getStable(stable: Boolean) =
    if (stable) Stable else Unstable
}

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
""")
  }
}
