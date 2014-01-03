package com.dslplatform.ocd.aggregates

import ArrayTimestampInAggregate.ArrayTimestampAggregate
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestArrayTimestampAggregate extends SpecExtensions {
  def `Test property field type: Array[org.joda.time.DateTime]`() =
    checkType(
      typeOf[Array[org.joda.time.DateTime]]
    , typeOf[ArrayTimestampAggregate].member("arrayTimestamp": TermName).asMethod.returnType
    )

  def `Test property default value: Array.empty[org.joda.time.DateTime]`() {
    assert(ArrayTimestampAggregate().arrayTimestamp === Array.empty[org.joda.time.DateTime])
  }
}
