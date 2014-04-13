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

/*
 * 1E32f
 * Unexpected return code: 500, response: Input string was not in a correct format.
 */

  val nonDefaultValues: Seq[TestValue] = Seq(
    "-1.2345E-10f"
  , "1.2345E20f"
  , "-1E-5f"
//  , "-1E-32f"                   // Problem with server deserialization
//  , "1E32f"                     // Problem with server deserialization
//  , "Float.MIN_NORMAL"          // Smaller than database double limit
//    "Float.MIN_VALUE"           // Smaller than database double limit
//  , "Float.MAX_VALUE"           // Larger than database double limit
  , "Float.NaN"                 // JSON serialization doesn't function when reading from the database (0.0)
  , "Float.NEGATIVE_INFINITY"
  , "Float.POSITIVE_INFINITY"
  )
}
