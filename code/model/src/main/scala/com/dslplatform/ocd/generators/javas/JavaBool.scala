package com.dslplatform.ocd.generators
package javas

import Types._
import Boxes._

object JavaBool
    extends JavaStub {

  override val classPrimitive = Some("boolean")
  val classReference = "Boolean"

  val defaultSingle: TestValue = "false"

  val nonDefaultValues: Seq[TestValue] = Seq(
    "true"
  )
}
