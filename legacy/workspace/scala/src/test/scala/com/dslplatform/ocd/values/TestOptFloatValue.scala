package com.dslplatform.ocd.values

import OptFloatInValue.OptFloatValue
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestOptFloatValue extends SpecExtensions {
  def `Test property field type: Option[Float]`() =
    checkType(
      typeOf[Option[Float]]
    , typeOf[OptFloatValue].member("optFloat": TermName).asMethod.returnType
    )

  def `Test property default value: None`() {
    assert(OptFloatValue().optFloat === None)
  }
}
