package com.dslplatform.ocd.values

import OptArrayOptBoolInValue.OptArrayOptBoolValue
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestOptArrayOptBoolValue extends SpecExtensions {
  def `Test property field type: Option[Array[Option[Boolean]]]`() =
    checkType(
      typeOf[Option[Array[Option[Boolean]]]]
    , typeOf[OptArrayOptBoolValue].member("optArrayOptBool": TermName).asMethod.returnType
    )

  def `Test property default value: None`() {
    assert(OptArrayOptBoolValue().optArrayOptBool === None)
  }
}
