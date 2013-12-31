package com.dslplatform.ocd.values

import OptSetFloatInValue.OptSetFloatValue
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestOptSetFloatValue extends SpecExtensions {
  def `Test property field type: Option[Set[Float]]`() =
    checkType(
      typeOf[Option[Set[Float]]]
    , typeOf[OptSetFloatValue].member("optSetFloat": TermName).asMethod.returnType
    )

  def `Test property default value: None`() {
    assert(OptSetFloatValue().optSetFloat === None)
  }
}
