package com.dslplatform.ocd.values

import ListOptMoneyInValue.ListOptMoneyValue
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestListOptMoneyValue extends SpecExtensions {
  def `Test property field type: IndexedSeq[Option[BigDecimal]]`() =
    checkType(
      typeOf[IndexedSeq[Option[BigDecimal]]]
    , typeOf[ListOptMoneyValue].member("listOptMoney": TermName).asMethod.returnType
    )

  def `Test property default value: IndexedSeq.empty[Option[BigDecimal]]`() {
    assert(ListOptMoneyValue().listOptMoney === IndexedSeq.empty[Option[BigDecimal]])
  }
}
