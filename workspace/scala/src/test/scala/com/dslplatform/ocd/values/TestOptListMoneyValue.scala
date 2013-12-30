package com.dslplatform.ocd.values

import OptListMoneyInValue.OptListMoneyValue
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestOptListMoneyValue extends SpecExtensions {
  def `Check single property type via reflection: Option[IndexedSeq[BigDecimal]]`() =
    checkType(
      typeOf[Option[IndexedSeq[BigDecimal]]]
    , typeOf[OptListMoneyValue].member("optListMoney": TermName).asMethod.returnType
    )
}
