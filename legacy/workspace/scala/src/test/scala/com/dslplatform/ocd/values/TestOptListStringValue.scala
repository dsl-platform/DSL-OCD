package com.dslplatform.ocd.values

import OptListStringInValue.OptListStringValue
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestOptListStringValue extends SpecExtensions {
  def `Test property field type: Option[IndexedSeq[String]]`() =
    checkType(
      typeOf[Option[IndexedSeq[String]]]
    , typeOf[OptListStringValue].member("optListString": TermName).asMethod.returnType
    )

  def `Test property default value: None`() {
    assert(OptListStringValue().optListString === None)
  }
}
