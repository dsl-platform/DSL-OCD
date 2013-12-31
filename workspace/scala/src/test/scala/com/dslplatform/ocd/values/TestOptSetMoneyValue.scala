package com.dslplatform.ocd.values

import OptSetMoneyInValue.OptSetMoneyValue
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestOptSetMoneyValue extends SpecExtensions {
  def `Test property field type: Option[Set[BigDecimal]]`() =
    checkType(
      typeOf[Option[Set[BigDecimal]]]
    , typeOf[OptSetMoneyValue].member("optSetMoney": TermName).asMethod.returnType
    )

  def `Test property default value: None`() {
    assert(OptSetMoneyValue().optSetMoney === None)
  }
}
