package com.dslplatform.ocd.aggregates

import SetMoneyWithSurrogateInAggregate.SetMoneyWithSurrogateAggregate
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestSetMoneyWithSurrogateAggregate extends SpecExtensions {
  def `Test property field type: Set[BigDecimal]`() =
    checkType(
      typeOf[Set[BigDecimal]]
    , typeOf[SetMoneyWithSurrogateAggregate].member("setMoney": TermName).asMethod.returnType
    )

  def `Test property default value: Set.empty[BigDecimal]`() {
    assert(SetMoneyWithSurrogateAggregate().setMoney === Set.empty[BigDecimal])
  }
}
