package com.dslplatform.ocd.aggregates

import OptSetOptDecimalWithSurrogateInAggregate.OptSetOptDecimalWithSurrogateAggregate
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestOptSetOptDecimalWithSurrogateAggregate extends SpecExtensions {
  def `Test property field type: Option[Set[Option[BigDecimal]]]`() =
    checkType(
      typeOf[Option[Set[Option[BigDecimal]]]]
    , typeOf[OptSetOptDecimalWithSurrogateAggregate].member("optSetOptDecimal": TermName).asMethod.returnType
    )

  def `Test property default value: None`() {
    assert(OptSetOptDecimalWithSurrogateAggregate().optSetOptDecimal === None)
  }
}
