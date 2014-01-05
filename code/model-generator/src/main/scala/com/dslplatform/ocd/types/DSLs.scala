package com.dslplatform.ocd.types

import scala.collection.mutable.LinkedHashSet
import scalax.file._

import Types._
import Boxes._

object DSLs
    extends Generator {

  private def singleTypeToDSL(st: SingleType) =
    (_: String) + (st match {
      case SingleType.One => ""
      case SingleType.Nullable => "?"
    })

  private def boxToDSL(b: Box, alias: Option[String], caser: String => String) =
    b match {
      case Box(base, None, _*) =>
        singleTypeToDSL(base)

      case Box(base, Some((CollectionType.Array, et)), _*) if alias.isDefined =>
        (t: String) => singleTypeToDSL(base)(singleTypeToDSL(et)(t) + "[]")

      case Box(base, Some((ct, et)), _*) =>
        (t: String) => singleTypeToDSL(base)(caser(ct.toString) + "<" + singleTypeToDSL(et)(t) + ">")
    }

  def generate() {
    val root = spawnDirectory("dsls")

    val values = new LinkedHashSet[String]

    for (t <- Types.types) {
      (root / s"dsl.${t.name}.scala").write(s"""package com.dslplatform.ocd
package dsls

import types._
import boxes._

sealed trait `Dsl${t.name}`
    extends OcdDsl
    with `type.${t.name}` {

  def dslName = toString.substring(4)
}

${
  (for (typeName <- t.name +: t.derivedAliases) yield {
    val letters = typeName.filter(_.isLetter)

    val caser =
      if (letters.matches("[a-z]+")) (_: String).toLowerCase else
      if (letters.matches("[A-Z]+")) (_: String).toUpperCase else (_: String) + ""

  Boxes.boxes.flatMap(b =>
  ((None -> b.name) +: b.aliases.map(a => Some(a) -> a)) map { case(a, boxName) =>
    val value = s"`dsl.${boxToDSL(b, a, caser)(typeName)}`"
    values += value

s"""case object $value extends `Dsl${t.name}` with `box.${boxName}`
"""
  }
).mkString("")


  }).mkString("\n")

}""")
    }

    (root / s"package.scala").write(
s"""package com.dslplatform.ocd
package dsls

trait OcdDsl {
  def dslName: String
}

object OcdDsl {
  val values: IndexedSeq[OcdDsl] = IndexedSeq(
    ${values.mkString("\n  , ")}
  )
}
"""
    )
  }
}
