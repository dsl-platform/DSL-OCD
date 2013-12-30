package com.dslplatform.ocd.values

import OptSetDecimalInValue.OptSetDecimalValue
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestOptSetDecimalValue extends SpecExtensions {
  def `Check single property type via reflection: Option[Set[BigDecimal]]`() =
    checkType(
      typeOf[Option[Set[BigDecimal]]]
    , typeOf[OptSetDecimalValue].member("optSetDecimal": TermName).asMethod.returnType
    )
}
