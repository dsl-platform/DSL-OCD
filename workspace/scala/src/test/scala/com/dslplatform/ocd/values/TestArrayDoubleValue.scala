package com.dslplatform.ocd.values

import ArrayDoubleInValue.ArrayDoubleValue
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestArrayDoubleValue extends SpecExtensions {
  def `Test property field type: Array[Double]`() =
    checkType(
      typeOf[Array[Double]]
    , typeOf[ArrayDoubleValue].member("arrayDouble": TermName).asMethod.returnType
    )

  def `Test property default value: Array.empty[Double]`() {
    assert(ArrayDoubleValue().arrayDouble === Array.empty[Double])
  }
}
