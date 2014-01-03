package com.dslplatform.ocd.aggregates

import OptListTimestampWithSurrogateInAggregate.OptListTimestampWithSurrogateAggregate
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestOptListTimestampWithSurrogateAggregate extends SpecExtensions {
  def `Test property field type: Option[IndexedSeq[org.joda.time.DateTime]]`() =
    checkType(
      typeOf[Option[IndexedSeq[org.joda.time.DateTime]]]
    , typeOf[OptListTimestampWithSurrogateAggregate].member("optListTimestamp": TermName).asMethod.returnType
    )

  def `Test property default value: None`() {
    assert(OptListTimestampWithSurrogateAggregate().optListTimestamp === None)
  }
}
