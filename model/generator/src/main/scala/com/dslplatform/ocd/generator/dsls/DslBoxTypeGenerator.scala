package com.dslplatform.ocd
package generator
package dsls

import scalax.file._
import types._
import boxes._

object DslBoxTypeGenerator
    extends Generator
    with DslBoxTypeValues {

  def generate(): Unit = {
    val root = spawnDirectory("dsls", "scala")

    for ((t, ds) <- dslSegments) {
      (root / s"dsl.${t.name.typeNameSafe}.scala").write(s"""package com.dslplatform.ocd
package dsls

import types._
import boxes._

sealed trait Dsl${t.name.singleName}
    extends OcdDslBoxType
    with `type.${t.name.dslName}`

${ds.mkString("\n\n")}
""")
    }

    (root / s"package.scala").write(
s"""package com.dslplatform.ocd
package dsls

trait OcdDslBoxTypeValues {
  val values: IndexedSeq[OcdDslBoxType] = IndexedSeq(
    ${dslValues.mkString("\n  , ")}
  )
}
""")
  }
}
