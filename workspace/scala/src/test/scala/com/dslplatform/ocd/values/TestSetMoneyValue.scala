package com.dslplatform.ocd.values

import SetMoneyInValue.SetMoneyValue
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestSetMoneyValue extends SpecExtensions {
  def `Check single property type via reflection: Set[BigDecimal]`() =
    checkType(
      typeOf[Set[BigDecimal]]
    , typeOf[SetMoneyValue].member("setMoney": TermName).asMethod.returnType
    )
}
