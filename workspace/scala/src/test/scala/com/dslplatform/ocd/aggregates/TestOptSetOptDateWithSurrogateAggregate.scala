package com.dslplatform.ocd.aggregates

import OptSetOptDateWithSurrogateInAggregate.OptSetOptDateWithSurrogateAggregate
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestOptSetOptDateWithSurrogateAggregate extends SpecExtensions {
  def `Test property field type: Option[Set[Option[org.joda.time.LocalDate]]]`() =
    checkType(
      typeOf[Option[Set[Option[org.joda.time.LocalDate]]]]
    , typeOf[OptSetOptDateWithSurrogateAggregate].member("optSetOptDate": TermName).asMethod.returnType
    )

  def `Test property default value: None`() {
    assert(OptSetOptDateWithSurrogateAggregate().optSetOptDate === None)
  }
}
