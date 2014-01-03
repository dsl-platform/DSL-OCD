package com.dslplatform.ocd.values

import SetDecimalInValue.SetDecimalValue
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestSetDecimalValue extends SpecExtensions {
  def `Test property field type: Set[BigDecimal]`() =
    checkType(
      typeOf[Set[BigDecimal]]
    , typeOf[SetDecimalValue].member("setDecimal": TermName).asMethod.returnType
    )

  def `Test property default value: Set.empty[BigDecimal]`() {
    assert(SetDecimalValue().setDecimal === Set.empty[BigDecimal])
  }
}
