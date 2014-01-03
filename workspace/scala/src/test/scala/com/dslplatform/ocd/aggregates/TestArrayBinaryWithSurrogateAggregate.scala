package com.dslplatform.ocd.aggregates

import ArrayBinaryWithSurrogateInAggregate.ArrayBinaryWithSurrogateAggregate
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestArrayBinaryWithSurrogateAggregate extends SpecExtensions {
  def `Test property field type: Array[Array[Byte]]`() =
    checkType(
      typeOf[Array[Array[Byte]]]
    , typeOf[ArrayBinaryWithSurrogateAggregate].member("arrayBinary": TermName).asMethod.returnType
    )

  def `Test property default value: Array.empty[Array[Byte]]`() {
    assert(ArrayBinaryWithSurrogateAggregate().arrayBinary === Array.empty[Array[Byte]])
  }
}
