package com.dslplatform.ocd.values

import OptArrayMoneyInValue.OptArrayMoneyValue
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestOptArrayMoneyValue extends SpecExtensions {
  def `Check single property type via reflection: Option[Array[BigDecimal]]`() =
    checkType(
      typeOf[Option[Array[BigDecimal]]]
    , typeOf[OptArrayMoneyValue].member("optArrayMoney": TermName).asMethod.returnType
    )
}
