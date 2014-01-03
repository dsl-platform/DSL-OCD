package com.dslplatform.ocd.aggregates

import SetOptUUIDWithSurrogateInAggregate.SetOptUUIDWithSurrogateAggregate
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestSetOptUUIDWithSurrogateAggregate extends SpecExtensions {
  def `Test property field type: Set[Option[java.util.UUID]]`() =
    checkType(
      typeOf[Set[Option[java.util.UUID]]]
    , typeOf[SetOptUUIDWithSurrogateAggregate].member("setOptUUID": TermName).asMethod.returnType
    )

  def `Test property default value: Set.empty[Option[java.util.UUID]]`() {
    assert(SetOptUUIDWithSurrogateAggregate().setOptUUID === Set.empty[Option[java.util.UUID]])
  }
}
