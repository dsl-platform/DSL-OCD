package com.dslplatform.ocd.values

import OptArrayOptStringInValue.OptArrayOptStringValue
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestOptArrayOptStringValue extends SpecExtensions {
  def `Test property field type: Option[Array[Option[String]]]`() =
    checkType(
      typeOf[Option[Array[Option[String]]]]
    , typeOf[OptArrayOptStringValue].member("optArrayOptString": TermName).asMethod.returnType
    )

  def `Test property default value: None`() {
    assert(OptArrayOptStringValue().optArrayOptString === None)
  }
}
