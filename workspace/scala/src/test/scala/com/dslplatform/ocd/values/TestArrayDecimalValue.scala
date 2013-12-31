package com.dslplatform.ocd.values

import ArrayDecimalInValue.ArrayDecimalValue
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestArrayDecimalValue extends SpecExtensions {
  def `Test property field type: Array[BigDecimal]`() =
    checkType(
      typeOf[Array[BigDecimal]]
    , typeOf[ArrayDecimalValue].member("arrayDecimal": TermName).asMethod.returnType
    )

  def `Test property default value: Array.empty[BigDecimal]`() {
    assert(ArrayDecimalValue().arrayDecimal === Array.empty[BigDecimal])
  }
}
