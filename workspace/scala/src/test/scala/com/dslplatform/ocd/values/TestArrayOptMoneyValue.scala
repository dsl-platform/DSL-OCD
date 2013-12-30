package com.dslplatform.ocd.values

import ArrayOptMoneyInValue.ArrayOptMoneyValue
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestArrayOptMoneyValue extends SpecExtensions {
  def `Check single property type via reflection: Array[Option[BigDecimal]]`() =
    checkType(
      typeOf[Array[Option[BigDecimal]]]
    , typeOf[ArrayOptMoneyValue].member("arrayOptMoney": TermName).asMethod.returnType
    )
}
