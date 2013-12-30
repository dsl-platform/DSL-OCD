package com.dslplatform.ocd.values

import OptListOptDecimalInValue.OptListOptDecimalValue
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestOptListOptDecimalValue extends SpecExtensions {
  def `Check single property type via reflection: Option[IndexedSeq[Option[BigDecimal]]]`() =
    checkType(
      typeOf[Option[IndexedSeq[Option[BigDecimal]]]]
    , typeOf[OptListOptDecimalValue].member("optListOptDecimal": TermName).asMethod.returnType
    )
}
