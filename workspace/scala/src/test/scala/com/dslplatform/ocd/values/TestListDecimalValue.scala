package com.dslplatform.ocd.values

import ListDecimalInValue.ListDecimalValue
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestListDecimalValue extends SpecExtensions {
  def `Test property field type: IndexedSeq[BigDecimal]`() =
    checkType(
      typeOf[IndexedSeq[BigDecimal]]
    , typeOf[ListDecimalValue].member("listDecimal": TermName).asMethod.returnType
    )

  def `Test property default value: IndexedSeq.empty[BigDecimal]`() {
    assert(ListDecimalValue().listDecimal === IndexedSeq.empty[BigDecimal])
  }
}
