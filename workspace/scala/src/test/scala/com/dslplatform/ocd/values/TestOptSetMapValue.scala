package com.dslplatform.ocd.values

import OptSetMapInValue.OptSetMapValue
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestOptSetMapValue extends SpecExtensions {
  def `Test property field type: Option[Set[Map[String, String]]]`() =
    checkType(
      typeOf[Option[Set[Map[String, String]]]]
    , typeOf[OptSetMapValue].member("optSetMap": TermName).asMethod.returnType
    )

  def `Test property default value: None`() {
    assert(OptSetMapValue().optSetMap === None)
  }
}
