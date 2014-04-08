package com.dslplatform.ocd.generators

import scalax.file._
import Types._
import Boxes._
import scala.collection.mutable.LinkedHashSet
import scala.collection.mutable.LinkedHashMap

object Dsls
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
    val root = spawnDirectory("dsls", "scala")

    val values = new LinkedHashSet[String]

    for (t <- Types.types) {
      val name = t.name.grammarName

      val dslSegments =
      for (typeName <- t.name.grammarName +: t.derivedAliases) yield {
        val letters = typeName.filter(_.isLetter)

        val caser =
          if (letters.matches("[a-z]+")) (_: String).toLowerCase else
          if (letters.matches("[A-Z]+")) (_: String).toUpperCase else (_: String) + ""

        val localValues = new LinkedHashMap[String, String]

        Boxes.boxes.flatMap{b =>
          ((None -> b.name) +: b.aliases.map(a => Some(a) -> a)) map { case(a, boxName) =>
            val value = s"`dsl.${boxToDSL(b, a, caser)(typeName)}`"
            localValues(value) =
              s"case object $value ...extends Dsl${t.name.singleName} with `box.${boxName}`"
          }
        }

        values ++= localValues.keys

        val maxVal = localValues.keys.map(_.length).max

        localValues.map{ case (v, co) =>
          co.replace("...", " " * (maxVal - v.length))
        }.mkString("\n")
      }

        (root / s"dsl.${name}.scala").write(s"""package com.dslplatform.ocd
package dsls

import types._
import boxes._

sealed trait Dsl${t.name.singleName}
    extends OcdDsl
    with `type.${t.name.grammarName}`

${dslSegments.mkString("\n\n")}
""")
    }

    (root / s"package.scala").write(
s"""package com.dslplatform.ocd
package dsls

trait OcdDslValues {
  val values: IndexedSeq[OcdDsl] = IndexedSeq(
    ${values.mkString("\n  , ")}
  )
}
"""
    )
  }
}
