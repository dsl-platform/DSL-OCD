package com.dslplatform.ocd.aggregates

import SetOptDecimalWithSurrogateInAggregate.SetOptDecimalWithSurrogateAggregate
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestSetOptDecimalWithSurrogateAggregate extends SpecExtensions {
  def `Test property field type: Set[Option[BigDecimal]]`() =
    checkType(
      typeOf[Set[Option[BigDecimal]]]
    , typeOf[SetOptDecimalWithSurrogateAggregate].member("setOptDecimal": TermName).asMethod.returnType
    )

  def `Test property default value: Set.empty[Option[BigDecimal]]`() {
    assert(SetOptDecimalWithSurrogateAggregate().setOptDecimal === Set.empty[Option[BigDecimal]])
  }
}
