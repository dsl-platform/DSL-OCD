package com.dslplatform.ocd.aggregates

import ArrayOptUUIDWithSurrogateInAggregate.ArrayOptUUIDWithSurrogateAggregate
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestArrayOptUUIDWithSurrogateAggregate extends SpecExtensions {
  def `Test property field type: Array[Option[java.util.UUID]]`() =
    checkType(
      typeOf[Array[Option[java.util.UUID]]]
    , typeOf[ArrayOptUUIDWithSurrogateAggregate].member("arrayOptUUID": TermName).asMethod.returnType
    )

  def `Test property default value: Array.empty[Option[java.util.UUID]]`() {
    assert(ArrayOptUUIDWithSurrogateAggregate().arrayOptUUID === Array.empty[Option[java.util.UUID]])
  }
}
