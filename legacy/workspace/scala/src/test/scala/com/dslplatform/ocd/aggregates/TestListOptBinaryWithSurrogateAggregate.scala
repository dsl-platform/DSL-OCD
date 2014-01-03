package com.dslplatform.ocd.aggregates

import ListOptBinaryWithSurrogateInAggregate.ListOptBinaryWithSurrogateAggregate
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestListOptBinaryWithSurrogateAggregate extends SpecExtensions {
  def `Test property field type: IndexedSeq[Option[Array[Byte]]]`() =
    checkType(
      typeOf[IndexedSeq[Option[Array[Byte]]]]
    , typeOf[ListOptBinaryWithSurrogateAggregate].member("listOptBinary": TermName).asMethod.returnType
    )

  def `Test property default value: IndexedSeq.empty[Option[Array[Byte]]]`() {
    assert(ListOptBinaryWithSurrogateAggregate().listOptBinary === IndexedSeq.empty[Option[Array[Byte]]])
  }
}
