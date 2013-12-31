package com.dslplatform.ocd.values

import SetBoolInValue.SetBoolValue
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestSetBoolValue extends SpecExtensions {
  def `Test property field type: Set[Boolean]`() =
    checkType(
      typeOf[Set[Boolean]]
    , typeOf[SetBoolValue].member("setBool": TermName).asMethod.returnType
    )

  def `Test property default value: Set.empty[Boolean]`() {
    assert(SetBoolValue().setBool === Set.empty[Boolean])
  }
}
