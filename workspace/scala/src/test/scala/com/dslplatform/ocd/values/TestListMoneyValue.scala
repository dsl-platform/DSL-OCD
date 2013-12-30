package com.dslplatform.ocd.values

import ListMoneyInValue.ListMoneyValue
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestListMoneyValue extends SpecExtensions {
  def `Check single property type via reflection: IndexedSeq[BigDecimal]`() =
    checkType(
      typeOf[IndexedSeq[BigDecimal]]
    , typeOf[ListMoneyValue].member("listMoney": TermName).asMethod.returnType
    )
}
