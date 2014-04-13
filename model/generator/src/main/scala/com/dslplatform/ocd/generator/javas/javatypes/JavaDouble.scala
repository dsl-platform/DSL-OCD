package com.dslplatform.ocd
package generator
package javas
package javatypes

import types._
import boxes._

object JavaDouble
    extends JavaStub {

  override val classPrimitive = Some("double")
  val classReference = "Double"

  val defaultSingle: TestValue = "0.0"

  val nonDefaultValues: Seq[TestValue] = Seq(
    "1E-307"
  , "9E307"
  , "-1.23456789012345E-10" // Meant to be lossy
  , "1.23456789012345E20"   // Meant to be lossy
  , "Double.NEGATIVE_INFINITY"
  , "Double.POSITIVE_INFINITY"
//  , "Double.MIN_NORMAL"          // Smaller than database double limit
//    "Double.MIN_VALUE"           // Smaller than database double limit
//  , "Double.MAX_VALUE"           // Larger than database double limit
  , "Double.NaN"                 // JSON serialization doesn't function when reading from the database (0.0)
  )
}
