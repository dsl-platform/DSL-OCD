package com.dslplatform.ocd.types

import scala.collection.mutable.LinkedHashSet
import scalax.file._

object Types
    extends Generator {

  case class Type(name: String, aliases: String*) {
    def derivedAliases =
      (name +: aliases) flatMap( n =>
        Seq(n, n.toUpperCase, n.toLowerCase)
      ) sortBy(identity) filterNot(name==)
  }

  val types = Seq(
    Type("Binary")
  , Type("Bool", "Boolean")
  , Type("Color")
  , Type("Date")
  , Type("Decimal")
  , Type("Double")
  , Type("Float")
  , Type("Guid", "Uuid")
  , Type("Image", "Picture")
  , Type("Integer", "Int")
  , Type("IP")
  , Type("Json")
  , Type("Key-Value", "Map", "Dictionary")
  , Type("Location")
  , Type("Long", "BigInt")
  , Type("Money")
  , Type("Native")
  , Type("Point")
  , Type("Rectangle", "Box")
  , Type("S3")
  , Type("Secret")
  , Type("String", "Text")
  , Type("Timestamp", "DateTime")
  , Type("Url")
  , Type("Xml")
  )

  def generate {
    val root = spawnDirectory("types")

    for (t <- types) {
      (root / s"type.${t.name}.scala").write(
s"""package com.dslplatform.ocd
package types

trait `type.${t.name}`
    extends OcdType {

  def typeName = "${t.name}"

  def typeAliases = Set(
    ${t.derivedAliases.mkString("\"", "\"\n  , \"", "\"")}
  )
}

case object `type.${t.name}` extends `type.${t.name}`
""")
    }

    (root / s"package.scala").write(
s"""package com.dslplatform.ocd

package types {
  trait OcdType {
    def typeName: String

    def typeAliases: Set[String]
  }

  object OcdType {
    val values: IndexedSeq[OcdType] = IndexedSeq(
      ${types.map(t => s"`type.${t.name}`").mkString("\n    , ")}
    )
  }
}

package object types {
  ${types.filter(_.derivedAliases.nonEmpty).map{ t =>
    t.derivedAliases.map{ a =>
    s"""type `type.$a` = `type.${t.name}`
  val  `type.$a` = `type.${t.name}`"""
  }.mkString("\n  ")}.mkString("\n\n  ")
}
}
"""
    )
  }
}
