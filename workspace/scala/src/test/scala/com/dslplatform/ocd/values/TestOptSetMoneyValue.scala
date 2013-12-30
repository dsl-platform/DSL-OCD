package com.dslplatform.ocd.values

import OptSetMoneyInValue.OptSetMoneyValue
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestOptSetMoneyValue extends SpecExtensions {
  def `Check single property type via reflection: Option[Set[BigDecimal]]`() =
    checkType(
      typeOf[Option[Set[BigDecimal]]]
    , typeOf[OptSetMoneyValue].member("optSetMoney": TermName).asMethod.returnType
    )
}