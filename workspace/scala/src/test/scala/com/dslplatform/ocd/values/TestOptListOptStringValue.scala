package com.dslplatform.ocd.values

import OptListOptStringInValue.OptListOptStringValue
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestOptListOptStringValue extends SpecExtensions {
  def `Test property field type: Option[IndexedSeq[Option[String]]]`() =
    checkType(
      typeOf[Option[IndexedSeq[Option[String]]]]
    , typeOf[OptListOptStringValue].member("optListOptString": TermName).asMethod.returnType
    )

  def `Test property default value: None`() {
    assert(OptListOptStringValue().optListOptString === None)
  }
}
