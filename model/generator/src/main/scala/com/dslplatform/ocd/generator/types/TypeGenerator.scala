package com.dslplatform.ocd
package generator.types

import scalax.file._
import com.dslplatform.ocd.generator.Generator

object TypeGenerator
    extends Generator
    with TypeValues {

  def generate(): Unit = {
    val root = spawnDirectory("types", "scala")

    for (t <- typeValues) {
      val name = t.name.dslName

      (root / s"type.${t.name.typeNameSafe}.scala").write(
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
      ${typeValues.map(t => s"`type.${t.name.dslName}`").mkString("\n    , ")}
    )
  }
}

package object types {
  ${typeValues.filter(_.derivedAliases.nonEmpty).map{ t =>
    t.derivedAliases.map{ a =>
    s"""type `type.$a` = `type.${t.name.dslName}`
  val  `type.$a` = `type.${t.name.dslName}`"""
  }.mkString("\n  ")}.mkString("\n\n  ")
}
}
"""
    )
  }
}
