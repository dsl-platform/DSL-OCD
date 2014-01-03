package com.dslplatform.ocd.aggregates

import OptListOptUUIDWithSurrogateInAggregate.OptListOptUUIDWithSurrogateAggregate
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestOptListOptUUIDWithSurrogateAggregate extends SpecExtensions {
  def `Test property field type: Option[IndexedSeq[Option[java.util.UUID]]]`() =
    checkType(
      typeOf[Option[IndexedSeq[Option[java.util.UUID]]]]
    , typeOf[OptListOptUUIDWithSurrogateAggregate].member("optListOptUUID": TermName).asMethod.returnType
    )

  def `Test property default value: None`() {
    assert(OptListOptUUIDWithSurrogateAggregate().optListOptUUID === None)
  }
}
