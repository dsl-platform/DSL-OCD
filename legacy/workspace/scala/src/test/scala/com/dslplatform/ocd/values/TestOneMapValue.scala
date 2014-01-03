package com.dslplatform.ocd.values

import OneMapInValue.OneMapValue
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestOneMapValue extends SpecExtensions {
  def `Test property field type: Map[String, String]`() =
    checkType(
      typeOf[Map[String, String]]
    , typeOf[OneMapValue].member("oneMap": TermName).asMethod.returnType
    )

  def `Test property default value: Map.empty[String, String]`() {
    assert(OneMapValue().oneMap === Map.empty[String, String])
  }
}
