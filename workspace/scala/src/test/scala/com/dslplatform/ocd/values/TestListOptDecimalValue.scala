package com.dslplatform.ocd.values

import ListOptDecimalInValue.ListOptDecimalValue
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestListOptDecimalValue extends SpecExtensions {
  def `Check single property type via reflection: IndexedSeq[Option[BigDecimal]]`() =
    checkType(
      typeOf[IndexedSeq[Option[BigDecimal]]]
    , typeOf[ListOptDecimalValue].member("listOptDecimal": TermName).asMethod.returnType
    )
}
