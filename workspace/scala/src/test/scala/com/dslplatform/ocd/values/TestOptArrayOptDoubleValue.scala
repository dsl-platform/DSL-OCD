package com.dslplatform.ocd.values

import OptArrayOptDoubleInValue.OptArrayOptDoubleValue
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestOptArrayOptDoubleValue extends SpecExtensions {
  def `Test property field type: Option[Array[Option[Double]]]`() =
    checkType(
      typeOf[Option[Array[Option[Double]]]]
    , typeOf[OptArrayOptDoubleValue].member("optArrayOptDouble": TermName).asMethod.returnType
    )

  def `Test property default value: None`() {
    assert(OptArrayOptDoubleValue().optArrayOptDouble === None)
  }
}
