package com.dslplatform.ocd.values

import OptArrayDecimalInValue.OptArrayDecimalValue
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestOptArrayDecimalValue extends SpecExtensions {
  def `Test property field type: Option[Array[BigDecimal]]`() =
    checkType(
      typeOf[Option[Array[BigDecimal]]]
    , typeOf[OptArrayDecimalValue].member("optArrayDecimal": TermName).asMethod.returnType
    )

  def `Test property default value: None`() {
    assert(OptArrayDecimalValue().optArrayDecimal === None)
  }
}
