package com.dslplatform.ocd.generators
package javas

import Types._
import Boxes._

object JavaDecimal
    extends JavaStub {

  val classReference = "java.math.BigDecimal"

  val defaultSingle = "java.math.BigDecimal.ZERO"

  val nonDefaultValues = Seq(
    "java.math.BigDecimal.ONE"
  , E"new java.math.BigDecimal($Pi)"
  , E"new java.math.BigDecimal(${"-1E-100"})"
  , E"new java.math.BigDecimal(${"1E100"})"
  )
}
