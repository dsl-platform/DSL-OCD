package com.dslplatform.ocd
package generator
package javas
package javatypes

import types._
import boxes._

object JavaBool
    extends JavaStub {

  override val classPrimitive = Some("boolean")
  val classReference = "Boolean"

  val defaultSingle: TestValue = "false"

  val nonDefaultValues: Seq[TestValue] = Seq(
    "true"
  )
}
