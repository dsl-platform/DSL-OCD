package com.dslplatform.ocd.values

import OptMoneyInValue.OptMoneyValue
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestOptMoneyValue extends SpecExtensions {
  def `Check single property type via reflection: Option[BigDecimal]`() =
    checkType(
      typeOf[Option[BigDecimal]]
    , typeOf[OptMoneyValue].member("optMoney": TermName).asMethod.returnType
    )
}
