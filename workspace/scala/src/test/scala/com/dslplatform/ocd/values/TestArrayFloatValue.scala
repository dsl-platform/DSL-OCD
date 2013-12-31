package com.dslplatform.ocd.values

import ArrayFloatInValue.ArrayFloatValue
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestArrayFloatValue extends SpecExtensions {
  def `Test property field type: Array[Float]`() =
    checkType(
      typeOf[Array[Float]]
    , typeOf[ArrayFloatValue].member("arrayFloat": TermName).asMethod.returnType
    )

  def `Test property default value: Array.empty[Float]`() {
    assert(ArrayFloatValue().arrayFloat === Array.empty[Float])
  }
}
