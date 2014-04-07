package com.dslplatform.ocd.generators

import scalax.file._

object Boxes
    extends Generator {

  sealed trait SingleType
  object SingleType {
    case object One extends SingleType
    case object Nullable extends SingleType

    val values: IndexedSeq[SingleType] = IndexedSeq(
      One
    , Nullable
    )
  }

  sealed trait CollectionType {
    def aliases = Seq.empty[String]
  }
  object CollectionType {
    case object Array extends CollectionType {
      override def aliases = Seq("Brackets")
    }
    case object List extends CollectionType
    case object Set extends CollectionType

    val values: IndexedSeq[CollectionType] = IndexedSeq(
      Array
    , List
    , Set
    )
  }

  case class Box(
    base: SingleType
  , collectionType: Option[(CollectionType, SingleType)]
  , aliases: String*) {

    val name = base +
      collectionType.map(c => c._1 + "Of" + c._2).getOrElse("")
  }

  def boxOrder(box: Box) =
    box.collectionType.map(_._1.toString.head) -> box.collectionType.map(-_._2.toString.head)

  val boxes =
    SingleType.values.flatMap( s =>
      Box(s, None) +:
      CollectionType.values.flatMap( c =>
        SingleType.values.map( e =>
          Box(s, Some((c, e)), c.aliases.map(a =>
            s + a + "Of" + e
          ): _*)
        )
      )
    ).sortBy(boxOrder)

  def generate() {
    val root = spawnDirectory("boxes", "scala")

    for (b <- boxes) {
      (root / s"box.${b.name}.scala").write(
s"""package com.dslplatform.ocd
package boxes

trait `box.${b.name}`
    extends OcdBox {

  type boxType = `box.${b.name}`
  val boxClass = classOf[`box.${b.name}`]
  val boxName = "${b.name}"
${if (b.aliases.isEmpty) {""} else {s"""
  override val boxAliases = Set(
    ${b.aliases.mkString("\"", "\"\n  , \"", "\"")}
  )
"""}}
  val isNullable = ${b.base eq SingleType.Nullable}
  val isCollection = ${b.collectionType.isDefined}

  val collectionType = ${
    b.collectionType.map("CollectionType." + _._1)
  }
  val areElementsNullable = ${
    b.collectionType.map(_._2 eq SingleType.Nullable)
  }
}

case object `box.${b.name}` extends `box.${b.name}`
""")
    }

    (root / s"package.scala").write(
s"""package com.dslplatform.ocd

package boxes {
  sealed trait CollectionType {
    def aliases = Seq.empty[String]
  }

  object CollectionType {
    case object Array extends CollectionType {
      override def aliases = Seq("Brackets")
    }
    case object List extends CollectionType
    case object Set extends CollectionType

    val values: IndexedSeq[CollectionType] = IndexedSeq(
      Array
    , List
    , Set
    )
  }

  trait OcdBox {
    type boxType <: OcdBox
    val boxClass: Class[boxType]
    val boxName: String

    val boxAliases = Set.empty[String]

    val isNullable: Boolean
    val isCollection: Boolean

    val collectionType: Option[CollectionType]
    val areElementsNullable: Option[Boolean]
  }

  object OcdBox {
    val values: IndexedSeq[OcdBox] = IndexedSeq(
      ${boxes.map(t => s"`box.${t.name}`").mkString("\n    , ")}
    )
  }
}

package object boxes {
  ${boxes.filter(_.aliases.nonEmpty).map{ b =>
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
