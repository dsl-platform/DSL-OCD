package com.dslplatform.ocd.aggregates

import ListOptDateInAggregate.ListOptDateAggregate
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestListOptDateAggregate extends SpecExtensions {
  def `Test property field type: IndexedSeq[Option[org.joda.time.LocalDate]]`() =
    checkType(
      typeOf[IndexedSeq[Option[org.joda.time.LocalDate]]]
    , typeOf[ListOptDateAggregate].member("listOptDate": TermName).asMethod.returnType
    )

  def `Test property default value: IndexedSeq.empty[Option[org.joda.time.LocalDate]]`() {
    assert(ListOptDateAggregate().listOptDate === IndexedSeq.empty[Option[org.joda.time.LocalDate]])
  }
}
