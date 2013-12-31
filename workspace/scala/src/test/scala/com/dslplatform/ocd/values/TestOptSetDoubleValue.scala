package com.dslplatform.ocd.values

import OptSetDoubleInValue.OptSetDoubleValue
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestOptSetDoubleValue extends SpecExtensions {
  def `Test property field type: Option[Set[Double]]`() =
    checkType(
      typeOf[Option[Set[Double]]]
    , typeOf[OptSetDoubleValue].member("optSetDouble": TermName).asMethod.returnType
    )

  def `Test property default value: None`() {
    assert(OptSetDoubleValue().optSetDouble === None)
  }
}
