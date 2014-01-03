package com.dslplatform.ocd.aggregates

import ListBinaryWithSurrogateInAggregate.ListBinaryWithSurrogateAggregate
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestListBinaryWithSurrogateAggregate extends SpecExtensions {
  def `Test property field type: IndexedSeq[Array[Byte]]`() =
    checkType(
      typeOf[IndexedSeq[Array[Byte]]]
    , typeOf[ListBinaryWithSurrogateAggregate].member("listBinary": TermName).asMethod.returnType
    )

  def `Test property default value: IndexedSeq.empty[Array[Byte]]`() {
    assert(ListBinaryWithSurrogateAggregate().listBinary === IndexedSeq.empty[Array[Byte]])
  }
}
