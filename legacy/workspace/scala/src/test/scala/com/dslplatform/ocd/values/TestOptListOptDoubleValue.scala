package com.dslplatform.ocd.values

import OptListOptDoubleInValue.OptListOptDoubleValue
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestOptListOptDoubleValue extends SpecExtensions {
  def `Test property field type: Option[IndexedSeq[Option[Double]]]`() =
    checkType(
      typeOf[Option[IndexedSeq[Option[Double]]]]
    , typeOf[OptListOptDoubleValue].member("optListOptDouble": TermName).asMethod.returnType
    )

  def `Test property default value: None`() {
    assert(OptListOptDoubleValue().optListOptDouble === None)
  }
}
