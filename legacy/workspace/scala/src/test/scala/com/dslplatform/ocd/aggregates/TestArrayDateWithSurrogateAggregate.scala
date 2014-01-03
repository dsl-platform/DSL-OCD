package com.dslplatform.ocd.aggregates

import ArrayDateWithSurrogateInAggregate.ArrayDateWithSurrogateAggregate
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestArrayDateWithSurrogateAggregate extends SpecExtensions {
  def `Test property field type: Array[org.joda.time.LocalDate]`() =
    checkType(
      typeOf[Array[org.joda.time.LocalDate]]
    , typeOf[ArrayDateWithSurrogateAggregate].member("arrayDate": TermName).asMethod.returnType
    )

  def `Test property default value: Array.empty[org.joda.time.LocalDate]`() {
    assert(ArrayDateWithSurrogateAggregate().arrayDate === Array.empty[org.joda.time.LocalDate])
  }
}
