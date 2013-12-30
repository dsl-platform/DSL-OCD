package com.dslplatform.ocd.values

import SetOptDecimalInValue.SetOptDecimalValue
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestSetOptDecimalValue extends SpecExtensions {
  def `Check single property type via reflection: Set[Option[BigDecimal]]`() =
    checkType(
      typeOf[Set[Option[BigDecimal]]]
    , typeOf[SetOptDecimalValue].member("setOptDecimal": TermName).asMethod.returnType
    )
}
