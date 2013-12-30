package com.dslplatform.ocd.values

import OptDoubleInValue.OptDoubleValue
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestOptDoubleValue extends SpecExtensions {
  def `Check single property type via reflection: Option[Double]`() =
    checkType(
      typeOf[Option[Double]]
    , typeOf[OptDoubleValue].member("optDouble": TermName).asMethod.returnType
    )
}
