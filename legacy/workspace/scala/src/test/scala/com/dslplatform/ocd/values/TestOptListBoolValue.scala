package com.dslplatform.ocd.values

import OptListBoolInValue.OptListBoolValue
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestOptListBoolValue extends SpecExtensions {
  def `Test property field type: Option[IndexedSeq[Boolean]]`() =
    checkType(
      typeOf[Option[IndexedSeq[Boolean]]]
    , typeOf[OptListBoolValue].member("optListBool": TermName).asMethod.returnType
    )

  def `Test property default value: None`() {
    assert(OptListBoolValue().optListBool === None)
  }
}
