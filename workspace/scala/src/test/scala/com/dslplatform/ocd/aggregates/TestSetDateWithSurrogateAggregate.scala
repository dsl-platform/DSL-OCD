package com.dslplatform.ocd.aggregates

import SetDateWithSurrogateInAggregate.SetDateWithSurrogateAggregate
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestSetDateWithSurrogateAggregate extends SpecExtensions {
  def `Test property field type: Set[org.joda.time.LocalDate]`() =
    checkType(
      typeOf[Set[org.joda.time.LocalDate]]
    , typeOf[SetDateWithSurrogateAggregate].member("setDate": TermName).asMethod.returnType
    )

  def `Test property default value: Set.empty[org.joda.time.LocalDate]`() {
    assert(SetDateWithSurrogateAggregate().setDate === Set.empty[org.joda.time.LocalDate])
  }
}
