package com.dslplatform.ocd.aggregates

import OptDecimalWithSurrogateInAggregate.OptDecimalWithSurrogateAggregate
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestOptDecimalWithSurrogateAggregate extends SpecExtensions {
  def `Test property field type: Option[BigDecimal]`() =
    checkType(
      typeOf[Option[BigDecimal]]
    , typeOf[OptDecimalWithSurrogateAggregate].member("optDecimal": TermName).asMethod.returnType
    )

  def `Test property default value: None`() {
    assert(OptDecimalWithSurrogateAggregate().optDecimal === None)
  }
}
