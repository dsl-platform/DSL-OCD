package com.dslplatform.ocd.generators
package javas

import Types._
import Boxes._

object JavaMoney
    extends JavaStub {

  val classReference = "java.math.BigDecimal"

  val defaultSingle = "java.math.BigDecimal.ZERO.setScale(2)"

  //TODO:
  override val borderSingleValues = Seq(
      defaultSingle
      , "java.math.BigDecimal.ONE.setScale(2)"
      , "java.math.BigDecimal.TEN.setScale(2)"
      )
}
