package com.dslplatform.ocd.generators
package javas

import Types._
import Boxes._

object JavaFloat
    extends JavaStub {

  override val classPrimitive = Some("float")
  val classReference = "Float"

  val defaultSingle = "0.0f"

  override val borderSingleValues = Seq(
          defaultSingle
        , "java.lang.Float.MIN_VALUE"
        , "java.lang.Float.MAX_VALUE"
        , "java.lang.Float.MIN_NORMAL"
        , "java.lang.Float.NAN"
        , "java.lang.Float.NEGATIVE_INFINITY"
        , "java.lang.Float.POSITIVE_INFINITY"
      )
}
