package com.dslplatform.ocd.values

import SetOptDateInValue.SetOptDateValue
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestSetOptDateValue extends SpecExtensions {
  def `Check single property type via reflection: Set[Option[org.joda.time.LocalDate]]`() =
    checkType(
      typeOf[Set[Option[org.joda.time.LocalDate]]]
    , typeOf[SetOptDateValue].member("setOptDate": TermName).asMethod.returnType
    )
}
