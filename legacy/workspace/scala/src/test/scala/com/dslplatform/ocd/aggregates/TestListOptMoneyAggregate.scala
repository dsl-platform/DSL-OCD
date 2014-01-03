package com.dslplatform.ocd.aggregates

import ListOptMoneyInAggregate.ListOptMoneyAggregate
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestListOptMoneyAggregate extends SpecExtensions {
  def `Test property field type: IndexedSeq[Option[BigDecimal]]`() =
    checkType(
      typeOf[IndexedSeq[Option[BigDecimal]]]
    , typeOf[ListOptMoneyAggregate].member("listOptMoney": TermName).asMethod.returnType
    )

  def `Test property default value: IndexedSeq.empty[Option[BigDecimal]]`() {
    assert(ListOptMoneyAggregate().listOptMoney === IndexedSeq.empty[Option[BigDecimal]])
  }
}
