package com.dslplatform.ocd
package generator
package javas
package javatypes

import types._
import boxes._

object JavaInteger
    extends JavaStub {

  override val classPrimitive = Some("int")
  val classReference = "Integer"

  val defaultSingle: TestValue = "0"

  val nonDefaultValues: Seq[TestValue] = Seq(
    "Integer.MIN_VALUE"
  , "Integer.MAX_VALUE"
  , "-1000000000"
  , "1000000000"
  )
}
