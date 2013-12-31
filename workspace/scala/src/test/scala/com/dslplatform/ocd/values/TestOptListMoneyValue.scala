package com.dslplatform.ocd.values

import OptListMoneyInValue.OptListMoneyValue
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestOptListMoneyValue extends SpecExtensions {
  def `Test property field type: Option[IndexedSeq[BigDecimal]]`() =
    checkType(
      typeOf[Option[IndexedSeq[BigDecimal]]]
    , typeOf[OptListMoneyValue].member("optListMoney": TermName).asMethod.returnType
    )

  def `Test property default value: None`() {
    assert(OptListMoneyValue().optListMoney === None)
  }
}
