package com.dslplatform.ocd.aggregates

import ListOptBinaryInAggregate.ListOptBinaryAggregate
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestListOptBinaryAggregate extends SpecExtensions {
  def `Test property field type: IndexedSeq[Option[Array[Byte]]]`() =
    checkType(
      typeOf[IndexedSeq[Option[Array[Byte]]]]
    , typeOf[ListOptBinaryAggregate].member("listOptBinary": TermName).asMethod.returnType
    )

  def `Test property default value: IndexedSeq.empty[Option[Array[Byte]]]`() {
    assert(ListOptBinaryAggregate().listOptBinary === IndexedSeq.empty[Option[Array[Byte]]])
  }
}
