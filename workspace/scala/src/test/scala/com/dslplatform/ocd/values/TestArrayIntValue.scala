package com.dslplatform.ocd.values

import ArrayIntInValue.ArrayIntValue
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestArrayIntValue extends SpecExtensions {
  def `Test property field type: Array[Int]`() =
    checkType(
      typeOf[Array[Int]]
    , typeOf[ArrayIntValue].member("arrayInt": TermName).asMethod.returnType
    )

  def `Test property default value: Array.empty[Int]`() {
    assert(ArrayIntValue().arrayInt === Array.empty[Int])
  }
}
