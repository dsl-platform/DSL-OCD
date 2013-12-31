package com.dslplatform.ocd.values

import ListMoneyInValue.ListMoneyValue
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestListMoneyValue extends SpecExtensions {
  def `Test property field type: IndexedSeq[BigDecimal]`() =
    checkType(
      typeOf[IndexedSeq[BigDecimal]]
    , typeOf[ListMoneyValue].member("listMoney": TermName).asMethod.returnType
    )

  def `Test property default value: IndexedSeq.empty[BigDecimal]`() {
    assert(ListMoneyValue().listMoney === IndexedSeq.empty[BigDecimal])
  }
}
