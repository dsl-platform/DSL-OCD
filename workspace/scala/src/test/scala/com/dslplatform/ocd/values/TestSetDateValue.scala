package com.dslplatform.ocd.values

import SetDateInValue.SetDateValue
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestSetDateValue extends SpecExtensions {
  def `Check single property type via reflection: Set[org.joda.time.LocalDate]`() =
    checkType(
      typeOf[Set[org.joda.time.LocalDate]]
    , typeOf[SetDateValue].member("setDate": TermName).asMethod.returnType
    )
}
