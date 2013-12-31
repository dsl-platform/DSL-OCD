package com.dslplatform.ocd.values

import ListOptDateInValue.ListOptDateValue
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestListOptDateValue extends SpecExtensions {
  def `Test property field type: IndexedSeq[Option[org.joda.time.LocalDate]]`() =
    checkType(
      typeOf[IndexedSeq[Option[org.joda.time.LocalDate]]]
    , typeOf[ListOptDateValue].member("listOptDate": TermName).asMethod.returnType
    )

  def `Test property default value: IndexedSeq.empty[Option[org.joda.time.LocalDate]]`() {
    assert(ListOptDateValue().listOptDate === IndexedSeq.empty[Option[org.joda.time.LocalDate]])
  }
}
