package com.dslplatform.ocd.values

import OneMoneyInValue.OneMoneyValue
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestOneMoneyValue extends SpecExtensions {
  def `Check single property type via reflection: BigDecimal`() =
    checkType(
      typeOf[BigDecimal]
    , typeOf[OneMoneyValue].member("oneMoney": TermName).asMethod.returnType
    )
}
