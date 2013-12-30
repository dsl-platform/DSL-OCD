package com.dslplatform.ocd.values

import ListDecimalInValue.ListDecimalValue
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestListDecimalValue extends SpecExtensions {
  def `Check single property type via reflection: IndexedSeq[BigDecimal]`() =
    checkType(
      typeOf[IndexedSeq[BigDecimal]]
    , typeOf[ListDecimalValue].member("listDecimal": TermName).asMethod.returnType
    )
}
