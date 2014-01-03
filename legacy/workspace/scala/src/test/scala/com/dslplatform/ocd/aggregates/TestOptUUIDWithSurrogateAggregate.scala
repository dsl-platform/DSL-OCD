package com.dslplatform.ocd.aggregates

import OptUUIDWithSurrogateInAggregate.OptUUIDWithSurrogateAggregate
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestOptUUIDWithSurrogateAggregate extends SpecExtensions {
  def `Test property field type: Option[java.util.UUID]`() =
    checkType(
      typeOf[Option[java.util.UUID]]
    , typeOf[OptUUIDWithSurrogateAggregate].member("optUUID": TermName).asMethod.returnType
    )

  def `Test property default value: None`() {
    assert(OptUUIDWithSurrogateAggregate().optUUID === None)
  }
}
