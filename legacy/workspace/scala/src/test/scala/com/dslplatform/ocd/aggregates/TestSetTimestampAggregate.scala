package com.dslplatform.ocd.aggregates

import SetTimestampInAggregate.SetTimestampAggregate
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestSetTimestampAggregate extends SpecExtensions {
  def `Test property field type: Set[org.joda.time.DateTime]`() =
    checkType(
      typeOf[Set[org.joda.time.DateTime]]
    , typeOf[SetTimestampAggregate].member("setTimestamp": TermName).asMethod.returnType
    )

  def `Test property default value: Set.empty[org.joda.time.DateTime]`() {
    assert(SetTimestampAggregate().setTimestamp === Set.empty[org.joda.time.DateTime])
  }
}
