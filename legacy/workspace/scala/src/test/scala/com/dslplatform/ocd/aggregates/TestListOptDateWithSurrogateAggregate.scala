package com.dslplatform.ocd.aggregates

import ListOptDateWithSurrogateInAggregate.ListOptDateWithSurrogateAggregate
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestListOptDateWithSurrogateAggregate extends SpecExtensions {
  def `Test property field type: IndexedSeq[Option[org.joda.time.LocalDate]]`() =
    checkType(
      typeOf[IndexedSeq[Option[org.joda.time.LocalDate]]]
    , typeOf[ListOptDateWithSurrogateAggregate].member("listOptDate": TermName).asMethod.returnType
    )

  def `Test property default value: IndexedSeq.empty[Option[org.joda.time.LocalDate]]`() {
    assert(ListOptDateWithSurrogateAggregate().listOptDate === IndexedSeq.empty[Option[org.joda.time.LocalDate]])
  }
}
