package com.dslplatform.ocd.values

import OptBoolInValue.OptBoolValue
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestOptBoolValue extends SpecExtensions {
  def `Test property field type: Option[Boolean]`() =
    checkType(
      typeOf[Option[Boolean]]
    , typeOf[OptBoolValue].member("optBool": TermName).asMethod.returnType
    )

  def `Test property default value: None`() {
    assert(OptBoolValue().optBool === None)
  }
}
