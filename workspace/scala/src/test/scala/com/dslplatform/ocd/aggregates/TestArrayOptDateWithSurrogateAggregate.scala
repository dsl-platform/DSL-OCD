package com.dslplatform.ocd.aggregates

import ArrayOptDateWithSurrogateInAggregate.ArrayOptDateWithSurrogateAggregate
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestArrayOptDateWithSurrogateAggregate extends SpecExtensions {
  def `Test property field type: Array[Option[org.joda.time.LocalDate]]`() =
    checkType(
      typeOf[Array[Option[org.joda.time.LocalDate]]]
    , typeOf[ArrayOptDateWithSurrogateAggregate].member("arrayOptDate": TermName).asMethod.returnType
    )

  def `Test property default value: Array.empty[Option[org.joda.time.LocalDate]]`() {
    assert(ArrayOptDateWithSurrogateAggregate().arrayOptDate === Array.empty[Option[org.joda.time.LocalDate]])
  }
}
