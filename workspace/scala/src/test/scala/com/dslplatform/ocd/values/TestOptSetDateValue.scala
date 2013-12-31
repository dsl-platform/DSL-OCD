package com.dslplatform.ocd.values

import OptSetDateInValue.OptSetDateValue
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestOptSetDateValue extends SpecExtensions {
  def `Test property field type: Option[Set[org.joda.time.LocalDate]]`() =
    checkType(
      typeOf[Option[Set[org.joda.time.LocalDate]]]
    , typeOf[OptSetDateValue].member("optSetDate": TermName).asMethod.returnType
    )

  def `Test property default value: None`() {
    assert(OptSetDateValue().optSetDate === None)
  }
}
