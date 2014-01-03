package com.dslplatform.ocd.aggregates

import OptListUUIDWithSurrogateInAggregate.OptListUUIDWithSurrogateAggregate
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestOptListUUIDWithSurrogateAggregate extends SpecExtensions {
  def `Test property field type: Option[IndexedSeq[java.util.UUID]]`() =
    checkType(
      typeOf[Option[IndexedSeq[java.util.UUID]]]
    , typeOf[OptListUUIDWithSurrogateAggregate].member("optListUUID": TermName).asMethod.returnType
    )

  def `Test property default value: None`() {
    assert(OptListUUIDWithSurrogateAggregate().optListUUID === None)
  }
}
