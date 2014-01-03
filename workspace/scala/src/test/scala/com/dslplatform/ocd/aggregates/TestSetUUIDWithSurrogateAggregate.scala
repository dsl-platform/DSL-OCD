package com.dslplatform.ocd.aggregates

import SetUUIDWithSurrogateInAggregate.SetUUIDWithSurrogateAggregate
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestSetUUIDWithSurrogateAggregate extends SpecExtensions {
  def `Test property field type: Set[java.util.UUID]`() =
    checkType(
      typeOf[Set[java.util.UUID]]
    , typeOf[SetUUIDWithSurrogateAggregate].member("setUUID": TermName).asMethod.returnType
    )

  def `Test property default value: Set.empty[java.util.UUID]`() {
    assert(SetUUIDWithSurrogateAggregate().setUUID === Set.empty[java.util.UUID])
  }
}
