package com.dslplatform.ocd.values

import OptDecimalInValue.OptDecimalValue
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestOptDecimalValue extends SpecExtensions {
  def `Check single property type via reflection: Option[BigDecimal]`() =
    checkType(
      typeOf[Option[BigDecimal]]
    , typeOf[OptDecimalValue].member("optDecimal": TermName).asMethod.returnType
    )
}
