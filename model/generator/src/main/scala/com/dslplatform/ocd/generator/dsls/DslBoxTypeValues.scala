package com.dslplatform.ocd
package generator
package dsls

import boxes._
import types._

import scala.collection.mutable.LinkedHashSet
import scala.collection.mutable.LinkedHashMap

trait DslBoxTypeValues {
  private def singleFamilyToDSL(st: SingleFamily) =
    (_: String) + (st match {
      case SingleFamily.One => ""
      case SingleFamily.Nullable => "?"
    })

  private def boxToDSL(b: Box, alias: Option[String], caser: String => String) =
    b match {
      case Box(base, None, _*) =>
        singleFamilyToDSL(base)

      case Box(base, Some((CollectionFamily.Array, et)), _*) if alias.isDefined =>
        (t: String) => singleFamilyToDSL(base)(singleFamilyToDSL(et)(t) + "[]")

      case Box(base, Some((ct, et)), _*) =>
        (t: String) => singleFamilyToDSL(base)(caser(ct.toString) + "<" + singleFamilyToDSL(et)(t) + ">")
    }

  val (dslValues, dslSegments) = {
    val values = new LinkedHashSet[String]

    val segments =
      for (t <- TypeGenerator.typeValues) yield {
        t -> (for (typeName <- t.name.dslName +: t.derivedAliases.take(0)) yield {

          val name = t.name.dslName
          val letters = typeName.filter(_.isLetter)

          val caser =
            if (letters.matches("[a-z]+")) (_: String).toLowerCase else
            if (letters.matches("[A-Z]+")) (_: String).toUpperCase else (_: String) + ""

          val localValues = new LinkedHashMap[String, String]

          BoxGenerator.boxValues.flatMap{b =>
            ((None -> b.name) +: b.aliases.map(a => Some(a) -> a)) map { case(a, boxName) =>
              val value = s"`dsl.${boxToDSL(b, a, caser)(typeName)}`"
              localValues(value) =
                s"case object $value ...extends Dsl${t.name.singleName} with `box.${boxName}`"
            }
          }

          values ++= localValues.keys

          val maxVal = localValues.keys.map(_.length) match { case x if x.nonEmpty => x.max; case _ => 0 }

          localValues.map{ case (v, co) =>
            co.replace("...", " " * (maxVal - v.length))
          }.mkString("\n")
        }
      )}

    (values, segments)
  }
}
