package com.dslplatform.ocd.aggregates

import ArrayOptDecimalWithSurrogateInAggregate.ArrayOptDecimalWithSurrogateAggregate
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestArrayOptDecimalWithSurrogateAggregate extends SpecExtensions {
  def `Test property field type: Array[Option[BigDecimal]]`() =
    checkType(
      typeOf[Array[Option[BigDecimal]]]
    , typeOf[ArrayOptDecimalWithSurrogateAggregate].member("arrayOptDecimal": TermName).asMethod.returnType
    )

  def `Test property default value: Array.empty[Option[BigDecimal]]`() {
    assert(ArrayOptDecimalWithSurrogateAggregate().arrayOptDecimal === Array.empty[Option[BigDecimal]])
  }
}
