package com.dslplatform.ocd.aggregates

import SetOptMoneyWithSurrogateInAggregate.SetOptMoneyWithSurrogateAggregate
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestSetOptMoneyWithSurrogateAggregate extends SpecExtensions {
  def `Test property field type: Set[Option[BigDecimal]]`() =
    checkType(
      typeOf[Set[Option[BigDecimal]]]
    , typeOf[SetOptMoneyWithSurrogateAggregate].member("setOptMoney": TermName).asMethod.returnType
    )

  def `Test property default value: Set.empty[Option[BigDecimal]]`() {
    assert(SetOptMoneyWithSurrogateAggregate().setOptMoney === Set.empty[Option[BigDecimal]])
  }
}
