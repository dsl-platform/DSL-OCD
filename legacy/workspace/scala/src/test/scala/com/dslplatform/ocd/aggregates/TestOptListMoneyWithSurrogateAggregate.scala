package com.dslplatform.ocd.aggregates

import OptListMoneyWithSurrogateInAggregate.OptListMoneyWithSurrogateAggregate
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestOptListMoneyWithSurrogateAggregate extends SpecExtensions {
  def `Test property field type: Option[IndexedSeq[BigDecimal]]`() =
    checkType(
      typeOf[Option[IndexedSeq[BigDecimal]]]
    , typeOf[OptListMoneyWithSurrogateAggregate].member("optListMoney": TermName).asMethod.returnType
    )

  def `Test property default value: None`() {
    assert(OptListMoneyWithSurrogateAggregate().optListMoney === None)
  }
}
