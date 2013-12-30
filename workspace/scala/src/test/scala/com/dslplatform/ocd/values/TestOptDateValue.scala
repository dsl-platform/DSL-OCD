package com.dslplatform.ocd.values

import OptDateInValue.OptDateValue
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestOptDateValue extends SpecExtensions {
  def `Check single property type via reflection: Option[org.joda.time.LocalDate]`() =
    checkType(
      typeOf[Option[org.joda.time.LocalDate]]
    , typeOf[OptDateValue].member("optDate": TermName).asMethod.returnType
    )
}
