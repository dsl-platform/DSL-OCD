package com.dslplatform.ocd.values

import ListDateInValue.ListDateValue
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestListDateValue extends SpecExtensions {
  def `Test property field type: IndexedSeq[org.joda.time.LocalDate]`() =
    checkType(
      typeOf[IndexedSeq[org.joda.time.LocalDate]]
    , typeOf[ListDateValue].member("listDate": TermName).asMethod.returnType
    )

  def `Test property default value: IndexedSeq.empty[org.joda.time.LocalDate]`() {
    assert(ListDateValue().listDate === IndexedSeq.empty[org.joda.time.LocalDate])
  }
}
