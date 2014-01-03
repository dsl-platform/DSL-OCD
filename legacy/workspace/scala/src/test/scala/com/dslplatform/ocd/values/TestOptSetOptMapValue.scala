package com.dslplatform.ocd.values

import OptSetOptMapInValue.OptSetOptMapValue
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestOptSetOptMapValue extends SpecExtensions {
  def `Test property field type: Option[Set[Option[Map[String, String]]]]`() =
    checkType(
      typeOf[Option[Set[Option[Map[String, String]]]]]
    , typeOf[OptSetOptMapValue].member("optSetOptMap": TermName).asMethod.returnType
    )

  def `Test property default value: None`() {
    assert(OptSetOptMapValue().optSetOptMap === None)
  }
}
