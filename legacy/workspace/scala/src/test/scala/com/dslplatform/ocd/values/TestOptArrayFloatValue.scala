package com.dslplatform.ocd.values

import OptArrayFloatInValue.OptArrayFloatValue
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestOptArrayFloatValue extends SpecExtensions {
  def `Test property field type: Option[Array[Float]]`() =
    checkType(
      typeOf[Option[Array[Float]]]
    , typeOf[OptArrayFloatValue].member("optArrayFloat": TermName).asMethod.returnType
    )

  def `Test property default value: None`() {
    assert(OptArrayFloatValue().optArrayFloat === None)
  }
}
