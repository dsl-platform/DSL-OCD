package com.dslplatform.ocd.aggregates

import ArrayUUIDWithSurrogateInAggregate.ArrayUUIDWithSurrogateAggregate
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestArrayUUIDWithSurrogateAggregate extends SpecExtensions {
  def `Test property field type: Array[java.util.UUID]`() =
    checkType(
      typeOf[Array[java.util.UUID]]
    , typeOf[ArrayUUIDWithSurrogateAggregate].member("arrayUUID": TermName).asMethod.returnType
    )

  def `Test property default value: Array.empty[java.util.UUID]`() {
    assert(ArrayUUIDWithSurrogateAggregate().arrayUUID === Array.empty[java.util.UUID])
  }
}
