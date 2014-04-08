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

      (root / s"java.${t.name.typeNameSafe}.scala").write(
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

trait OcdJavaValues {
  val values: IndexedSeq[OcdJava] = IndexedSeq(
    ${values.mkString("\n  , ")}
  )
}
""")
  }
}
