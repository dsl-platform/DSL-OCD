package com.dslplatform.ocd.values

import ListDoubleInValue.ListDoubleValue
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestListDoubleValue extends SpecExtensions {
  def `Test property field type: IndexedSeq[Double]`() =
    checkType(
      typeOf[IndexedSeq[Double]]
    , typeOf[ListDoubleValue].member("listDouble": TermName).asMethod.returnType
    )

  def `Test property default value: IndexedSeq.empty[Double]`() {
    assert(ListDoubleValue().listDouble === IndexedSeq.empty[Double])
  }
}
