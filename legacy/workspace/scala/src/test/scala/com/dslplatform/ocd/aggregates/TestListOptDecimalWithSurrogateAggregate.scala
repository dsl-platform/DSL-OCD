package com.dslplatform.ocd.aggregates

import ListOptDecimalWithSurrogateInAggregate.ListOptDecimalWithSurrogateAggregate
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestListOptDecimalWithSurrogateAggregate extends SpecExtensions {
  def `Test property field type: IndexedSeq[Option[BigDecimal]]`() =
    checkType(
      typeOf[IndexedSeq[Option[BigDecimal]]]
    , typeOf[ListOptDecimalWithSurrogateAggregate].member("listOptDecimal": TermName).asMethod.returnType
    )

  def `Test property default value: IndexedSeq.empty[Option[BigDecimal]]`() {
    assert(ListOptDecimalWithSurrogateAggregate().listOptDecimal === IndexedSeq.empty[Option[BigDecimal]])
  }
}
