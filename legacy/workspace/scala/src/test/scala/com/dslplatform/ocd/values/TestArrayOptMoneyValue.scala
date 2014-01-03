package com.dslplatform.ocd.values

import ArrayOptMoneyInValue.ArrayOptMoneyValue
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestArrayOptMoneyValue extends SpecExtensions {
  def `Test property field type: Array[Option[BigDecimal]]`() =
    checkType(
      typeOf[Array[Option[BigDecimal]]]
    , typeOf[ArrayOptMoneyValue].member("arrayOptMoney": TermName).asMethod.returnType
    )

  def `Test property default value: Array.empty[Option[BigDecimal]]`() {
    assert(ArrayOptMoneyValue().arrayOptMoney === Array.empty[Option[BigDecimal]])
  }
}
