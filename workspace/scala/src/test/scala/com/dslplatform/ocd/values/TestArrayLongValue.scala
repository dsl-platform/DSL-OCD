package com.dslplatform.ocd.values

import ArrayLongInValue.ArrayLongValue
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestArrayLongValue extends SpecExtensions {
  def `Test property field type: Array[Long]`() =
    checkType(
      typeOf[Array[Long]]
    , typeOf[ArrayLongValue].member("arrayLong": TermName).asMethod.returnType
    )

  def `Test property default value: Array.empty[Long]`() {
    assert(ArrayLongValue().arrayLong === Array.empty[Long])
  }
}
