package com.dslplatform.ocd.values

import OptArrayBoolInValue.OptArrayBoolValue
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestOptArrayBoolValue extends SpecExtensions {
  def `Test property field type: Option[Array[Boolean]]`() =
    checkType(
      typeOf[Option[Array[Boolean]]]
    , typeOf[OptArrayBoolValue].member("optArrayBool": TermName).asMethod.returnType
    )

  def `Test property default value: None`() {
    assert(OptArrayBoolValue().optArrayBool === None)
  }
}
