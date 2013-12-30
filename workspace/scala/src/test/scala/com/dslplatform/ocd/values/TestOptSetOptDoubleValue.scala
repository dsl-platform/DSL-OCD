package com.dslplatform.ocd.values

import OptSetOptDoubleInValue.OptSetOptDoubleValue
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestOptSetOptDoubleValue extends SpecExtensions {
  def `Check single property type via reflection: Option[Set[Option[Double]]]`() =
    checkType(
      typeOf[Option[Set[Option[Double]]]]
    , typeOf[OptSetOptDoubleValue].member("optSetOptDouble": TermName).asMethod.returnType
    )
}
