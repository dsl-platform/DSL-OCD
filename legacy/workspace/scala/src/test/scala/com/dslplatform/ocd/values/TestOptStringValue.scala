package com.dslplatform.ocd.values

import OptStringInValue.OptStringValue
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestOptStringValue extends SpecExtensions {
  def `Test property field type: Option[String]`() =
    checkType(
      typeOf[Option[String]]
    , typeOf[OptStringValue].member("optString": TermName).asMethod.returnType
    )

  def `Test property default value: None`() {
    assert(OptStringValue().optString === None)
  }
}
