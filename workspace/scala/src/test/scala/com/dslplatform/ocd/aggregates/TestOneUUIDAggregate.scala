package com.dslplatform.ocd.aggregates

import OneUUIDInAggregate.OneUUIDAggregate
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestOneUUIDAggregate extends SpecExtensions {
  def `Test property field type: java.util.UUID`() =
    checkType(
      typeOf[java.util.UUID]
    , typeOf[OneUUIDAggregate].member("oneUUID": TermName).asMethod.returnType
    )

  def `Test property default value: java.util.UUID.randomUUID`() {
    assert(OneUUIDAggregate().oneUUID.getClass == classOf[java.util.UUID]);
  }
}
