package com.dslplatform.ocd.values

import OptListOptDateInValue.OptListOptDateValue
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestOptListOptDateValue extends SpecExtensions {
  def `Test property field type: Option[IndexedSeq[Option[org.joda.time.LocalDate]]]`() =
    checkType(
      typeOf[Option[IndexedSeq[Option[org.joda.time.LocalDate]]]]
    , typeOf[OptListOptDateValue].member("optListOptDate": TermName).asMethod.returnType
    )

  def `Test property default value: None`() {
    assert(OptListOptDateValue().optListOptDate === None)
  }
}
