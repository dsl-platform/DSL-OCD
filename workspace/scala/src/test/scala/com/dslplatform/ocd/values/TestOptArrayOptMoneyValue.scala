package com.dslplatform.ocd.values

import OptArrayOptMoneyInValue.OptArrayOptMoneyValue
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestOptArrayOptMoneyValue extends SpecExtensions {
  def `Check single property type via reflection: Option[Array[Option[BigDecimal]]]`() =
    checkType(
      typeOf[Option[Array[Option[BigDecimal]]]]
    , typeOf[OptArrayOptMoneyValue].member("optArrayOptMoney": TermName).asMethod.returnType
    )
}
