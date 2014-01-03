package com.dslplatform.ocd.aggregates

import OptSetTimestampWithSurrogateInAggregate.OptSetTimestampWithSurrogateAggregate
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestOptSetTimestampWithSurrogateAggregate extends SpecExtensions {
  def `Test property field type: Option[Set[org.joda.time.DateTime]]`() =
    checkType(
      typeOf[Option[Set[org.joda.time.DateTime]]]
    , typeOf[OptSetTimestampWithSurrogateAggregate].member("optSetTimestamp": TermName).asMethod.returnType
    )

  def `Test property default value: None`() {
    assert(OptSetTimestampWithSurrogateAggregate().optSetTimestamp === None)
  }
}
