package com.dslplatform.ocd.aggregates

import ArrayOptDateInAggregate.ArrayOptDateAggregate
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestArrayOptDateAggregate extends SpecExtensions {
  def `Test property field type: Array[Option[org.joda.time.LocalDate]]`() =
    checkType(
      typeOf[Array[Option[org.joda.time.LocalDate]]]
    , typeOf[ArrayOptDateAggregate].member("arrayOptDate": TermName).asMethod.returnType
    )

  def `Test property default value: Array.empty[Option[org.joda.time.LocalDate]]`() {
    assert(ArrayOptDateAggregate().arrayOptDate === Array.empty[Option[org.joda.time.LocalDate]])
  }
}
