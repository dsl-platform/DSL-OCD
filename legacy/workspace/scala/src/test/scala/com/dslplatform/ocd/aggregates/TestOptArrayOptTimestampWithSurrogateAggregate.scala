package com.dslplatform.ocd.aggregates

import OptArrayOptTimestampWithSurrogateInAggregate.OptArrayOptTimestampWithSurrogateAggregate
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestOptArrayOptTimestampWithSurrogateAggregate extends SpecExtensions {
  def `Test property field type: Option[Array[Option[org.joda.time.DateTime]]]`() =
    checkType(
      typeOf[Option[Array[Option[org.joda.time.DateTime]]]]
    , typeOf[OptArrayOptTimestampWithSurrogateAggregate].member("optArrayOptTimestamp": TermName).asMethod.returnType
    )

  def `Test property default value: None`() {
    assert(OptArrayOptTimestampWithSurrogateAggregate().optArrayOptTimestamp === None)
  }
}
