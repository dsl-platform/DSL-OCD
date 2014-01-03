package com.dslplatform.ocd.values

import OneBoolInValue.OneBoolValue
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestOneBoolValue extends SpecExtensions {
  def `Test property field type: Boolean`() =
    checkType(
      typeOf[Boolean]
    , typeOf[OneBoolValue].member("oneBool": TermName).asMethod.returnType
    )

  def `Test property default value: false`() {
    assert(OneBoolValue().oneBool === false)
  }
}
