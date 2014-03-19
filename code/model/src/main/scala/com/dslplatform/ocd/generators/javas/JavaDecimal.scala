package com.dslplatform.ocd.generators
package javas

import Types._
import Boxes._

object JavaDecimal
    extends JavaStub {

  val classReference = "java.math.BigDecimal"

  val defaultSingle = "java.math.BigDecimal.ZERO"

  override val borderSingleValues = Seq(
          defaultSingle
        , "java.math.BigDecimal.ONE"
        , "java.math.BigDecimal.TEN"
      )
}
