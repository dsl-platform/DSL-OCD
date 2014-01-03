package com.dslplatform.ocd.values

import OptDoubleInValue.OptDoubleValue
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestOptDoubleValue extends SpecExtensions {
  def `Test property field type: Option[Double]`() =
    checkType(
      typeOf[Option[Double]]
    , typeOf[OptDoubleValue].member("optDouble": TermName).asMethod.returnType
    )

  def `Test property default value: None`() {
    assert(OptDoubleValue().optDouble === None)
  }
}
