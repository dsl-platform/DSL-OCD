package com.dslplatform.ocd.generators
package javas

import Types._
import Boxes._

object JavaLong
  extends JavaStub {

  override val classPrimitive = Some("long")
  val classReference = "Long"

  val defaultSingle = "0L"

  val nonDefaultValues = Seq(
    "Long.MIN_VALUE"
  , "Long.MAX_VALUE"
  , "1000000000000000000L"
  )
}
