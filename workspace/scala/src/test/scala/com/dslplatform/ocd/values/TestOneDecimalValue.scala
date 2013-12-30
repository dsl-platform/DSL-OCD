package com.dslplatform.ocd.values

import OneDecimalInValue.OneDecimalValue
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestOneDecimalValue extends SpecExtensions {
  def `Check single property type via reflection: BigDecimal`() =
    checkType(
      typeOf[BigDecimal]
    , typeOf[OneDecimalValue].member("oneDecimal": TermName).asMethod.returnType
    )
}
