package com.dslplatform.ocd.generators

import scalax.file._

object Types
    extends Generator {

  object TypeName {
    def apply(name: String): TypeName =
      apply(name, name + "s")

    def apply(singleName: String, pluralName: String): TypeName =
      TypeName(singleName, singleName, pluralName)
  }

  case class TypeName(
      grammarName: String,
      singleName: String,
      pluralName: String) {
    def typeNameSafe = grammarName.replaceAll("[^-\\w]+", "")
  }

  object Type {
    def apply(name: String, aliases: String*): Type =
      Type(TypeName(name), aliases.map(TypeName(_)))
  }

  case class Type(name: TypeName, aliases: Seq[TypeName] = Nil) {
    def derivedAliases =
      (name +: aliases) map(_.grammarName) flatMap( n => Set(
        n
      , n.toUpperCase
      , n.toLowerCase
      , n.head.toUpper + n.tail.toLowerCase
      )) sortBy(identity) filterNot(name.grammarName ==)
  }

  val DecimalScaleConstraint = 9
  val MoneyScaleConstraint = 2
  val StringLengthConstraint = 9

  val types = Seq(
    Type(TypeName("Binary", "Binaries"))
  , Type(TypeName("Bits", "Bitses"))
  , Type("Boolean", "Bool")
  , Type("Color")
  , Type("Date")
  , Type("Decimal")
  , Type(TypeName(s"Decimal(${DecimalScaleConstraint})", s"DecimalWithScaleOf${DecimalScaleConstraint}", s"DecimalsWithScaleOf${DecimalScaleConstraint}"))
  , Type("Double")
  , Type("Email")
  , Type("Float")
  , Type("Guid", "Uuid")
  , Type("Image", "Picture")
  , Type("Integer", "Int")
  , Type("Ip")
  , Type("Json")
  , Type("Location")
  , Type("Long")
  , Type("Map", "Dictionary")
  , Type(TypeName("Money", "Monies"))
  , Type("Native")
  , Type("Phone")
  , Type("Point")
  , Type("Rectangle", "Box")
  , Type("S3")
  , Type("Secret")
  , Type("Stream")
  , Type("String")
  , Type(TypeName(s"String(${StringLengthConstraint})", s"StringWithMaxLengthOf${StringLengthConstraint}", s"StringsWithMaxLengthOf${StringLengthConstraint}"))
  , Type("Text")
  , Type("Time")
  , Type("Timestamp", "DateTime")
  , Type("Url", "Link")
  , Type("Xml")
  )

  def generate {
    val root = spawnDirectory("types", "scala")

    for (t <- types) {
      val name = t.name.grammarName

      (root / s"type.${name}.scala").write(
s"""package com.dslplatform.ocd
package types

trait `type.${name}`
    extends OcdType {

  type typeType = `type.${name}`

  val typeClass = classOf[`type.${name}`]

  val typeName = "${name}"
  val typeNameSafe = "${t.name.typeNameSafe}"
  val typeSingleName = "${t.name.singleName}"
  val typePluralName = "${t.name.pluralName}"
${if (t.derivedAliases.isEmpty) {""} else {s"""
  override val typeAliases = Set(
    ${t.derivedAliases.mkString("\"", "\"\n  , \"", "\"")}
  )
"""}}}

case object `type.${name}` extends `type.${name}`
""")
    }

    (root / s"package.scala").write(
s"""package com.dslplatform.ocd

package types {
  trait OcdTypeValues {
    val values: IndexedSeq[OcdType] = IndexedSeq(
      ${types.map(t => s"`type.${t.name.grammarName}`").mkString("\n    , ")}
    )
  }
}

package object types {
  ${types.filter(_.derivedAliases.nonEmpty).map{ t =>
    t.derivedAliases.map{ a =>
    s"""type `type.$a` = `type.${t.name.grammarName}`
  val  `type.$a` = `type.${t.name.grammarName}`"""
  }.mkString("\n  ")}.mkString("\n\n  ")
}
}
"""
    )
  }
}
