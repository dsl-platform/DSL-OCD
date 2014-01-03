package com.dslplatform.ocd.aggregates

import OptMoneyWithSurrogateInAggregate.OptMoneyWithSurrogateAggregate
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestOptMoneyWithSurrogateAggregate extends SpecExtensions {
  def `Test property field type: Option[BigDecimal]`() =
    checkType(
      typeOf[Option[BigDecimal]]
    , typeOf[OptMoneyWithSurrogateAggregate].member("optMoney": TermName).asMethod.returnType
    )

  def `Test property default value: None`() {
    assert(OptMoneyWithSurrogateAggregate().optMoney === None)
  }
}
