package com.dslplatform.ocd.values

import ArrayOptStringInValue.ArrayOptStringValue
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestArrayOptStringValue extends SpecExtensions {
  def `Test property field type: Array[Option[String]]`() =
    checkType(
      typeOf[Array[Option[String]]]
    , typeOf[ArrayOptStringValue].member("arrayOptString": TermName).asMethod.returnType
    )

  def `Test property default value: Array.empty[Option[String]]`() {
    assert(ArrayOptStringValue().arrayOptString === Array.empty[Option[String]])
  }
}
