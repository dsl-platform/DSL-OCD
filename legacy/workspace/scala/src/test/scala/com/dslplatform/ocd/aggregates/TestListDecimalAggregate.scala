package com.dslplatform.ocd.aggregates

import ListDecimalInAggregate.ListDecimalAggregate
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestListDecimalAggregate extends SpecExtensions {
  def `Test property field type: IndexedSeq[BigDecimal]`() =
    checkType(
      typeOf[IndexedSeq[BigDecimal]]
    , typeOf[ListDecimalAggregate].member("listDecimal": TermName).asMethod.returnType
    )

  def `Test property default value: IndexedSeq.empty[BigDecimal]`() {
    assert(ListDecimalAggregate().listDecimal === IndexedSeq.empty[BigDecimal])
  }
}
