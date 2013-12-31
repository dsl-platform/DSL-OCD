package com.dslplatform.ocd.values

import OptSetOptMoneyInValue.OptSetOptMoneyValue
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestOptSetOptMoneyValue extends SpecExtensions {
  def `Test property field type: Option[Set[Option[BigDecimal]]]`() =
    checkType(
      typeOf[Option[Set[Option[BigDecimal]]]]
    , typeOf[OptSetOptMoneyValue].member("optSetOptMoney": TermName).asMethod.returnType
    )

  def `Test property default value: None`() {
    assert(OptSetOptMoneyValue().optSetOptMoney === None)
  }
}
