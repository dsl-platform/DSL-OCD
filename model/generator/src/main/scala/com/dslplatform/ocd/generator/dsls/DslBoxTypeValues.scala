package com.dslplatform.ocd
package generator
package dsls

import boxes._
import types._

import scala.collection.mutable.LinkedHashSet
import scala.collection.mutable.LinkedHashMap

trait DslBoxTypeValues {
  private def singleFamilyToDsl(sf: SingleFamily) =
    (_: String) + (sf match {
      case SingleFamily.One => ""
      case SingleFamily.Nullable => "?"
    })

  private def collectionFamilyToDsl(cf: CollectionFamily) =
    cf.toString.replaceAll("([a-z])([A-Z])", "$1 $2")

  private def boxToDsl(b: Box, alias: Option[String], caser: String => String) =
    b match {
      case Box(base, None, _*) =>
        singleFamilyToDsl(base)

      case Box(base, Some((CollectionFamily.Array, et)), _*) if alias.isDefined =>
        (t: String) => singleFamilyToDsl(base)(singleFamilyToDsl(et)(t) + "[]")

      case Box(base, Some((cf, et)), _*) =>
        (t: String) => singleFamilyToDsl(base)(caser(collectionFamilyToDsl(cf)) + "<" + singleFamilyToDsl(et)(t) + ">")
    }

  val dslSegments = {
    for (t <- TypeGenerator.typeValues) yield {
      t -> (for (typeName <- t.name.dslName +: t.derivedAliases) yield {
        val letters = typeName.filter(_.isLetter)

        val caser =
          if (letters.matches("[a-z]+")) (_: String).toLowerCase else
          if (letters.matches("[A-Z]+")) (_: String).toUpperCase else (_: String) + ""

        val localValues = new LinkedHashMap[String, String]

        BoxGenerator.boxValues.flatMap { b =>
          val boxWithAliases = (None -> b.name) +: b.aliases.map(a => Some(a) -> a)
          boxWithAliases map { case (a, boxName) =>
            val value = s"`dsl.${boxToDsl(b, a, caser)(typeName)}`"
            localValues(value) = s"case object $value ...extends Dsl${t.name.singleName} with `box.${boxName}`"
          }
        }

        val maxVal = localValues.keys.map(_.length) match { case x if x.nonEmpty => x.max; case _ => 0 }
        localValues map { case (v, co) =>
          val spacing = " " * (maxVal - v.length)
          (v, (co.replace("...", spacing), spacing))
        }
      }
    )}
  }
}
