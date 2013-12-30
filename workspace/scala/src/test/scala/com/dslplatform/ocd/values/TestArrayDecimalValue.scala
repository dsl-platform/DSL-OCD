package com.dslplatform.ocd.values

import ArrayDecimalInValue.ArrayDecimalValue
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestArrayDecimalValue extends SpecExtensions {
  def `Check single property type via reflection: Array[BigDecimal]`() =
    checkType(
      typeOf[Array[BigDecimal]]
    , typeOf[ArrayDecimalValue].member("arrayDecimal": TermName).asMethod.returnType
    )
}
