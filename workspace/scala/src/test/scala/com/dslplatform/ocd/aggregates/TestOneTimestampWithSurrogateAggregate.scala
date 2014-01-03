package com.dslplatform.ocd.aggregates

import OneTimestampWithSurrogateInAggregate.OneTimestampWithSurrogateAggregate
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestOneTimestampWithSurrogateAggregate extends SpecExtensions {
  def `Test property field type: org.joda.time.DateTime`() =
    checkType(
      typeOf[org.joda.time.DateTime]
    , typeOf[OneTimestampWithSurrogateAggregate].member("oneTimestamp": TermName).asMethod.returnType
    )

  def `Test property default value: org.joda.time.DateTime.now`() {
    assert(OneTimestampWithSurrogateAggregate().oneTimestamp.getClass == classOf[org.joda.time.DateTime]);
  }
}
