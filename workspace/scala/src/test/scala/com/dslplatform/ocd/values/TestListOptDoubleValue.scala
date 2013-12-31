package com.dslplatform.ocd.values

import ListOptDoubleInValue.ListOptDoubleValue
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestListOptDoubleValue extends SpecExtensions {
  def `Test property field type: IndexedSeq[Option[Double]]`() =
    checkType(
      typeOf[IndexedSeq[Option[Double]]]
    , typeOf[ListOptDoubleValue].member("listOptDouble": TermName).asMethod.returnType
    )

  def `Test property default value: IndexedSeq.empty[Option[Double]]`() {
    assert(ListOptDoubleValue().listOptDouble === IndexedSeq.empty[Option[Double]])
  }
}
