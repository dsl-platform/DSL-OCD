package com.dslplatform.ocd.aggregates

import ListTimestampWithSurrogateInAggregate.ListTimestampWithSurrogateAggregate
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestListTimestampWithSurrogateAggregate extends SpecExtensions {
  def `Test property field type: IndexedSeq[org.joda.time.DateTime]`() =
    checkType(
      typeOf[IndexedSeq[org.joda.time.DateTime]]
    , typeOf[ListTimestampWithSurrogateAggregate].member("listTimestamp": TermName).asMethod.returnType
    )

  def `Test property default value: IndexedSeq.empty[org.joda.time.DateTime]`() {
    assert(ListTimestampWithSurrogateAggregate().listTimestamp === IndexedSeq.empty[org.joda.time.DateTime])
  }
}
