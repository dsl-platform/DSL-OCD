package com.dslplatform.ocd.aggregates

import ListOptMoneyWithSurrogateInAggregate.ListOptMoneyWithSurrogateAggregate
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestListOptMoneyWithSurrogateAggregate extends SpecExtensions {
  def `Test property field type: IndexedSeq[Option[BigDecimal]]`() =
    checkType(
      typeOf[IndexedSeq[Option[BigDecimal]]]
    , typeOf[ListOptMoneyWithSurrogateAggregate].member("listOptMoney": TermName).asMethod.returnType
    )

  def `Test property default value: IndexedSeq.empty[Option[BigDecimal]]`() {
    assert(ListOptMoneyWithSurrogateAggregate().listOptMoney === IndexedSeq.empty[Option[BigDecimal]])
  }
}
