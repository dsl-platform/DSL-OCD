package com.dslplatform.ocd.aggregates

import ArrayDecimalWithSurrogateInAggregate.ArrayDecimalWithSurrogateAggregate
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestArrayDecimalWithSurrogateAggregate extends SpecExtensions {
  def `Test property field type: Array[BigDecimal]`() =
    checkType(
      typeOf[Array[BigDecimal]]
    , typeOf[ArrayDecimalWithSurrogateAggregate].member("arrayDecimal": TermName).asMethod.returnType
    )

  def `Test property default value: Array.empty[BigDecimal]`() {
    assert(ArrayDecimalWithSurrogateAggregate().arrayDecimal === Array.empty[BigDecimal])
  }
}
