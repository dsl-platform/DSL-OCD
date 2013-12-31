package com.dslplatform.ocd.values

import ArrayStringInValue.ArrayStringValue
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestArrayStringValue extends SpecExtensions {
  def `Test property field type: Array[String]`() =
    checkType(
      typeOf[Array[String]]
    , typeOf[ArrayStringValue].member("arrayString": TermName).asMethod.returnType
    )

  def `Test property default value: Array.empty[String]`() {
    assert(ArrayStringValue().arrayString === Array.empty[String])
  }
}
