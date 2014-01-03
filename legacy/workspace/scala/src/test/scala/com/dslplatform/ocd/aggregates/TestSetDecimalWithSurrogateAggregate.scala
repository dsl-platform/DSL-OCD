package com.dslplatform.ocd.aggregates

import SetDecimalWithSurrogateInAggregate.SetDecimalWithSurrogateAggregate
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestSetDecimalWithSurrogateAggregate extends SpecExtensions {
  def `Test property field type: Set[BigDecimal]`() =
    checkType(
      typeOf[Set[BigDecimal]]
    , typeOf[SetDecimalWithSurrogateAggregate].member("setDecimal": TermName).asMethod.returnType
    )

  def `Test property default value: Set.empty[BigDecimal]`() {
    assert(SetDecimalWithSurrogateAggregate().setDecimal === Set.empty[BigDecimal])
  }
}
