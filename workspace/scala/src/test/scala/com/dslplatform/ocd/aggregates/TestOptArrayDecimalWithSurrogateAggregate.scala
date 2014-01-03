package com.dslplatform.ocd.aggregates

import OptArrayDecimalWithSurrogateInAggregate.OptArrayDecimalWithSurrogateAggregate
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestOptArrayDecimalWithSurrogateAggregate extends SpecExtensions {
  def `Test property field type: Option[Array[BigDecimal]]`() =
    checkType(
      typeOf[Option[Array[BigDecimal]]]
    , typeOf[OptArrayDecimalWithSurrogateAggregate].member("optArrayDecimal": TermName).asMethod.returnType
    )

  def `Test property default value: None`() {
    assert(OptArrayDecimalWithSurrogateAggregate().optArrayDecimal === None)
  }
}
