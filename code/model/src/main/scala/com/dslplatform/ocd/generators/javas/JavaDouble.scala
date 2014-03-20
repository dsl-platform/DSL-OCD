package com.dslplatform.ocd.generators
package javas

import Types._
import Boxes._

object JavaDouble
    extends JavaStub {

  override val classPrimitive = Some("double")
  val classReference = "Double"

  val defaultSingle = "0.0"

  override val borderSingleValues = Seq(
          defaultSingle
        , "java.lang.Double.MIN_VALUE"
        , "java.lang.Double.MAX_VALUE"
        , "java.lang.Double.NEGATIVE_INFINITY"
        , "java.lang.Double.POSITIVE_INFINITY"
        , "java.lang.Double.NAN"
      )
}
