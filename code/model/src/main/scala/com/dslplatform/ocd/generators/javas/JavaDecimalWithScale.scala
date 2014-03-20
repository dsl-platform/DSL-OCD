package com.dslplatform.ocd.generators
package javas

import Types._
import Boxes._

object JavaDecimalWithScale
    extends JavaStub {

  val classReference = "java.math.BigDecimal"

  val defaultSingle = "java.math.BigDecimal.ZERO.setScale(9)"

  override val borderSingleValues = Seq(
      "dinamo"
    , "hajduk"
    )
//TODO:
//          defaultSingle
//        , "java.math.BigDecimal.ONE.setScale(9)"
//        , "java.math.BigDecimal.TEN.setScale(9)"
//    )
}
