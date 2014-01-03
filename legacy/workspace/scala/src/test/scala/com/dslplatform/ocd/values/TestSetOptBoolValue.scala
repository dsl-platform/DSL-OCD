package com.dslplatform.ocd.values

import SetOptBoolInValue.SetOptBoolValue
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestSetOptBoolValue extends SpecExtensions {
  def `Test property field type: Set[Option[Boolean]]`() =
    checkType(
      typeOf[Set[Option[Boolean]]]
    , typeOf[SetOptBoolValue].member("setOptBool": TermName).asMethod.returnType
    )

  def `Test property default value: Set.empty[Option[Boolean]]`() {
    assert(SetOptBoolValue().setOptBool === Set.empty[Option[Boolean]])
  }
}
