package com.dslplatform.ocd.values

import OptMoneyInValue.OptMoneyValue
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestOptMoneyValue extends SpecExtensions {
  def `Test property field type: Option[BigDecimal]`() =
    checkType(
      typeOf[Option[BigDecimal]]
    , typeOf[OptMoneyValue].member("optMoney": TermName).asMethod.returnType
    )

  def `Test property default value: None`() {
    assert(OptMoneyValue().optMoney === None)
  }
}
