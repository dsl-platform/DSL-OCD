package com.dslplatform.ocd.aggregates

import SetMoneyInAggregate.SetMoneyAggregate
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestSetMoneyAggregate extends SpecExtensions {
  def `Test property field type: Set[BigDecimal]`() =
    checkType(
      typeOf[Set[BigDecimal]]
    , typeOf[SetMoneyAggregate].member("setMoney": TermName).asMethod.returnType
    )

  def `Test property default value: Set.empty[BigDecimal]`() {
    assert(SetMoneyAggregate().setMoney === Set.empty[BigDecimal])
  }
}
