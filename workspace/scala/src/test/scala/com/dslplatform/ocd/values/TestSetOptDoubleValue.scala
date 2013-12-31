package com.dslplatform.ocd.values

import SetOptDoubleInValue.SetOptDoubleValue
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestSetOptDoubleValue extends SpecExtensions {
  def `Test property field type: Set[Option[Double]]`() =
    checkType(
      typeOf[Set[Option[Double]]]
    , typeOf[SetOptDoubleValue].member("setOptDouble": TermName).asMethod.returnType
    )

  def `Test property default value: Set.empty[Option[Double]]`() {
    assert(SetOptDoubleValue().setOptDouble === Set.empty[Option[Double]])
  }
}
