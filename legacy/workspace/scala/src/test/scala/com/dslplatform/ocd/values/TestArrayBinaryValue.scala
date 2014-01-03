package com.dslplatform.ocd.values

import ArrayBinaryInValue.ArrayBinaryValue
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestArrayBinaryValue extends SpecExtensions {
  def `Test property field type: Array[Array[Byte]]`() =
    checkType(
      typeOf[Array[Array[Byte]]]
    , typeOf[ArrayBinaryValue].member("arrayBinary": TermName).asMethod.returnType
    )

  def `Test property default value: Array.empty[Array[Byte]]`() {
    assert(ArrayBinaryValue().arrayBinary === Array.empty[Array[Byte]])
  }
}
