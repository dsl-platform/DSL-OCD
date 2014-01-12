package com.dslplatform.ocd.generators
package scalas

import Types._
import Boxes._

object ScalaDecimalWithScale
    extends ScalaStub {

  val clazz = "BigDecimal"

  val defaultSingle = "BigDecimal(0).setScale(9)"
}
