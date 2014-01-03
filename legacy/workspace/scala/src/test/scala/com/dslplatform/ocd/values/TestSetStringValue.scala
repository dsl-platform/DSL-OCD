package com.dslplatform.ocd.values

import SetStringInValue.SetStringValue
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestSetStringValue extends SpecExtensions {
  def `Test property field type: Set[String]`() =
    checkType(
      typeOf[Set[String]]
    , typeOf[SetStringValue].member("setString": TermName).asMethod.returnType
    )

  def `Test property default value: Set.empty[String]`() {
    assert(SetStringValue().setString === Set.empty[String])
  }
}
