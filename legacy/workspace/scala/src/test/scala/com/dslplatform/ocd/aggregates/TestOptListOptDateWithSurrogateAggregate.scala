package com.dslplatform.ocd.aggregates

import OptListOptDateWithSurrogateInAggregate.OptListOptDateWithSurrogateAggregate
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestOptListOptDateWithSurrogateAggregate extends SpecExtensions {
  def `Test property field type: Option[IndexedSeq[Option[org.joda.time.LocalDate]]]`() =
    checkType(
      typeOf[Option[IndexedSeq[Option[org.joda.time.LocalDate]]]]
    , typeOf[OptListOptDateWithSurrogateAggregate].member("optListOptDate": TermName).asMethod.returnType
    )

  def `Test property default value: None`() {
    assert(OptListOptDateWithSurrogateAggregate().optListOptDate === None)
  }
}
