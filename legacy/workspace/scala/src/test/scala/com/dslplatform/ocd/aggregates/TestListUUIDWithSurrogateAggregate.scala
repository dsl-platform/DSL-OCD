package com.dslplatform.ocd.aggregates

import ListUUIDWithSurrogateInAggregate.ListUUIDWithSurrogateAggregate
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestListUUIDWithSurrogateAggregate extends SpecExtensions {
  def `Test property field type: IndexedSeq[java.util.UUID]`() =
    checkType(
      typeOf[IndexedSeq[java.util.UUID]]
    , typeOf[ListUUIDWithSurrogateAggregate].member("listUUID": TermName).asMethod.returnType
    )

  def `Test property default value: IndexedSeq.empty[java.util.UUID]`() {
    assert(ListUUIDWithSurrogateAggregate().listUUID === IndexedSeq.empty[java.util.UUID])
  }
}
