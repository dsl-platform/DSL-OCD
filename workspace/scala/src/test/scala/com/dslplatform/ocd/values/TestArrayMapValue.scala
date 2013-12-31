package com.dslplatform.ocd.values

import ArrayMapInValue.ArrayMapValue
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestArrayMapValue extends SpecExtensions {
  def `Test property field type: Array[Map[String, String]]`() =
    checkType(
      typeOf[Array[Map[String, String]]]
    , typeOf[ArrayMapValue].member("arrayMap": TermName).asMethod.returnType
    )

  def `Test property default value: Array.empty[Map[String, String]]`() {
    assert(ArrayMapValue().arrayMap === Array.empty[Map[String, String]])
  }
}
