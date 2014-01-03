package com.dslplatform.ocd.aggregates

import SetUUIDInAggregate.SetUUIDAggregate
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestSetUUIDAggregate extends SpecExtensions {
  def `Test property field type: Set[java.util.UUID]`() =
    checkType(
      typeOf[Set[java.util.UUID]]
    , typeOf[SetUUIDAggregate].member("setUUID": TermName).asMethod.returnType
    )

  def `Test property default value: Set.empty[java.util.UUID]`() {
    assert(SetUUIDAggregate().setUUID === Set.empty[java.util.UUID])
  }
}
