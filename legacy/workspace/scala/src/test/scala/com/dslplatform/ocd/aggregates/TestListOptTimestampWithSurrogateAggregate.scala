package com.dslplatform.ocd.aggregates

import ListOptTimestampWithSurrogateInAggregate.ListOptTimestampWithSurrogateAggregate
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestListOptTimestampWithSurrogateAggregate extends SpecExtensions {
  def `Test property field type: IndexedSeq[Option[org.joda.time.DateTime]]`() =
    checkType(
      typeOf[IndexedSeq[Option[org.joda.time.DateTime]]]
    , typeOf[ListOptTimestampWithSurrogateAggregate].member("listOptTimestamp": TermName).asMethod.returnType
    )

  def `Test property default value: IndexedSeq.empty[Option[org.joda.time.DateTime]]`() {
    assert(ListOptTimestampWithSurrogateAggregate().listOptTimestamp === IndexedSeq.empty[Option[org.joda.time.DateTime]])
  }
}
