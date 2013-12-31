package com.dslplatform.ocd.values

import SetOptMoneyInValue.SetOptMoneyValue
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestSetOptMoneyValue extends SpecExtensions {
  def `Test property field type: Set[Option[BigDecimal]]`() =
    checkType(
      typeOf[Set[Option[BigDecimal]]]
    , typeOf[SetOptMoneyValue].member("setOptMoney": TermName).asMethod.returnType
    )

  def `Test property default value: Set.empty[Option[BigDecimal]]`() {
    assert(SetOptMoneyValue().setOptMoney === Set.empty[Option[BigDecimal]])
  }
}
