package com.dslplatform.ocd.values

import ArrayMoneyInValue.ArrayMoneyValue
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestArrayMoneyValue extends SpecExtensions {
  def `Test property field type: Array[BigDecimal]`() =
    checkType(
      typeOf[Array[BigDecimal]]
    , typeOf[ArrayMoneyValue].member("arrayMoney": TermName).asMethod.returnType
    )

  def `Test property default value: Array.empty[BigDecimal]`() {
    assert(ArrayMoneyValue().arrayMoney === Array.empty[BigDecimal])
  }
}
