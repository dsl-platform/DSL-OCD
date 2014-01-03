package com.dslplatform.ocd.aggregates

import OptListOptDecimalWithSurrogateInAggregate.OptListOptDecimalWithSurrogateAggregate
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestOptListOptDecimalWithSurrogateAggregate extends SpecExtensions {
  def `Test property field type: Option[IndexedSeq[Option[BigDecimal]]]`() =
    checkType(
      typeOf[Option[IndexedSeq[Option[BigDecimal]]]]
    , typeOf[OptListOptDecimalWithSurrogateAggregate].member("optListOptDecimal": TermName).asMethod.returnType
    )

  def `Test property default value: None`() {
    assert(OptListOptDecimalWithSurrogateAggregate().optListOptDecimal === None)
  }
}
