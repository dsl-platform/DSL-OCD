package com.dslplatform.ocd.values

import ArrayOptDecimalInValue.ArrayOptDecimalValue
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestArrayOptDecimalValue extends SpecExtensions {
  def `Check single property type via reflection: Array[Option[BigDecimal]]`() =
    checkType(
      typeOf[Array[Option[BigDecimal]]]
    , typeOf[ArrayOptDecimalValue].member("arrayOptDecimal": TermName).asMethod.returnType
    )
}
