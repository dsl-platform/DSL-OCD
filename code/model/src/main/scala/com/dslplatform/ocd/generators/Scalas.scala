package com.dslplatform.ocd.generators

import scalax.file._
import Types._
import Boxes._
import scalax.file._
import scalas._

import scala.collection.mutable.LinkedHashSet

object Scalas
    extends Generator {

  private def singleTypeToScalaName(st: SingleType) =
    (_: String) + (st match {
      case SingleType.One => ""
      case SingleType.Nullable => "?"
    })

  private def boxToScala(b: Box) =
    b match {
      case Box(base, None, _*) =>
        singleTypeToScalaName(base)

      case Box(base, Some((CollectionType.Array, et)), _*) =>
        (t: String) => singleTypeToScalaName(base)(singleTypeToScalaName(et)(t) + "[]")

      case Box(base, Some((ct, et)), _*) =>
        (t: String) => singleTypeToScalaName(base)(ct + "<" + singleTypeToScalaName(et)(t) + ">")
    }

  private def boxToScalaName(b: Box) =
    b match {
      case Box(base, None, _*) =>
        singleTypeToScalaName(base)

      case Box(base, Some((CollectionType.Array, et)), _*) =>
        (t: String) => singleTypeToScalaName(base)(singleTypeToScalaName(et)(t) + "[]")

      case Box(base, Some((ct, et)), _*) =>
        (t: String) => singleTypeToScalaName(base)(ct + "<" + singleTypeToScalaName(et)(t) + ">")
    }

  val stubs = Map(
    "Binary" -> ScalaBinary
  , "Boolean" -> ScalaBool
  , "Date" -> ScalaDate
  , "Decimal" -> ScalaDecimal
  , "Decimal(9)" -> ScalaDecimalWithScale
  , "Double" -> ScalaDouble
  , "Float" -> ScalaFloat
  , "Guid" -> ScalaGuid
  , "Image" -> ScalaImage
  , "Integer" -> ScalaInteger
  , "Ip" -> ScalaIp
  , "Location" -> ScalaLocation
  , "Long" -> ScalaLong
  , "Map" -> ScalaMap
  , "Money" -> ScalaMoney
  , "Point" -> ScalaPoint
  , "Rectangle" -> ScalaRectangle
//  , "S3" -> ScalaS3
  , "String" -> ScalaString
  , "String(9)" -> ScalaStringWithMaxLength
  , "Text" -> ScalaText
  , "Timestamp" -> ScalaTimestamp
  , "Url" -> ScalaUrl
  , "Xml" -> ScalaXml
  )

  def generate() {
    val root = spawnDirectory("scalas", "scala")

    val values = new LinkedHashSet[String]

    for (t <- Types.types if stubs.isDefinedAt(t.name.grammarName)) yield {

      val name = t.name.grammarName
      val stub = stubs(name)

      (root / s"scala.${name}.scala").write(
s"""package com.dslplatform.ocd
package scalas

import types._
import boxes._

sealed trait Scala${t.name.singleName}
    extends OcdScala
    with `type.${name}`

${
    Boxes.boxes.map{b =>
      val value = s"`scala.${boxToScalaName(b)(name)}`"
      values += value

s"""case object $value
    extends Scala${t.name.singleName} with `box.${b.name}` {

  val scalaClass = "${stub.classValue(b)}"

  val defaultValue = "${stub.defaultValue(b)}"
}
"""
  }.mkString("\n")
}""")

    }

    (root / s"package.scala").write(
s"""package com.dslplatform.ocd
package scalas

trait OcdScala
    extends types.OcdType
    with boxes.OcdBox {

  val scalaClass: String
  val defaultValue: String
}

object OcdScala extends {
  val values: IndexedSeq[OcdScala] = IndexedSeq(
    ${values.mkString("\n  , ")}
  )
} with OcdScalaResolver
""")
  }
}
