package com.dslplatform.ocd.aggregates

import OptArrayTimestampWithSurrogateInAggregate.OptArrayTimestampWithSurrogateAggregate
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestOptArrayTimestampWithSurrogateAggregate extends SpecExtensions {
  def `Test property field type: Option[Array[org.joda.time.DateTime]]`() =
    checkType(
      typeOf[Option[Array[org.joda.time.DateTime]]]
    , typeOf[OptArrayTimestampWithSurrogateAggregate].member("optArrayTimestamp": TermName).asMethod.returnType
    )

  def `Test property default value: None`() {
    assert(OptArrayTimestampWithSurrogateAggregate().optArrayTimestamp === None)
  }
}
