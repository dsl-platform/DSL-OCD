package com.dslplatform.ocd.aggregates

import ListUUIDInAggregate.ListUUIDAggregate
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestListUUIDAggregate extends SpecExtensions {
  def `Test property field type: IndexedSeq[java.util.UUID]`() =
    checkType(
      typeOf[IndexedSeq[java.util.UUID]]
    , typeOf[ListUUIDAggregate].member("listUUID": TermName).asMethod.returnType
    )

  def `Test property default value: IndexedSeq.empty[java.util.UUID]`() {
    assert(ListUUIDAggregate().listUUID === IndexedSeq.empty[java.util.UUID])
  }
}
