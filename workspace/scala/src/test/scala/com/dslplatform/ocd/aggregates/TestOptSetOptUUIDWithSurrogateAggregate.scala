package com.dslplatform.ocd.aggregates

import OptSetOptUUIDWithSurrogateInAggregate.OptSetOptUUIDWithSurrogateAggregate
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestOptSetOptUUIDWithSurrogateAggregate extends SpecExtensions {
  def `Test property field type: Option[Set[Option[java.util.UUID]]]`() =
    checkType(
      typeOf[Option[Set[Option[java.util.UUID]]]]
    , typeOf[OptSetOptUUIDWithSurrogateAggregate].member("optSetOptUUID": TermName).asMethod.returnType
    )

  def `Test property default value: None`() {
    assert(OptSetOptUUIDWithSurrogateAggregate().optSetOptUUID === None)
  }
}
