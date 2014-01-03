package com.dslplatform.ocd.aggregates

import OptArrayOptUUIDWithSurrogateInAggregate.OptArrayOptUUIDWithSurrogateAggregate
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestOptArrayOptUUIDWithSurrogateAggregate extends SpecExtensions {
  def `Test property field type: Option[Array[Option[java.util.UUID]]]`() =
    checkType(
      typeOf[Option[Array[Option[java.util.UUID]]]]
    , typeOf[OptArrayOptUUIDWithSurrogateAggregate].member("optArrayOptUUID": TermName).asMethod.returnType
    )

  def `Test property default value: None`() {
    assert(OptArrayOptUUIDWithSurrogateAggregate().optArrayOptUUID === None)
  }
}
