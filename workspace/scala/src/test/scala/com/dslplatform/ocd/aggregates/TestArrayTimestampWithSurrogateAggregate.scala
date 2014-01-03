package com.dslplatform.ocd.aggregates

import ArrayTimestampWithSurrogateInAggregate.ArrayTimestampWithSurrogateAggregate
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestArrayTimestampWithSurrogateAggregate extends SpecExtensions {
  def `Test property field type: Array[org.joda.time.DateTime]`() =
    checkType(
      typeOf[Array[org.joda.time.DateTime]]
    , typeOf[ArrayTimestampWithSurrogateAggregate].member("arrayTimestamp": TermName).asMethod.returnType
    )

  def `Test property default value: Array.empty[org.joda.time.DateTime]`() {
    assert(ArrayTimestampWithSurrogateAggregate().arrayTimestamp === Array.empty[org.joda.time.DateTime])
  }
}
