package com.dslplatform.ocd.values

import OneDoubleInValue.OneDoubleValue
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestOneDoubleValue extends SpecExtensions {
  def `Test property field type: Double`() =
    checkType(
      typeOf[Double]
    , typeOf[OneDoubleValue].member("oneDouble": TermName).asMethod.returnType
    )

  def `Test property default value: 0.0`() {
    assert(OneDoubleValue().oneDouble === 0.0)
  }
}
