package com.dslplatform.ocd.values

import OneDateInValue.OneDateValue
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestOneDateValue extends SpecExtensions {
  def `Test property field type: org.joda.time.LocalDate`() =
    checkType(
      typeOf[org.joda.time.LocalDate]
    , typeOf[OneDateValue].member("oneDate": TermName).asMethod.returnType
    )

  def `Test property default value: org.joda.time.LocalDate.now`() {
    assert(OneDateValue().oneDate === org.joda.time.LocalDate.now)
  }
}
