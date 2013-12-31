package com.dslplatform.ocd.values

import OptDecimalInValue.OptDecimalValue
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestOptDecimalValue extends SpecExtensions {
  def `Test property field type: Option[BigDecimal]`() =
    checkType(
      typeOf[Option[BigDecimal]]
    , typeOf[OptDecimalValue].member("optDecimal": TermName).asMethod.returnType
    )

  def `Test property default value: None`() {
    assert(OptDecimalValue().optDecimal === None)
  }
}
