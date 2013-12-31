package com.dslplatform.ocd.values

import OneFloatInValue.OneFloatValue
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestOneFloatValue extends SpecExtensions {
  def `Test property field type: Float`() =
    checkType(
      typeOf[Float]
    , typeOf[OneFloatValue].member("oneFloat": TermName).asMethod.returnType
    )

  def `Test property default value: 0.0f`() {
    assert(OneFloatValue().oneFloat === 0.0f)
  }
}
