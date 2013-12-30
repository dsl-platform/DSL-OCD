package com.dslplatform.ocd.values

import OptListDecimalInValue.OptListDecimalValue
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestOptListDecimalValue extends SpecExtensions {
  def `Check single property type via reflection: Option[IndexedSeq[BigDecimal]]`() =
    checkType(
      typeOf[Option[IndexedSeq[BigDecimal]]]
    , typeOf[OptListDecimalValue].member("optListDecimal": TermName).asMethod.returnType
    )
}
