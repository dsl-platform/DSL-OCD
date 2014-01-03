package com.dslplatform.ocd.aggregates

import OptListOptMoneyWithSurrogateInAggregate.OptListOptMoneyWithSurrogateAggregate
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestOptListOptMoneyWithSurrogateAggregate extends SpecExtensions {
  def `Test property field type: Option[IndexedSeq[Option[BigDecimal]]]`() =
    checkType(
      typeOf[Option[IndexedSeq[Option[BigDecimal]]]]
    , typeOf[OptListOptMoneyWithSurrogateAggregate].member("optListOptMoney": TermName).asMethod.returnType
    )

  def `Test property default value: None`() {
    assert(OptListOptMoneyWithSurrogateAggregate().optListOptMoney === None)
  }
}
