package com.dslplatform.ocd.aggregates

import OneDecimalWithSurrogateInAggregate.OneDecimalWithSurrogateAggregate
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestOneDecimalWithSurrogateAggregate extends SpecExtensions {
  def `Test property field type: BigDecimal`() =
    checkType(
      typeOf[BigDecimal]
    , typeOf[OneDecimalWithSurrogateAggregate].member("oneDecimal": TermName).asMethod.returnType
    )

  def `Test property default value: BigDecimal(0)`() {
    assert(OneDecimalWithSurrogateAggregate().oneDecimal === BigDecimal(0))
  }
}
