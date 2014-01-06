package com.dslplatform.ocd.generators

import scalax.file._

object Types
    extends Generator {

  case class Type(name: String, aliases: String*) {
    def derivedAliases =
      (name +: aliases) flatMap( n => Set(
        n
      , n.toUpperCase
      , n.toLowerCase
      , n.head.toUpper + n.tail.toLowerCase
      )) sortBy(identity) filterNot(name==)
  }

  val types = Seq(
    Type("Binary")
  , Type("Bits")
  , Type("Bool", "Boolean")
  , Type("Color")
  , Type("Date")
  , Type("Decimal")
  , Type("Decimal(9)")
  , Type("Double")
  , Type("Email")
  , Type("Float")
  , Type("Guid", "Uuid")
  , Type("Image", "Picture")
  , Type("Integer", "Int")
  , Type("Ip")
  , Type("Json")
  , Type("Location")
  , Type("Long", "BigInt")
  , Type("Map", "Dictionary")
  , Type("Money")
  , Type("Native")
  , Type("Phone")
  , Type("Point")
  , Type("Rectangle", "Box")
  , Type("S3")
  , Type("Secret")
  , Type("Stream")
  , Type("String")
  , Type("String(9)")
  , Type("Text")
  , Type("Time")
  , Type("Timestamp", "DateTime")
  , Type("Url", "Link")
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

  type typeType = `type.${t.name}`

  val typeClass = classOf[`type.${t.name}`]

  val typeName = "${t.name}"
${if (t.derivedAliases.isEmpty) {""} else {s"""
  override val typeAliases = Set(
    ${t.derivedAliases.mkString("\"", "\"\n  , \"", "\"")}
  )
"""}}}

case object `type.${t.name}` extends `type.${t.name}`
""")
    }

    (root / s"package.scala").write(
s"""package com.dslplatform.ocd

package types {
  trait OcdType {
    type typeType <: OcdType

    val typeClass: Class[typeType]

    val typeName: String

    val typeAliases = Set.empty[String]
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
