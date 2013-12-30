package com.dslplatform.ocd.values

import OptArrayOptDoubleInValue.OptArrayOptDoubleValue
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestOptArrayOptDoubleValue extends SpecExtensions {
  def `Check single property type via reflection: Option[Array[Option[Double]]]`() =
    checkType(
      typeOf[Option[Array[Option[Double]]]]
    , typeOf[OptArrayOptDoubleValue].member("optArrayOptDouble": TermName).asMethod.returnType
    )
}
