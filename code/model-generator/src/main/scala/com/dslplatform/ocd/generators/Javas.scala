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
    , "Bool" -> JavaBool
    , "Date" -> JavaDate
    , "Decimal" -> JavaDecimal
    , "Decimal(9)" -> JavaDecimalWithScale
    , "Double" -> JavaDouble
    , "Float" -> JavaFloat
    , "Guid" -> JavaGuid
    , "Image" -> JavaImage
    , "Integer" -> JavaInteger
    , "Location" -> JavaLocation
    , "Long" -> JavaLong
    , "Map" -> JavaMap
    , "Money" -> JavaMoney
    , "Point" -> JavaPoint
    , "Rectangle" -> JavaRectangle
    , "S3" -> JavaS3
    , "String" -> JavaString
    , "String(9)" -> JavaStringWithLength
    , "Timestamp" -> JavaTimestamp
    , "Url" -> JavaUrl
    , "Xml" -> JavaXml
    )

  def generate() {
    val root = spawnDirectory("javas")

    val values = new LinkedHashSet[String]

    for (t <- Types.types if stubs.isDefinedAt(t.name)) yield {

      val stub = stubs(t.name)

      (root / s"java.${t.name}.scala").write(
s"""package com.dslplatform.ocd
package javas

import types._
import boxes._

sealed trait `Java${t.name}`
    extends OcdJava
    with `type.${t.name}`

${
    Boxes.boxes.map{b =>
      val value = s"`java.${boxToJavaName(b)(t.name)}`"
      values += value

s"""case object $value
    extends `Java${t.name}` with `box.${b.name}` {

  val javaClass = "${stub.classValue(b)}"

  val defaultValue = "${stub.defaultValue(b)}"

  val isPrimitive = ${stub.isPrimitive}
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
  val defaultValue: String

  val isPrimitive: Boolean
  val hasGenerics: Boolean
}

object OcdJava extends {
  val values: IndexedSeq[OcdJava] = IndexedSeq(
    ${values.mkString("\n  , ")}
  )
} with OcdJavaResolver
""")
  }
}
