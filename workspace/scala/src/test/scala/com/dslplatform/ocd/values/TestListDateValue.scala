package com.dslplatform.ocd.values

import ListDateInValue.ListDateValue
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestListDateValue extends SpecExtensions {
  def `Check single property type via reflection: IndexedSeq[org.joda.time.LocalDate]`() =
    checkType(
      typeOf[IndexedSeq[org.joda.time.LocalDate]]
    , typeOf[ListDateValue].member("listDate": TermName).asMethod.returnType
    )
}
