package com.dslplatform.ocd.aggregates

import ListMoneyWithSurrogateInAggregate.ListMoneyWithSurrogateAggregate
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestListMoneyWithSurrogateAggregate extends SpecExtensions {
  def `Test property field type: IndexedSeq[BigDecimal]`() =
    checkType(
      typeOf[IndexedSeq[BigDecimal]]
    , typeOf[ListMoneyWithSurrogateAggregate].member("listMoney": TermName).asMethod.returnType
    )

  def `Test property default value: IndexedSeq.empty[BigDecimal]`() {
    assert(ListMoneyWithSurrogateAggregate().listMoney === IndexedSeq.empty[BigDecimal])
  }
}
