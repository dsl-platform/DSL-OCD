package com.dslplatform.ocd.values

import OptSetStringInValue.OptSetStringValue
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestOptSetStringValue extends SpecExtensions {
  def `Test property field type: Option[Set[String]]`() =
    checkType(
      typeOf[Option[Set[String]]]
    , typeOf[OptSetStringValue].member("optSetString": TermName).asMethod.returnType
    )

  def `Test property default value: None`() {
    assert(OptSetStringValue().optSetString === None)
  }
}
