package com.dslplatform.ocd.aggregates

import SetOptDateInAggregate.SetOptDateAggregate
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestSetOptDateAggregate extends SpecExtensions {
  def `Test property field type: Set[Option[org.joda.time.LocalDate]]`() =
    checkType(
      typeOf[Set[Option[org.joda.time.LocalDate]]]
    , typeOf[SetOptDateAggregate].member("setOptDate": TermName).asMethod.returnType
    )

  def `Test property default value: Set.empty[Option[org.joda.time.LocalDate]]`() {
    assert(SetOptDateAggregate().setOptDate === Set.empty[Option[org.joda.time.LocalDate]])
  }
}
