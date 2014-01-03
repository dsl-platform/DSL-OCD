package com.dslplatform.ocd.aggregates

import ArrayOptTimestampWithSurrogateInAggregate.ArrayOptTimestampWithSurrogateAggregate
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestArrayOptTimestampWithSurrogateAggregate extends SpecExtensions {
  def `Test property field type: Array[Option[org.joda.time.DateTime]]`() =
    checkType(
      typeOf[Array[Option[org.joda.time.DateTime]]]
    , typeOf[ArrayOptTimestampWithSurrogateAggregate].member("arrayOptTimestamp": TermName).asMethod.returnType
    )

  def `Test property default value: Array.empty[Option[org.joda.time.DateTime]]`() {
    assert(ArrayOptTimestampWithSurrogateAggregate().arrayOptTimestamp === Array.empty[Option[org.joda.time.DateTime]])
  }
}
