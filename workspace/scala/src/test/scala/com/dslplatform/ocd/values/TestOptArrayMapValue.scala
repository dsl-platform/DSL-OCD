package com.dslplatform.ocd.values

import OptArrayMapInValue.OptArrayMapValue
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestOptArrayMapValue extends SpecExtensions {
  def `Test property field type: Option[Array[Map[String, String]]]`() =
    checkType(
      typeOf[Option[Array[Map[String, String]]]]
    , typeOf[OptArrayMapValue].member("optArrayMap": TermName).asMethod.returnType
    )

  def `Test property default value: None`() {
    assert(OptArrayMapValue().optArrayMap === None)
  }
}
