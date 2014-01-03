package com.dslplatform.ocd.aggregates

import OptListDecimalWithSurrogateInAggregate.OptListDecimalWithSurrogateAggregate
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestOptListDecimalWithSurrogateAggregate extends SpecExtensions {
  def `Test property field type: Option[IndexedSeq[BigDecimal]]`() =
    checkType(
      typeOf[Option[IndexedSeq[BigDecimal]]]
    , typeOf[OptListDecimalWithSurrogateAggregate].member("optListDecimal": TermName).asMethod.returnType
    )

  def `Test property default value: None`() {
    assert(OptListDecimalWithSurrogateAggregate().optListDecimal === None)
  }
}
