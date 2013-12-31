package com.dslplatform.ocd.aggregates

import OneDecimalInAggregate.OneDecimalAggregate
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestOneDecimalAggregate extends SpecExtensions {
  def `Test property field type: BigDecimal`() =
    checkType(
      typeOf[BigDecimal]
    , typeOf[OneDecimalAggregate].member("oneDecimal": TermName).asMethod.returnType
    )

  def `Test property default value: BigDecimal(0)`() {
    assert(OneDecimalAggregate().oneDecimal === BigDecimal(0))
  }
}
