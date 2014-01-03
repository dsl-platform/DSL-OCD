package com.dslplatform.ocd.aggregates

import SetOptDateWithSurrogateInAggregate.SetOptDateWithSurrogateAggregate
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestSetOptDateWithSurrogateAggregate extends SpecExtensions {
  def `Test property field type: Set[Option[org.joda.time.LocalDate]]`() =
    checkType(
      typeOf[Set[Option[org.joda.time.LocalDate]]]
    , typeOf[SetOptDateWithSurrogateAggregate].member("setOptDate": TermName).asMethod.returnType
    )

  def `Test property default value: Set.empty[Option[org.joda.time.LocalDate]]`() {
    assert(SetOptDateWithSurrogateAggregate().setOptDate === Set.empty[Option[org.joda.time.LocalDate]])
  }
}
