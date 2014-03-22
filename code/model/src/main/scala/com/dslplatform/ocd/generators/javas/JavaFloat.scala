package com.dslplatform.ocd.generators
package javas

import Types._
import Boxes._

object JavaFloat
    extends JavaStub {

  override val classPrimitive = Some("float")
  val classReference = "Float"

  val defaultSingle = "0.0f"

  val nonDefaultValues = Seq(
    "Float.MIN_VALUE"
  , "Float.MIN_NORMAL"
  , "Float.MAX_VALUE"
  , "Float.NEGATIVE_INFINITY"
  , "Float.POSITIVE_INFINITY"
  , "Float.NaN"
  , "-1.0000001f"
  , "1.0000001f"
  )
}
