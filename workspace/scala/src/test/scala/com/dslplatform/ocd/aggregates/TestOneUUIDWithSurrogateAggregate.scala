package com.dslplatform.ocd.aggregates

import OneUUIDWithSurrogateInAggregate.OneUUIDWithSurrogateAggregate
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestOneUUIDWithSurrogateAggregate extends SpecExtensions {
  def `Test property field type: java.util.UUID`() =
    checkType(
      typeOf[java.util.UUID]
    , typeOf[OneUUIDWithSurrogateAggregate].member("oneUUID": TermName).asMethod.returnType
    )

  def `Test property default value: java.util.UUID.randomUUID`() {
    assert(OneUUIDWithSurrogateAggregate().oneUUID.getClass == classOf[java.util.UUID]);
  }
}
