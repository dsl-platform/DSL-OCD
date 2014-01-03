package com.dslplatform.ocd.aggregates

import OptSetOptTimestampWithSurrogateInAggregate.OptSetOptTimestampWithSurrogateAggregate
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestOptSetOptTimestampWithSurrogateAggregate extends SpecExtensions {
  def `Test property field type: Option[Set[Option[org.joda.time.DateTime]]]`() =
    checkType(
      typeOf[Option[Set[Option[org.joda.time.DateTime]]]]
    , typeOf[OptSetOptTimestampWithSurrogateAggregate].member("optSetOptTimestamp": TermName).asMethod.returnType
    )

  def `Test property default value: None`() {
    assert(OptSetOptTimestampWithSurrogateAggregate().optSetOptTimestamp === None)
  }
}
