package com.dslplatform.ocd.values

import OptArrayStringInValue.OptArrayStringValue
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestOptArrayStringValue extends SpecExtensions {
  def `Test property field type: Option[Array[String]]`() =
    checkType(
      typeOf[Option[Array[String]]]
    , typeOf[OptArrayStringValue].member("optArrayString": TermName).asMethod.returnType
    )

  def `Test property default value: None`() {
    assert(OptArrayStringValue().optArrayString === None)
  }
}
