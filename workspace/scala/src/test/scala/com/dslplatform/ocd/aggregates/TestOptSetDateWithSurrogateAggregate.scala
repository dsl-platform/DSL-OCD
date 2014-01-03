package com.dslplatform.ocd.aggregates

import OptSetDateWithSurrogateInAggregate.OptSetDateWithSurrogateAggregate
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestOptSetDateWithSurrogateAggregate extends SpecExtensions {
  def `Test property field type: Option[Set[org.joda.time.LocalDate]]`() =
    checkType(
      typeOf[Option[Set[org.joda.time.LocalDate]]]
    , typeOf[OptSetDateWithSurrogateAggregate].member("optSetDate": TermName).asMethod.returnType
    )

  def `Test property default value: None`() {
    assert(OptSetDateWithSurrogateAggregate().optSetDate === None)
  }
}
