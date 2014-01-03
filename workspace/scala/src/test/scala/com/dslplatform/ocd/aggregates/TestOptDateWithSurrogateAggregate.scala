package com.dslplatform.ocd.aggregates

import OptDateWithSurrogateInAggregate.OptDateWithSurrogateAggregate
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestOptDateWithSurrogateAggregate extends SpecExtensions {
  def `Test property field type: Option[org.joda.time.LocalDate]`() =
    checkType(
      typeOf[Option[org.joda.time.LocalDate]]
    , typeOf[OptDateWithSurrogateAggregate].member("optDate": TermName).asMethod.returnType
    )

  def `Test property default value: None`() {
    assert(OptDateWithSurrogateAggregate().optDate === None)
  }
}
