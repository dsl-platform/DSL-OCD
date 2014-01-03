package com.dslplatform.ocd.aggregates

import ListTimestampInAggregate.ListTimestampAggregate
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestListTimestampAggregate extends SpecExtensions {
  def `Test property field type: IndexedSeq[org.joda.time.DateTime]`() =
    checkType(
      typeOf[IndexedSeq[org.joda.time.DateTime]]
    , typeOf[ListTimestampAggregate].member("listTimestamp": TermName).asMethod.returnType
    )

  def `Test property default value: IndexedSeq.empty[org.joda.time.DateTime]`() {
    assert(ListTimestampAggregate().listTimestamp === IndexedSeq.empty[org.joda.time.DateTime])
  }
}
