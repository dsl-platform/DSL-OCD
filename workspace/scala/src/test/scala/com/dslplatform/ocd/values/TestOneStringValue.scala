package com.dslplatform.ocd.values

import OneStringInValue.OneStringValue
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestOneStringValue extends SpecExtensions {
  def `Check single property type via reflection: String`() =
    checkType(
      typeOf[String]
    , typeOf[OneStringValue].member("oneString": TermName).asMethod.returnType
    )
}
