package com.dslplatform.ocd.values

import OneStringInValue.OneStringValue
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestOneStringValue extends SpecExtensions {
  def `Test property field type: String`() =
    checkType(
      typeOf[String]
    , typeOf[OneStringValue].member("oneString": TermName).asMethod.returnType
    )

  def `Test property default value: ""`() {
    assert(OneStringValue().oneString === "")
  }
}
