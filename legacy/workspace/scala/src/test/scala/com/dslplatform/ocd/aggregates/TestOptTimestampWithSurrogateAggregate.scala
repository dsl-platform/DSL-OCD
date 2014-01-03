package com.dslplatform.ocd.aggregates

import OptTimestampWithSurrogateInAggregate.OptTimestampWithSurrogateAggregate
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestOptTimestampWithSurrogateAggregate extends SpecExtensions {
  def `Test property field type: Option[org.joda.time.DateTime]`() =
    checkType(
      typeOf[Option[org.joda.time.DateTime]]
    , typeOf[OptTimestampWithSurrogateAggregate].member("optTimestamp": TermName).asMethod.returnType
    )

  def `Test property default value: None`() {
    assert(OptTimestampWithSurrogateAggregate().optTimestamp === None)
  }
}
