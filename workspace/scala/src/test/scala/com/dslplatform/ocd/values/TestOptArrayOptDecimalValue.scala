package com.dslplatform.ocd.values

import OptArrayOptDecimalInValue.OptArrayOptDecimalValue
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestOptArrayOptDecimalValue extends SpecExtensions {
  def `Check single property type via reflection: Option[Array[Option[BigDecimal]]]`() =
    checkType(
      typeOf[Option[Array[Option[BigDecimal]]]]
    , typeOf[OptArrayOptDecimalValue].member("optArrayOptDecimal": TermName).asMethod.returnType
    )
}
