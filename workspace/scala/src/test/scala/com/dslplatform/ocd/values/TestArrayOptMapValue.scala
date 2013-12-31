package com.dslplatform.ocd.values

import ArrayOptMapInValue.ArrayOptMapValue
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestArrayOptMapValue extends SpecExtensions {
  def `Test property field type: Array[Option[Map[String, String]]]`() =
    checkType(
      typeOf[Array[Option[Map[String, String]]]]
    , typeOf[ArrayOptMapValue].member("arrayOptMap": TermName).asMethod.returnType
    )

  def `Test property default value: Array.empty[Option[Map[String, String]]]`() {
    assert(ArrayOptMapValue().arrayOptMap === Array.empty[Option[Map[String, String]]])
  }
}
