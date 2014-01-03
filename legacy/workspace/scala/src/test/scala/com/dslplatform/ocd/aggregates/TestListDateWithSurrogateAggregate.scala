package com.dslplatform.ocd.aggregates

import ListDateWithSurrogateInAggregate.ListDateWithSurrogateAggregate
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestListDateWithSurrogateAggregate extends SpecExtensions {
  def `Test property field type: IndexedSeq[org.joda.time.LocalDate]`() =
    checkType(
      typeOf[IndexedSeq[org.joda.time.LocalDate]]
    , typeOf[ListDateWithSurrogateAggregate].member("listDate": TermName).asMethod.returnType
    )

  def `Test property default value: IndexedSeq.empty[org.joda.time.LocalDate]`() {
    assert(ListDateWithSurrogateAggregate().listDate === IndexedSeq.empty[org.joda.time.LocalDate])
  }
}
