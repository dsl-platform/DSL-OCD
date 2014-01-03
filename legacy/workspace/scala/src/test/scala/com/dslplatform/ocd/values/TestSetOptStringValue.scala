package com.dslplatform.ocd.values

import SetOptStringInValue.SetOptStringValue
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestSetOptStringValue extends SpecExtensions {
  def `Test property field type: Set[Option[String]]`() =
    checkType(
      typeOf[Set[Option[String]]]
    , typeOf[SetOptStringValue].member("setOptString": TermName).asMethod.returnType
    )

  def `Test property default value: Set.empty[Option[String]]`() {
    assert(SetOptStringValue().setOptString === Set.empty[Option[String]])
  }
}
