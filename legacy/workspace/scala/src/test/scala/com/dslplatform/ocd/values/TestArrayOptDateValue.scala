package com.dslplatform.ocd.values

import ArrayOptDateInValue.ArrayOptDateValue
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestArrayOptDateValue extends SpecExtensions {
  def `Test property field type: Array[Option[org.joda.time.LocalDate]]`() =
    checkType(
      typeOf[Array[Option[org.joda.time.LocalDate]]]
    , typeOf[ArrayOptDateValue].member("arrayOptDate": TermName).asMethod.returnType
    )

  def `Test property default value: Array.empty[Option[org.joda.time.LocalDate]]`() {
    assert(ArrayOptDateValue().arrayOptDate === Array.empty[Option[org.joda.time.LocalDate]])
  }
}
