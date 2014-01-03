package com.dslplatform.ocd.values

import OptArrayDateInValue.OptArrayDateValue
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestOptArrayDateValue extends SpecExtensions {
  def `Test property field type: Option[Array[org.joda.time.LocalDate]]`() =
    checkType(
      typeOf[Option[Array[org.joda.time.LocalDate]]]
    , typeOf[OptArrayDateValue].member("optArrayDate": TermName).asMethod.returnType
    )

  def `Test property default value: None`() {
    assert(OptArrayDateValue().optArrayDate === None)
  }
}
