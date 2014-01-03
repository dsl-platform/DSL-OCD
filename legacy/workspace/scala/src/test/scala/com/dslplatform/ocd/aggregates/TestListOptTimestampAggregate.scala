package com.dslplatform.ocd.aggregates

import ListOptTimestampInAggregate.ListOptTimestampAggregate
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestListOptTimestampAggregate extends SpecExtensions {
  def `Test property field type: IndexedSeq[Option[org.joda.time.DateTime]]`() =
    checkType(
      typeOf[IndexedSeq[Option[org.joda.time.DateTime]]]
    , typeOf[ListOptTimestampAggregate].member("listOptTimestamp": TermName).asMethod.returnType
    )

  def `Test property default value: IndexedSeq.empty[Option[org.joda.time.DateTime]]`() {
    assert(ListOptTimestampAggregate().listOptTimestamp === IndexedSeq.empty[Option[org.joda.time.DateTime]])
  }
}
