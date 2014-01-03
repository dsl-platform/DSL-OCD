package com.dslplatform.ocd.values

import OptListOptFloatInValue.OptListOptFloatValue
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestOptListOptFloatValue extends SpecExtensions {
  def `Test property field type: Option[IndexedSeq[Option[Float]]]`() =
    checkType(
      typeOf[Option[IndexedSeq[Option[Float]]]]
    , typeOf[OptListOptFloatValue].member("optListOptFloat": TermName).asMethod.returnType
    )

  def `Test property default value: None`() {
    assert(OptListOptFloatValue().optListOptFloat === None)
  }
}
