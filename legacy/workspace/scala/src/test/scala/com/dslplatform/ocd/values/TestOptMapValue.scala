package com.dslplatform.ocd.values

import OptMapInValue.OptMapValue
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestOptMapValue extends SpecExtensions {
  def `Test property field type: Option[Map[String, String]]`() =
    checkType(
      typeOf[Option[Map[String, String]]]
    , typeOf[OptMapValue].member("optMap": TermName).asMethod.returnType
    )

  def `Test property default value: None`() {
    assert(OptMapValue().optMap === None)
  }
}
