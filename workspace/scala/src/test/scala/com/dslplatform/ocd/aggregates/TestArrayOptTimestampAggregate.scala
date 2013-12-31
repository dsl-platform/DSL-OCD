package com.dslplatform.ocd.aggregates

import ArrayOptTimestampInAggregate.ArrayOptTimestampAggregate
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestArrayOptTimestampAggregate extends SpecExtensions {
  def `Test property field type: Array[Option[org.joda.time.DateTime]]`() =
    checkType(
      typeOf[Array[Option[org.joda.time.DateTime]]]
    , typeOf[ArrayOptTimestampAggregate].member("arrayOptTimestamp": TermName).asMethod.returnType
    )

  def `Test property default value: Array.empty[Option[org.joda.time.DateTime]]`() {
    assert(ArrayOptTimestampAggregate().arrayOptTimestamp === Array.empty[Option[org.joda.time.DateTime]])
  }
}
