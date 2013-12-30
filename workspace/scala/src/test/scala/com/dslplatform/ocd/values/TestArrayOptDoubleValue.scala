package com.dslplatform.ocd.values

import ArrayOptDoubleInValue.ArrayOptDoubleValue
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestArrayOptDoubleValue extends SpecExtensions {
  def `Check single property type via reflection: Array[Option[Double]]`() =
    checkType(
      typeOf[Array[Option[Double]]]
    , typeOf[ArrayOptDoubleValue].member("arrayOptDouble": TermName).asMethod.returnType
    )
}
