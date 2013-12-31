package com.dslplatform.ocd.values

import OptListFloatInValue.OptListFloatValue
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestOptListFloatValue extends SpecExtensions {
  def `Test property field type: Option[IndexedSeq[Float]]`() =
    checkType(
      typeOf[Option[IndexedSeq[Float]]]
    , typeOf[OptListFloatValue].member("optListFloat": TermName).asMethod.returnType
    )

  def `Test property default value: None`() {
    assert(OptListFloatValue().optListFloat === None)
  }
}
