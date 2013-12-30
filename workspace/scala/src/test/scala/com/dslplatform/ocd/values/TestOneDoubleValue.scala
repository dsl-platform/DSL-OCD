package com.dslplatform.ocd.values

import OneDoubleInValue.OneDoubleValue
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestOneDoubleValue extends SpecExtensions {
  def `Check single property type via reflection: Double`() =
    checkType(
      typeOf[Double]
    , typeOf[OneDoubleValue].member("oneDouble": TermName).asMethod.returnType
    )
}
