package com.dslplatform.ocd.values

import ListOptDateInValue.ListOptDateValue
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestListOptDateValue extends SpecExtensions {
  def `Check single property type via reflection: IndexedSeq[Option[org.joda.time.LocalDate]]`() =
    checkType(
      typeOf[IndexedSeq[Option[org.joda.time.LocalDate]]]
    , typeOf[ListOptDateValue].member("listOptDate": TermName).asMethod.returnType
    )
}
