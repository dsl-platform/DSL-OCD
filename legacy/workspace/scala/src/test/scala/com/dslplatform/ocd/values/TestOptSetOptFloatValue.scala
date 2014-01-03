package com.dslplatform.ocd.values

import OptSetOptFloatInValue.OptSetOptFloatValue
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestOptSetOptFloatValue extends SpecExtensions {
  def `Test property field type: Option[Set[Option[Float]]]`() =
    checkType(
      typeOf[Option[Set[Option[Float]]]]
    , typeOf[OptSetOptFloatValue].member("optSetOptFloat": TermName).asMethod.returnType
    )

  def `Test property default value: None`() {
    assert(OptSetOptFloatValue().optSetOptFloat === None)
  }
}
