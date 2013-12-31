package com.dslplatform.ocd.values

import OptArrayDoubleInValue.OptArrayDoubleValue
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestOptArrayDoubleValue extends SpecExtensions {
  def `Test property field type: Option[Array[Double]]`() =
    checkType(
      typeOf[Option[Array[Double]]]
    , typeOf[OptArrayDoubleValue].member("optArrayDouble": TermName).asMethod.returnType
    )

  def `Test property default value: None`() {
    assert(OptArrayDoubleValue().optArrayDouble === None)
  }
}
