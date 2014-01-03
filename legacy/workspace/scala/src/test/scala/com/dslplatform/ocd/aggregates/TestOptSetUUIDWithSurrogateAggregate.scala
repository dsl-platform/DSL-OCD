package com.dslplatform.ocd.aggregates

import OptSetUUIDWithSurrogateInAggregate.OptSetUUIDWithSurrogateAggregate
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestOptSetUUIDWithSurrogateAggregate extends SpecExtensions {
  def `Test property field type: Option[Set[java.util.UUID]]`() =
    checkType(
      typeOf[Option[Set[java.util.UUID]]]
    , typeOf[OptSetUUIDWithSurrogateAggregate].member("optSetUUID": TermName).asMethod.returnType
    )

  def `Test property default value: None`() {
    assert(OptSetUUIDWithSurrogateAggregate().optSetUUID === None)
  }
}
