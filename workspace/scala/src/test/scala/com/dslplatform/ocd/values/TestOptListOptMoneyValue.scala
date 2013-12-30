package com.dslplatform.ocd.values

import OptListOptMoneyInValue.OptListOptMoneyValue
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestOptListOptMoneyValue extends SpecExtensions {
  def `Check single property type via reflection: Option[IndexedSeq[Option[BigDecimal]]]`() =
    checkType(
      typeOf[Option[IndexedSeq[Option[BigDecimal]]]]
    , typeOf[OptListOptMoneyValue].member("optListOptMoney": TermName).asMethod.returnType
    )
}
