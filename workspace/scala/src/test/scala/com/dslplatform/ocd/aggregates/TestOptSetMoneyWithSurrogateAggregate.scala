package com.dslplatform.ocd.aggregates

import OptSetMoneyWithSurrogateInAggregate.OptSetMoneyWithSurrogateAggregate
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestOptSetMoneyWithSurrogateAggregate extends SpecExtensions {
  def `Test property field type: Option[Set[BigDecimal]]`() =
    checkType(
      typeOf[Option[Set[BigDecimal]]]
    , typeOf[OptSetMoneyWithSurrogateAggregate].member("optSetMoney": TermName).asMethod.returnType
    )

  def `Test property default value: None`() {
    assert(OptSetMoneyWithSurrogateAggregate().optSetMoney === None)
  }
}
