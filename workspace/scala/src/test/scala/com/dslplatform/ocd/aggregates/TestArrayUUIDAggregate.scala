package com.dslplatform.ocd.aggregates

import ArrayUUIDInAggregate.ArrayUUIDAggregate
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestArrayUUIDAggregate extends SpecExtensions {
  def `Test property field type: Array[java.util.UUID]`() =
    checkType(
      typeOf[Array[java.util.UUID]]
    , typeOf[ArrayUUIDAggregate].member("arrayUUID": TermName).asMethod.returnType
    )

  def `Test property default value: Array.empty[java.util.UUID]`() {
    assert(ArrayUUIDAggregate().arrayUUID === Array.empty[java.util.UUID])
  }
}
