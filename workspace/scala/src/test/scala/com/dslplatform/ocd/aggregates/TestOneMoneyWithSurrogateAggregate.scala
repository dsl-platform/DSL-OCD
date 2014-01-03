package com.dslplatform.ocd.aggregates

import OneMoneyWithSurrogateInAggregate.OneMoneyWithSurrogateAggregate
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestOneMoneyWithSurrogateAggregate extends SpecExtensions {
  def `Test property field type: BigDecimal`() =
    checkType(
      typeOf[BigDecimal]
    , typeOf[OneMoneyWithSurrogateAggregate].member("oneMoney": TermName).asMethod.returnType
    )

  def `Test property default value: BigDecimal(0)`() {
    assert(OneMoneyWithSurrogateAggregate().oneMoney === BigDecimal(0))
  }
}
