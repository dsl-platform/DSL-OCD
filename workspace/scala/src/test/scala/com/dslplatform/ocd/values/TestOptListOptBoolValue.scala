package com.dslplatform.ocd.values

import OptListOptBoolInValue.OptListOptBoolValue
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestOptListOptBoolValue extends SpecExtensions {
  def `Test property field type: Option[IndexedSeq[Option[Boolean]]]`() =
    checkType(
      typeOf[Option[IndexedSeq[Option[Boolean]]]]
    , typeOf[OptListOptBoolValue].member("optListOptBool": TermName).asMethod.returnType
    )

  def `Test property default value: None`() {
    assert(OptListOptBoolValue().optListOptBool === None)
  }
}
