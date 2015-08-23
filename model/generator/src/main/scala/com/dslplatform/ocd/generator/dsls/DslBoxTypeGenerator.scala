package com.dslplatform.ocd
package generator
package dsls

import scalax.file._
import types._
import boxes._
import scala.collection.mutable.LinkedHashMap

object DslBoxTypeGenerator
    extends Generator
    with DslBoxTypeValues {

  def generate(): Unit = {
    val root = spawnDirectory("dsls", "scala")

    val mapping = new LinkedHashMap[String, (Boolean, String, String)]

    for ((t, ds) <- dslSegments) {
      val grammars = ds.zipWithIndex map {
        case (cur, 0) => (false, s"Dsl${t.name.singleName}Grammar", cur)
        case (cur, i) => (true, s"Dsl${t.name.singleName}GrammarAliases${i}", cur)
      }

      for { (alias, grammar, values) <- grammars; (value, (_, spacing)) <- values } {
        mapping(value) = (alias, spacing, grammar)
      }

      (root / s"dsl.${t.name.typeNameSafe}.scala").write(s"""package com.dslplatform.ocd
package dsls

import types._
import boxes._

sealed abstract class Dsl${t.name.singleName}
    extends OcdDslBoxType
    with `type.${t.name.dslName}`

${(grammars.head._3 map { case (v, (co, cv)) =>
  co
}).mkString("\n")}

${(grammars.tail map { case (_, grammar, objects) =>
s"""object ${grammar} {
  ${objects.map { case (v, (co, cv)) =>
    co
  }.mkString("\n  ")}
}"""
}).mkString("\n\n")}
""")
    }

    (root / s"package.scala").write(
s"""package com.dslplatform.ocd

package object dsls {
${(mapping.filter(_._2._1) map { case (value, (_, spacing, grammar)) =>
  s"  val ${value}${spacing} = ${grammar}.${value}"
}).mkString("\n")}
}

package dsls {
  trait OcdDslBoxTypeValues {
    val values: IndexedSeq[OcdDslBoxType] = IndexedSeq(
      ${mapping.keys.mkString("\n    , ")}
    )
  }
}
""")
  }
}
