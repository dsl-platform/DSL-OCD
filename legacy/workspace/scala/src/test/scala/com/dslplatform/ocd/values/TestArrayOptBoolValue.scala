package com.dslplatform.ocd.values

import ArrayOptBoolInValue.ArrayOptBoolValue
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestArrayOptBoolValue extends SpecExtensions {
  def `Test property field type: Array[Option[Boolean]]`() =
    checkType(
      typeOf[Array[Option[Boolean]]]
    , typeOf[ArrayOptBoolValue].member("arrayOptBool": TermName).asMethod.returnType
    )

  def `Test property default value: Array.empty[Option[Boolean]]`() {
    assert(ArrayOptBoolValue().arrayOptBool === Array.empty[Option[Boolean]])
  }
}
