package com.dslplatform.ocd.values

import ArrayMoneyInValue.ArrayMoneyValue
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestArrayMoneyValue extends SpecExtensions {
  def `Check single property type via reflection: Array[BigDecimal]`() =
    checkType(
      typeOf[Array[BigDecimal]]
    , typeOf[ArrayMoneyValue].member("arrayMoney": TermName).asMethod.returnType
    )
}
