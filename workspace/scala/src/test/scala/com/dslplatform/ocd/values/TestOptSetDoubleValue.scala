package com.dslplatform.ocd.values

import OptSetDoubleInValue.OptSetDoubleValue
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestOptSetDoubleValue extends SpecExtensions {
  def `Check single property type via reflection: Option[Set[Double]]`() =
    checkType(
      typeOf[Option[Set[Double]]]
    , typeOf[OptSetDoubleValue].member("optSetDouble": TermName).asMethod.returnType
    )
}
