package com.dslplatform.ocd.aggregates

import OptArrayUUIDWithSurrogateInAggregate.OptArrayUUIDWithSurrogateAggregate
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestOptArrayUUIDWithSurrogateAggregate extends SpecExtensions {
  def `Test property field type: Option[Array[java.util.UUID]]`() =
    checkType(
      typeOf[Option[Array[java.util.UUID]]]
    , typeOf[OptArrayUUIDWithSurrogateAggregate].member("optArrayUUID": TermName).asMethod.returnType
    )

  def `Test property default value: None`() {
    assert(OptArrayUUIDWithSurrogateAggregate().optArrayUUID === None)
  }
}
