package com.dslplatform.ocd.aggregates

import ArrayOptBinaryWithSurrogateInAggregate.ArrayOptBinaryWithSurrogateAggregate
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestArrayOptBinaryWithSurrogateAggregate extends SpecExtensions {
  def `Test property field type: Array[Option[Array[Byte]]]`() =
    checkType(
      typeOf[Array[Option[Array[Byte]]]]
    , typeOf[ArrayOptBinaryWithSurrogateAggregate].member("arrayOptBinary": TermName).asMethod.returnType
    )

  def `Test property default value: Array.empty[Option[Array[Byte]]]`() {
    assert(ArrayOptBinaryWithSurrogateAggregate().arrayOptBinary === Array.empty[Option[Array[Byte]]])
  }
}
