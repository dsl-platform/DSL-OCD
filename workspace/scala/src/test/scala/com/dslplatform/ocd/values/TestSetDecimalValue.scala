package com.dslplatform.ocd.values

import SetDecimalInValue.SetDecimalValue
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestSetDecimalValue extends SpecExtensions {
  def `Check single property type via reflection: Set[BigDecimal]`() =
    checkType(
      typeOf[Set[BigDecimal]]
    , typeOf[SetDecimalValue].member("setDecimal": TermName).asMethod.returnType
    )
}
