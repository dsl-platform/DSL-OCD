package com.dslplatform.ocd
package generator
package javas
package javatypes

import types._
import boxes._

object JavaLong
  extends JavaStub {

  override val classPrimitive = Some("long")
  val classReference = "Long"

  val defaultSingle: TestValue = "0L"

  val nonDefaultValues: Seq[TestValue] = Seq(
    "1L"
  , "1000000000000000000L"
  , "-1000000000000000000L"
  , "Long.MIN_VALUE"
  , "Long.MAX_VALUE"
  )
}
