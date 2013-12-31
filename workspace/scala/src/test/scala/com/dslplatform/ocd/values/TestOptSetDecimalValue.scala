package com.dslplatform.ocd.values

import OptSetDecimalInValue.OptSetDecimalValue
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestOptSetDecimalValue extends SpecExtensions {
  def `Test property field type: Option[Set[BigDecimal]]`() =
    checkType(
      typeOf[Option[Set[BigDecimal]]]
    , typeOf[OptSetDecimalValue].member("optSetDecimal": TermName).asMethod.returnType
    )

  def `Test property default value: None`() {
    assert(OptSetDecimalValue().optSetDecimal === None)
  }
}
