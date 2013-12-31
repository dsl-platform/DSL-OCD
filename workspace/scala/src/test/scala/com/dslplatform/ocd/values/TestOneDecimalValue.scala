package com.dslplatform.ocd.values

import OneDecimalInValue.OneDecimalValue
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestOneDecimalValue extends SpecExtensions {
  def `Test property field type: BigDecimal`() =
    checkType(
      typeOf[BigDecimal]
    , typeOf[OneDecimalValue].member("oneDecimal": TermName).asMethod.returnType
    )

  def `Test property default value: BigDecimal(0)`() {
    assert(OneDecimalValue().oneDecimal === BigDecimal(0))
  }
}
