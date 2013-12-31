package com.dslplatform.ocd.values

import OptSetOptDecimalInValue.OptSetOptDecimalValue
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestOptSetOptDecimalValue extends SpecExtensions {
  def `Test property field type: Option[Set[Option[BigDecimal]]]`() =
    checkType(
      typeOf[Option[Set[Option[BigDecimal]]]]
    , typeOf[OptSetOptDecimalValue].member("optSetOptDecimal": TermName).asMethod.returnType
    )

  def `Test property default value: None`() {
    assert(OptSetOptDecimalValue().optSetOptDecimal === None)
  }
}
