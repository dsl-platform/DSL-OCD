package com.dslplatform.ocd
package generator
package javas
package javatypes

import types._
import boxes._

object JavaDecimalWithScale
    extends JavaStub {

  val classReference = "java.math.BigDecimal"

  val defaultSingle: TestValue = "java.math.BigDecimal.ZERO.setScale(9)"

  val nonDefaultValues: Seq[TestValue] = Seq(
    "java.math.BigDecimal.ONE"
  , E"new java.math.BigDecimal($Pi).setScale(9, java.math.BigDecimal.ROUND_HALF_UP)"
  , E"new java.math.BigDecimal(${"-1E-9"})"
  , E"new java.math.BigDecimal(${"1E19"})"
//  , E"new java.math.BigDecimal(${"1E100"})" // Decimal(9) implicitly expands to numeric(29,9)
  )
}
