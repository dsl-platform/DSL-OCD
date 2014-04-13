package com.dslplatform.ocd
package generator
package javas
package javatypes

import types._
import boxes._

object JavaDecimal
    extends JavaStub {

  val classReference = "java.math.BigDecimal"

  val defaultSingle: TestValue = "java.math.BigDecimal.ZERO"

  val nonDefaultValues: Seq[TestValue] = Seq(
    "java.math.BigDecimal.ONE"
  , E"new java.math.BigDecimal($Pi).setScale(28, java.math.BigDecimal.ROUND_HALF_UP)"
  , E"new java.math.BigDecimal(${"-1E-28"})"
  , E"new java.math.BigDecimal(${"1E28"})"
//  , E"new java.math.BigDecimal($Pi)"           // hidden limit, constraint on numeric should be up to precision, scale 1000?
//  , E"new java.math.BigDecimal(${"-1E-100"})"  // hidden limit, constraint on numeric should be up to precision, scale 1000?
//  , E"new java.math.BigDecimal(${"1E100"})"    // hidden limit, constraint on numeric should be up to precision, scale 1000?
  )
}
