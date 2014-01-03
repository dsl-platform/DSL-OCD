package com.dslplatform.ocd.values

import OptArrayOptDateInValue.OptArrayOptDateValue
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestOptArrayOptDateValue extends SpecExtensions {
  def `Test property field type: Option[Array[Option[org.joda.time.LocalDate]]]`() =
    checkType(
      typeOf[Option[Array[Option[org.joda.time.LocalDate]]]]
    , typeOf[OptArrayOptDateValue].member("optArrayOptDate": TermName).asMethod.returnType
    )

  def `Test property default value: None`() {
    assert(OptArrayOptDateValue().optArrayOptDate === None)
  }
}
