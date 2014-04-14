package com.dslplatform.ocd
package generator
package boxes

import scalax.file._

object BoxGenerator
    extends Generator
    with BoxValues {

  def generate(): Unit = {
    val root = spawnDirectory("boxes", "scala")

    for (b <- boxValues) {
      (root / s"box.${b.name}.scala").write(
s"""package com.dslplatform.ocd
package boxes

trait `box.${b.name}`
    extends OcdBox {

  type boxType = `box.${b.name}`
  val boxClass = classOf[`box.${b.name}`]

  val boxName = "${b.name}"
  val boxNameShort = "${b.base.shortName}${b.collectionFamily.map(c => c._1.shortName + c._2.shortName).getOrElse("")}"
  val boxAliases = Set${if (b.aliases.isEmpty) ".empty[String]" else b.aliases.mkString("(\"", "\", \"", "\")") }

  val isOne = ${b.base eq SingleFamily.One}
  val isNullable = ${b.base eq SingleFamily.Nullable}
  val singleFamily = SingleFamily.${b.base}

  val isSingle = ${b.collectionFamily.isEmpty}
  val isCollection = ${b.collectionFamily.nonEmpty}
  val collectionFamily = ${b.collectionFamily.map("CollectionFamily." + _._1)}

  val areElementsOne = ${b.collectionFamily.map(_._2 eq SingleFamily.One)}
  val areElementsNullable = ${b.collectionFamily.map(_._2 eq SingleFamily.Nullable)}
  val elementFamily = ${b.collectionFamily.map("SingleFamily." + _._2)}
}

case object `box.${b.name}` extends `box.${b.name}`
""")
    }

    (root / s"package.scala").write(
s"""package com.dslplatform.ocd

package boxes {
  trait OcdBoxValues {
    val values: IndexedSeq[OcdBox] = IndexedSeq(
      ${boxValues.map(t => s"`box.${t.name}`").mkString("\n    , ")}
    )
  }
}

package object boxes {
  ${boxValues.filter(_.aliases.nonEmpty).map{ b =>
    b.aliases.map{ a =>
    s"""type `box.$a` = `box.${b.name}`
  val  `box.$a` = `box.${b.name}`"""
  }.mkString("\n  ")}.mkString("\n\n  ")
}
}
"""
    )
  }
}
