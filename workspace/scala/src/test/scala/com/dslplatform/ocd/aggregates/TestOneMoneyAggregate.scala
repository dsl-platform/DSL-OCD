package com.dslplatform.ocd.aggregates

import OneMoneyInAggregate.OneMoneyAggregate
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestOneMoneyAggregate extends SpecExtensions {
  def `Test property field type: BigDecimal`() =
    checkType(
      typeOf[BigDecimal]
    , typeOf[OneMoneyAggregate].member("oneMoney": TermName).asMethod.returnType
    )

  def `Test property default value: BigDecimal(0)`() {
    assert(OneMoneyAggregate().oneMoney === BigDecimal(0))
  }
}
