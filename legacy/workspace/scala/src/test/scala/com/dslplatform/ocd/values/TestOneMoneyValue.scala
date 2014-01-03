package com.dslplatform.ocd.values

import OneMoneyInValue.OneMoneyValue
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestOneMoneyValue extends SpecExtensions {
  def `Test property field type: BigDecimal`() =
    checkType(
      typeOf[BigDecimal]
    , typeOf[OneMoneyValue].member("oneMoney": TermName).asMethod.returnType
    )

  def `Test property default value: BigDecimal(0)`() {
    assert(OneMoneyValue().oneMoney === BigDecimal(0))
  }
}
