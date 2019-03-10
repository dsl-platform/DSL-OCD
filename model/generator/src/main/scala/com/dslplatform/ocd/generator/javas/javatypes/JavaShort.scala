package com.dslplatform.ocd
package generator
package javas
package javatypes

import types._
import boxes._

object JavaShort
  extends JavaStub {

  override val classPrimitive = Some("short")
  val classReference = "Short"

  val defaultSingle: TestValue = "0"

  val nonDefaultValues: Seq[TestValue] = Seq(
    "1"
  , "10000"
  , "-10000"
  , "Short.MIN_VALUE"
  , "Short.MAX_VALUE"
  )
}
