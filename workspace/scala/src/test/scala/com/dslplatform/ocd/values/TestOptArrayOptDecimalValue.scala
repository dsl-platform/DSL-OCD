package com.dslplatform.ocd.values

import OptArrayOptDecimalInValue.OptArrayOptDecimalValue
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestOptArrayOptDecimalValue extends SpecExtensions {
  def `Test property field type: Option[Array[Option[BigDecimal]]]`() =
    checkType(
      typeOf[Option[Array[Option[BigDecimal]]]]
    , typeOf[OptArrayOptDecimalValue].member("optArrayOptDecimal": TermName).asMethod.returnType
    )

  def `Test property default value: None`() {
    assert(OptArrayOptDecimalValue().optArrayOptDecimal === None)
  }
}
