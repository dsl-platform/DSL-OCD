package com.dslplatform.ocd.generators
package javas

import Types._
import Boxes._

object JavaDecimalWithScale
    extends JavaStub {

  val classReference = "java.math.BigDecimal"

  val defaultSingle = "java.math.BigDecimal.ZERO.setScale(9)"

  val nonDefaultValues = Seq(
    "java.math.BigDecimal.ONE"
  , E"new java.math.BigDecimal($Pi).setScale(9, java.math.BigDecimal.ROUND_HALF_UP)"
  , E"new java.math.BigDecimal(${"-1E-9"})"
  , E"new java.math.BigDecimal(${"1E100"})"
  )
}
