package com.dslplatform.ocd.aggregates

import SetOptUUIDInAggregate.SetOptUUIDAggregate
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestSetOptUUIDAggregate extends SpecExtensions {
  def `Test property field type: Set[Option[java.util.UUID]]`() =
    checkType(
      typeOf[Set[Option[java.util.UUID]]]
    , typeOf[SetOptUUIDAggregate].member("setOptUUID": TermName).asMethod.returnType
    )

  def `Test property default value: Set.empty[Option[java.util.UUID]]`() {
    assert(SetOptUUIDAggregate().setOptUUID === Set.empty[Option[java.util.UUID]])
  }
}
