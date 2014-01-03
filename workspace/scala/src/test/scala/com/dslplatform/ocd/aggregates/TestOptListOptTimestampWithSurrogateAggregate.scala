package com.dslplatform.ocd.aggregates

import OptListOptTimestampWithSurrogateInAggregate.OptListOptTimestampWithSurrogateAggregate
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestOptListOptTimestampWithSurrogateAggregate extends SpecExtensions {
  def `Test property field type: Option[IndexedSeq[Option[org.joda.time.DateTime]]]`() =
    checkType(
      typeOf[Option[IndexedSeq[Option[org.joda.time.DateTime]]]]
    , typeOf[OptListOptTimestampWithSurrogateAggregate].member("optListOptTimestamp": TermName).asMethod.returnType
    )

  def `Test property default value: None`() {
    assert(OptListOptTimestampWithSurrogateAggregate().optListOptTimestamp === None)
  }
}
