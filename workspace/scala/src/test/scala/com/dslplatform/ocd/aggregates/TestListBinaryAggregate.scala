package com.dslplatform.ocd.aggregates

import ListBinaryInAggregate.ListBinaryAggregate
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestListBinaryAggregate extends SpecExtensions {
  def `Test property field type: IndexedSeq[Array[Byte]]`() =
    checkType(
      typeOf[IndexedSeq[Array[Byte]]]
    , typeOf[ListBinaryAggregate].member("listBinary": TermName).asMethod.returnType
    )

  def `Test property default value: IndexedSeq.empty[Array[Byte]]`() {
    assert(ListBinaryAggregate().listBinary === IndexedSeq.empty[Array[Byte]])
  }
}
