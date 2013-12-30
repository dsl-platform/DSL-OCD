package com.dslplatform.ocd.values

import OneFloatInValue.OneFloatValue
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestOneFloatValue extends SpecExtensions {
  def `Check single property type via reflection: Float`() =
    checkType(
      typeOf[Float]
    , typeOf[OneFloatValue].member("oneFloat": TermName).asMethod.returnType
    )
}
