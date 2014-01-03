package com.dslplatform.ocd.values

import OptSetOptBoolInValue.OptSetOptBoolValue
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestOptSetOptBoolValue extends SpecExtensions {
  def `Test property field type: Option[Set[Option[Boolean]]]`() =
    checkType(
      typeOf[Option[Set[Option[Boolean]]]]
    , typeOf[OptSetOptBoolValue].member("optSetOptBool": TermName).asMethod.returnType
    )

  def `Test property default value: None`() {
    assert(OptSetOptBoolValue().optSetOptBool === None)
  }
}
