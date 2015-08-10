package com.dslplatform.ocd
package generator
package javas
package javatypes

import types._
import boxes._

object JavaFloat
    extends JavaStub {

  override val classPrimitive = Some("float")
  val classReference = "Float"

  val defaultSingle: TestValue = "0.0f"

  val nonDefaultValues: Seq[TestValue] = Seq(
    "-1.2345E-10f"
  , "1.2345E20f"
  , "-1E-5f"
  , "-1E-32f"
  , "1E32f"
//  , "Float.MIN_NORMAL"          // Smaller than database float limit
//    "Float.MIN_VALUE"           // Smaller than database float limit
//  , "Float.MAX_VALUE"           // Larger than database float limit
  , "Float.NaN"
  , "Float.NEGATIVE_INFINITY"
  , "Float.POSITIVE_INFINITY"
  )
}
