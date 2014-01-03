package com.dslplatform.ocd.aggregates

import ListOptUUIDWithSurrogateInAggregate.ListOptUUIDWithSurrogateAggregate
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestListOptUUIDWithSurrogateAggregate extends SpecExtensions {
  def `Test property field type: IndexedSeq[Option[java.util.UUID]]`() =
    checkType(
      typeOf[IndexedSeq[Option[java.util.UUID]]]
    , typeOf[ListOptUUIDWithSurrogateAggregate].member("listOptUUID": TermName).asMethod.returnType
    )

  def `Test property default value: IndexedSeq.empty[Option[java.util.UUID]]`() {
    assert(ListOptUUIDWithSurrogateAggregate().listOptUUID === IndexedSeq.empty[Option[java.util.UUID]])
  }
}
