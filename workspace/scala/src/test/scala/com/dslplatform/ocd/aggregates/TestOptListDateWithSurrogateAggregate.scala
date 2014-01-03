package com.dslplatform.ocd.aggregates

import OptListDateWithSurrogateInAggregate.OptListDateWithSurrogateAggregate
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestOptListDateWithSurrogateAggregate extends SpecExtensions {
  def `Test property field type: Option[IndexedSeq[org.joda.time.LocalDate]]`() =
    checkType(
      typeOf[Option[IndexedSeq[org.joda.time.LocalDate]]]
    , typeOf[OptListDateWithSurrogateAggregate].member("optListDate": TermName).asMethod.returnType
    )

  def `Test property default value: None`() {
    assert(OptListDateWithSurrogateAggregate().optListDate === None)
  }
}
