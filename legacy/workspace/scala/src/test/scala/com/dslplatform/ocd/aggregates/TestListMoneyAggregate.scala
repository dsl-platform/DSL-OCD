package com.dslplatform.ocd.aggregates

import ListMoneyInAggregate.ListMoneyAggregate
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestListMoneyAggregate extends SpecExtensions {
  def `Test property field type: IndexedSeq[BigDecimal]`() =
    checkType(
      typeOf[IndexedSeq[BigDecimal]]
    , typeOf[ListMoneyAggregate].member("listMoney": TermName).asMethod.returnType
    )

  def `Test property default value: IndexedSeq.empty[BigDecimal]`() {
    assert(ListMoneyAggregate().listMoney === IndexedSeq.empty[BigDecimal])
  }
}
