package com.dslplatform.ocd.aggregates

import ArrayOptUUIDInAggregate.ArrayOptUUIDAggregate
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestArrayOptUUIDAggregate extends SpecExtensions {
  def `Test property field type: Array[Option[java.util.UUID]]`() =
    checkType(
      typeOf[Array[Option[java.util.UUID]]]
    , typeOf[ArrayOptUUIDAggregate].member("arrayOptUUID": TermName).asMethod.returnType
    )

  def `Test property default value: Array.empty[Option[java.util.UUID]]`() {
    assert(ArrayOptUUIDAggregate().arrayOptUUID === Array.empty[Option[java.util.UUID]])
  }
}
