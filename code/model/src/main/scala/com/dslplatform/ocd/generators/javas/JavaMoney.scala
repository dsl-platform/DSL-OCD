package com.dslplatform.ocd.generators
package javas

import Types._
import Boxes._

object JavaMoney
    extends JavaStub {

  val classReference = "java.math.BigDecimal"

  val defaultSingle = "java.math.BigDecimal.ZERO.setScale(2)"

  val nonDefaultValues = Seq(
    "new java.math.BigDecimal.ONE"
  , E"new java.math.BigDecimal($Pi).setScale(2)"
  , E"new java.math.BigDecimal(${"-1E-2"})"
  , E"new java.math.BigDecimal(${"1E100"})"
  )
}
