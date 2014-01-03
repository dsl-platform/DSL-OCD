package com.dslplatform.ocd.values

import SetDateInValue.SetDateValue
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestSetDateValue extends SpecExtensions {
  def `Test property field type: Set[org.joda.time.LocalDate]`() =
    checkType(
      typeOf[Set[org.joda.time.LocalDate]]
    , typeOf[SetDateValue].member("setDate": TermName).asMethod.returnType
    )

  def `Test property default value: Set.empty[org.joda.time.LocalDate]`() {
    assert(SetDateValue().setDate === Set.empty[org.joda.time.LocalDate])
  }
}
