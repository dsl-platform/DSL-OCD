package com.dslplatform.ocd.aggregates

import OptArrayOptDecimalWithSurrogateInAggregate.OptArrayOptDecimalWithSurrogateAggregate
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestOptArrayOptDecimalWithSurrogateAggregate extends SpecExtensions {
  def `Test property field type: Option[Array[Option[BigDecimal]]]`() =
    checkType(
      typeOf[Option[Array[Option[BigDecimal]]]]
    , typeOf[OptArrayOptDecimalWithSurrogateAggregate].member("optArrayOptDecimal": TermName).asMethod.returnType
    )

  def `Test property default value: None`() {
    assert(OptArrayOptDecimalWithSurrogateAggregate().optArrayOptDecimal === None)
  }
}
