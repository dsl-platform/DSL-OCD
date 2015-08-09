package com.dslplatform.ocd
package generator
package javas

import types._
import boxes._

import scalax.file._
import scala.collection.mutable.LinkedHashSet

object JavaGenerator
    extends Generator
    with JavaValues {

  private def SingleFamilyToJavaName(st: SingleFamily) =
    (_: String) + (st match {
      case SingleFamily.One => ""
      case SingleFamily.Nullable => "?"
    })

/*
  private def boxToJava(b: Box) =
    b match {
      case Box(base, None, _*) =>
        SingleFamilyToJavaName(base)

      case Box(base, Some((CollectionFamily.Array, et)), _*) =>
        (t: String) => SingleFamilyToJavaName(base)(SingleFamilyToJavaName(et)(t) + "[]")

      case Box(base, Some((ct, et)), _*) =>
        (t: String) => SingleFamilyToJavaName(base)(ct + "<" + SingleFamilyToJavaName(et)(t) + ">")
    }
*/

  private def boxToJavaName(b: Box) =
    b match {
      case Box(base, None, _*) =>
        SingleFamilyToJavaName(base)

      case Box(base, Some((CollectionFamily.Array, et)), _*) =>
        (t: String) => SingleFamilyToJavaName(base)(SingleFamilyToJavaName(et)(t) + "[]")

      case Box(base, Some((ct, et)), _*) =>
        (t: String) => SingleFamilyToJavaName(base)(ct + "<" + SingleFamilyToJavaName(et)(t) + ">")
    }

  import javatypes._

  def generate(): Unit = {
    val root = spawnDirectory("javas", "scala")

    val values = new LinkedHashSet[String]

    for (t <- TypeGenerator.typeValues if stubs.isDefinedAt(t.name.dslName)) yield {

      val name = t.name.dslName
      val stub = stubs(name)

      (root / s"java.${t.name.typeNameSafe}.scala").write(
s"""package com.dslplatform.ocd
package javas

import types._
import boxes._

sealed trait Java${t.name.singleName}
    extends OcdJavaBoxType
    with `type.${name}` {

  val isPrecise = ${stub match {
    case JavaFloat | JavaDouble | JavaLocation | JavaRectangle => true
    case _ => false
  }}
  val isPrimitive = ${stub.isPrimitive}
  val isEqualable = ${stub match {
    case JavaImage | JavaXml => false
    case _ => true
  }}
}

${
    BoxGenerator.boxValues.map{b =>
      val value = s"`java.${boxToJavaName(b)(name)}`"
      values += value

      val cv = stub.classValue(b)

s"""case object $value
    extends Java${t.name.singleName} with `box.${b.name}` {

  val javaClass = "${cv}"
  val javaType = ${stub.javaType(b)}
  val javaDescription = "${b.name +
    (if (b.collectionFamily.isDefined) t.name.pluralName else t.name.singleName)}"

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

    (root / s"OcdJavaBoxTypeValues.scala").write(
s"""package com.dslplatform.ocd
package javas

trait OcdJavaBoxTypeValues {
  val values: IndexedSeq[OcdJavaBoxType] = IndexedSeq(
    ${values.mkString("\n  , ")}
  )
}
""")
  }
}
