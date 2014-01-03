package com.dslplatform.ocd.aggregates

import ArrayBinaryInAggregate.ArrayBinaryAggregate
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestArrayBinaryAggregate extends SpecExtensions {
  def `Test property field type: Array[Array[Byte]]`() =
    checkType(
      typeOf[Array[Array[Byte]]]
    , typeOf[ArrayBinaryAggregate].member("arrayBinary": TermName).asMethod.returnType
    )

  def `Test property default value: Array.empty[Array[Byte]]`() {
    assert(ArrayBinaryAggregate().arrayBinary === Array.empty[Array[Byte]])
  }
}
