package com.dslplatform.ocd.aggregates

import SetOptBinaryWithSurrogateInAggregate.SetOptBinaryWithSurrogateAggregate
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestSetOptBinaryWithSurrogateAggregate extends SpecExtensions {
  def `Test property field type: Set[Option[Array[Byte]]]`() =
    checkType(
      typeOf[Set[Option[Array[Byte]]]]
    , typeOf[SetOptBinaryWithSurrogateAggregate].member("setOptBinary": TermName).asMethod.returnType
    )

  def `Test property default value: Set.empty[Option[Array[Byte]]]`() {
    assert(SetOptBinaryWithSurrogateAggregate().setOptBinary === Set.empty[Option[Array[Byte]]])
  }
}
