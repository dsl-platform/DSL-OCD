package com.dslplatform.ocd.aggregates

import ListOptUUIDInAggregate.ListOptUUIDAggregate
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestListOptUUIDAggregate extends SpecExtensions {
  def `Test property field type: IndexedSeq[Option[java.util.UUID]]`() =
    checkType(
      typeOf[IndexedSeq[Option[java.util.UUID]]]
    , typeOf[ListOptUUIDAggregate].member("listOptUUID": TermName).asMethod.returnType
    )

  def `Test property default value: IndexedSeq.empty[Option[java.util.UUID]]`() {
    assert(ListOptUUIDAggregate().listOptUUID === IndexedSeq.empty[Option[java.util.UUID]])
  }
}
