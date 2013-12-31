package com.dslplatform.ocd.values

import OptArrayOptMapInValue.OptArrayOptMapValue
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestOptArrayOptMapValue extends SpecExtensions {
  def `Test property field type: Option[Array[Option[Map[String, String]]]]`() =
    checkType(
      typeOf[Option[Array[Option[Map[String, String]]]]]
    , typeOf[OptArrayOptMapValue].member("optArrayOptMap": TermName).asMethod.returnType
    )

  def `Test property default value: None`() {
    assert(OptArrayOptMapValue().optArrayOptMap === None)
  }
}
