package com.dslplatform.ocd.values

import OptListDateInValue.OptListDateValue
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestOptListDateValue extends SpecExtensions {
  def `Check single property type via reflection: Option[IndexedSeq[org.joda.time.LocalDate]]`() =
    checkType(
      typeOf[Option[IndexedSeq[org.joda.time.LocalDate]]]
    , typeOf[OptListDateValue].member("optListDate": TermName).asMethod.returnType
    )
}
