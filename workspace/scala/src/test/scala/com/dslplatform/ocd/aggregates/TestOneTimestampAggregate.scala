package com.dslplatform.ocd.aggregates

import OneTimestampInAggregate.OneTimestampAggregate
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestOneTimestampAggregate extends SpecExtensions {
  def `Test property field type: org.joda.time.DateTime`() =
    checkType(
      typeOf[org.joda.time.DateTime]
    , typeOf[OneTimestampAggregate].member("oneTimestamp": TermName).asMethod.returnType
    )

  def `Test property default value: org.joda.time.DateTime.now`() {
    assert(OneTimestampAggregate().oneTimestamp.getClass == classOf[org.joda.time.DateTime]);
  }
}
