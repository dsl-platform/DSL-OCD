package com.dslplatform.ocd.values

import OptSetOptDateInValue.OptSetOptDateValue
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestOptSetOptDateValue extends SpecExtensions {
  def `Check single property type via reflection: Option[Set[Option[org.joda.time.LocalDate]]]`() =
    checkType(
      typeOf[Option[Set[Option[org.joda.time.LocalDate]]]]
    , typeOf[OptSetOptDateValue].member("optSetOptDate": TermName).asMethod.returnType
    )
}
