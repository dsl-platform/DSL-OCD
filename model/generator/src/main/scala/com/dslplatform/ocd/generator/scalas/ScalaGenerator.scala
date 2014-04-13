package com.dslplatform.ocd
package generator
package scalas

import types._
import boxes._

import scalatypes._

import scalax.file._
import scala.collection.mutable.LinkedHashSet

object ScalaGenerator
    extends Generator
    with ScalaValues {

  private def singleFamilyToScalaName(st: SingleFamily) =
    (_: String) + (st match {
      case SingleFamily.One => ""
      case SingleFamily.Nullable => "?"
    })

  private def boxToScala(b: Box) =
    b match {
      case Box(base, None, _*) =>
        singleFamilyToScalaName(base)

      case Box(base, Some((CollectionFamily.Array, et)), _*) =>
        (t: String) => singleFamilyToScalaName(base)(singleFamilyToScalaName(et)(t) + "[]")

      case Box(base, Some((ct, et)), _*) =>
        (t: String) => singleFamilyToScalaName(base)(ct + "<" + singleFamilyToScalaName(et)(t) + ">")
    }

  private def boxToScalaName(b: Box) =
    b match {
      case Box(base, None, _*) =>
        singleFamilyToScalaName(base)

      case Box(base, Some((CollectionFamily.Array, et)), _*) =>
        (t: String) => singleFamilyToScalaName(base)(singleFamilyToScalaName(et)(t) + "[]")

      case Box(base, Some((ct, et)), _*) =>
        (t: String) => singleFamilyToScalaName(base)(ct + "<" + singleFamilyToScalaName(et)(t) + ">")
    }

  def generate(): Unit = {
    val root = spawnDirectory("scalas", "scala")

    val values = new LinkedHashSet[String]

    for (t <- TypeGenerator.typeValues if stubs.isDefinedAt(t.name.dslName)) yield {

      val name = t.name.dslName
      val stub = stubs(name)

      (root / s"scala.${t.name.typeNameSafe}.scala").write(
s"""package com.dslplatform.ocd
package scalas

import types._
import boxes._

sealed trait Scala${t.name.singleName}
    extends OcdScalaBoxType
    with `type.${name}`

${
    BoxGenerator.boxValues.map{b =>
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

    (root / s"OcdScalaBoxTypeValues.scala").write(
s"""package com.dslplatform.ocd
package scalas

trait OcdScalaBoxTypeValues {
  val values: IndexedSeq[OcdScalaBoxType] = IndexedSeq(
    ${values.mkString("\n  , ")}
  )
}
""")
  }
}
