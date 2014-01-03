package com.dslplatform.ocd.aggregates

import SetTimestampWithSurrogateInAggregate.SetTimestampWithSurrogateAggregate
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestSetTimestampWithSurrogateAggregate extends SpecExtensions {
  def `Test property field type: Set[org.joda.time.DateTime]`() =
    checkType(
      typeOf[Set[org.joda.time.DateTime]]
    , typeOf[SetTimestampWithSurrogateAggregate].member("setTimestamp": TermName).asMethod.returnType
    )

  def `Test property default value: Set.empty[org.joda.time.DateTime]`() {
    assert(SetTimestampWithSurrogateAggregate().setTimestamp === Set.empty[org.joda.time.DateTime])
  }
}
