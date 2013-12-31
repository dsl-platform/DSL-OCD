package com.dslplatform.ocd.values

import SetOptMapInValue.SetOptMapValue
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestSetOptMapValue extends SpecExtensions {
  def `Test property field type: Set[Option[Map[String, String]]]`() =
    checkType(
      typeOf[Set[Option[Map[String, String]]]]
    , typeOf[SetOptMapValue].member("setOptMap": TermName).asMethod.returnType
    )

  def `Test property default value: Set.empty[Option[Map[String, String]]]`() {
    assert(SetOptMapValue().setOptMap === Set.empty[Option[Map[String, String]]])
  }
}
