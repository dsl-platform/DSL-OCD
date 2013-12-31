package com.dslplatform.ocd.values

import ArrayDateInValue.ArrayDateValue
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestArrayDateValue extends SpecExtensions {
  def `Test property field type: Array[org.joda.time.LocalDate]`() =
    checkType(
      typeOf[Array[org.joda.time.LocalDate]]
    , typeOf[ArrayDateValue].member("arrayDate": TermName).asMethod.returnType
    )

  def `Test property default value: Array.empty[org.joda.time.LocalDate]`() {
    assert(ArrayDateValue().arrayDate === Array.empty[org.joda.time.LocalDate])
  }
}
