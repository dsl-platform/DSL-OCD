package com.dslplatform.ocd.aggregates

import ListOptDecimalInAggregate.ListOptDecimalAggregate
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestListOptDecimalAggregate extends SpecExtensions {
  def `Test property field type: IndexedSeq[Option[BigDecimal]]`() =
    checkType(
      typeOf[IndexedSeq[Option[BigDecimal]]]
    , typeOf[ListOptDecimalAggregate].member("listOptDecimal": TermName).asMethod.returnType
    )

  def `Test property default value: IndexedSeq.empty[Option[BigDecimal]]`() {
    assert(ListOptDecimalAggregate().listOptDecimal === IndexedSeq.empty[Option[BigDecimal]])
  }
}
