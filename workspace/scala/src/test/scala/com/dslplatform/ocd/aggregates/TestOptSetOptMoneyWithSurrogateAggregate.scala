package com.dslplatform.ocd.aggregates

import OptSetOptMoneyWithSurrogateInAggregate.OptSetOptMoneyWithSurrogateAggregate
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestOptSetOptMoneyWithSurrogateAggregate extends SpecExtensions {
  def `Test property field type: Option[Set[Option[BigDecimal]]]`() =
    checkType(
      typeOf[Option[Set[Option[BigDecimal]]]]
    , typeOf[OptSetOptMoneyWithSurrogateAggregate].member("optSetOptMoney": TermName).asMethod.returnType
    )

  def `Test property default value: None`() {
    assert(OptSetOptMoneyWithSurrogateAggregate().optSetOptMoney === None)
  }
}
