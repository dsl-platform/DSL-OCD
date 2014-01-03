package com.dslplatform.ocd.aggregates

import SetOptTimestampInAggregate.SetOptTimestampAggregate
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestSetOptTimestampAggregate extends SpecExtensions {
  def `Test property field type: Set[Option[org.joda.time.DateTime]]`() =
    checkType(
      typeOf[Set[Option[org.joda.time.DateTime]]]
    , typeOf[SetOptTimestampAggregate].member("setOptTimestamp": TermName).asMethod.returnType
    )

  def `Test property default value: Set.empty[Option[org.joda.time.DateTime]]`() {
    assert(SetOptTimestampAggregate().setOptTimestamp === Set.empty[Option[org.joda.time.DateTime]])
  }
}
