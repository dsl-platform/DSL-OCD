package com.dslplatform.ocd.aggregates

import ListDecimalWithSurrogateInAggregate.ListDecimalWithSurrogateAggregate
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestListDecimalWithSurrogateAggregate extends SpecExtensions {
  def `Test property field type: IndexedSeq[BigDecimal]`() =
    checkType(
      typeOf[IndexedSeq[BigDecimal]]
    , typeOf[ListDecimalWithSurrogateAggregate].member("listDecimal": TermName).asMethod.returnType
    )

  def `Test property default value: IndexedSeq.empty[BigDecimal]`() {
    assert(ListDecimalWithSurrogateAggregate().listDecimal === IndexedSeq.empty[BigDecimal])
  }
}
