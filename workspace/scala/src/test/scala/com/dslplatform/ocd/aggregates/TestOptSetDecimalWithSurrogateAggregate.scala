package com.dslplatform.ocd.aggregates

import OptSetDecimalWithSurrogateInAggregate.OptSetDecimalWithSurrogateAggregate
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestOptSetDecimalWithSurrogateAggregate extends SpecExtensions {
  def `Test property field type: Option[Set[BigDecimal]]`() =
    checkType(
      typeOf[Option[Set[BigDecimal]]]
    , typeOf[OptSetDecimalWithSurrogateAggregate].member("optSetDecimal": TermName).asMethod.returnType
    )

  def `Test property default value: None`() {
    assert(OptSetDecimalWithSurrogateAggregate().optSetDecimal === None)
  }
}
