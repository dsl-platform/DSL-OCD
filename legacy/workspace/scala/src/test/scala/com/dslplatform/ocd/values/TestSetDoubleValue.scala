package com.dslplatform.ocd.values

import SetDoubleInValue.SetDoubleValue
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestSetDoubleValue extends SpecExtensions {
  def `Test property field type: Set[Double]`() =
    checkType(
      typeOf[Set[Double]]
    , typeOf[SetDoubleValue].member("setDouble": TermName).asMethod.returnType
    )

  def `Test property default value: Set.empty[Double]`() {
    assert(SetDoubleValue().setDouble === Set.empty[Double])
  }
}
