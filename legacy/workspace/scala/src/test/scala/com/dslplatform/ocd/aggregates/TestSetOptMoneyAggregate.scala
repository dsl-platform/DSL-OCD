package com.dslplatform.ocd.aggregates

import SetOptMoneyInAggregate.SetOptMoneyAggregate
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestSetOptMoneyAggregate extends SpecExtensions {
  def `Test property field type: Set[Option[BigDecimal]]`() =
    checkType(
      typeOf[Set[Option[BigDecimal]]]
    , typeOf[SetOptMoneyAggregate].member("setOptMoney": TermName).asMethod.returnType
    )

  def `Test property default value: Set.empty[Option[BigDecimal]]`() {
    assert(SetOptMoneyAggregate().setOptMoney === Set.empty[Option[BigDecimal]])
  }
}
