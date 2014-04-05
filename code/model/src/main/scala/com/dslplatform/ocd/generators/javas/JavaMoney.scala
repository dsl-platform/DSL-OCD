package com.dslplatform.ocd.generators
package javas

import Types._
import Boxes._

object JavaMoney
    extends JavaStub {

  val classReference = "java.math.BigDecimal"

  val defaultSingle: TestValue = "java.math.BigDecimal.ZERO.setScale(2)"

  val nonDefaultValues: Seq[TestValue] = Seq(
    "java.math.BigDecimal.ONE"
  , E"new java.math.BigDecimal($Pi).setScale(2, java.math.BigDecimal.ROUND_HALF_UP)"
  , E"new java.math.BigDecimal(${"-1E-2"})"
  , E"new java.math.BigDecimal(${"1E19"})"
//  , E"new java.math.BigDecimal(${"1E100"})" // Money implicitly expands to numeric(22,2)
  )
}
