package com.dslplatform.ocd.generators
package javas

import Types._
import Boxes._

object JavaDouble
    extends JavaStub {

  override val classPrimitive = Some("double")
  val classReference = "Double"

  val defaultSingle: TestValue = "0.0"

  val nonDefaultValues: Seq[TestValue] = Seq(
    "Double.MIN_VALUE"
  , "Double.MIN_NORMAL"
  , "Double.MAX_VALUE"
  , "Double.NEGATIVE_INFINITY"
  , "Double.POSITIVE_INFINITY"
  , "Double.NaN"
  , "-1.000000000000001"
  , "1.000000000000001"
  )
}
