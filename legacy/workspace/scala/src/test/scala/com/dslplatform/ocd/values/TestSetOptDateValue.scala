package com.dslplatform.ocd.values

import SetOptDateInValue.SetOptDateValue
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestSetOptDateValue extends SpecExtensions {
  def `Test property field type: Set[Option[org.joda.time.LocalDate]]`() =
    checkType(
      typeOf[Set[Option[org.joda.time.LocalDate]]]
    , typeOf[SetOptDateValue].member("setOptDate": TermName).asMethod.returnType
    )

  def `Test property default value: Set.empty[Option[org.joda.time.LocalDate]]`() {
    assert(SetOptDateValue().setOptDate === Set.empty[Option[org.joda.time.LocalDate]])
  }
}
