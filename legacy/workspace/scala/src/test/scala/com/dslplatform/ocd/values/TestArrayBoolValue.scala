package com.dslplatform.ocd.values

import ArrayBoolInValue.ArrayBoolValue
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestArrayBoolValue extends SpecExtensions {
  def `Test property field type: Array[Boolean]`() =
    checkType(
      typeOf[Array[Boolean]]
    , typeOf[ArrayBoolValue].member("arrayBool": TermName).asMethod.returnType
    )

  def `Test property default value: Array.empty[Boolean]`() {
    assert(ArrayBoolValue().arrayBool === Array.empty[Boolean])
  }
}
