package com.dslplatform.ocd.values

import SetOptXMLInValue.SetOptXMLValue
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestSetOptXMLValue extends SpecExtensions {
  def `Test property field type: Set[Option[scala.xml.Elem]]`() =
    checkType(
      typeOf[Set[Option[scala.xml.Elem]]]
    , typeOf[SetOptXMLValue].member("setOptXML": TermName).asMethod.returnType
    )

  def `Test property default value: Set.empty[Option[scala.xml.Elem]]`() {
    assert(SetOptXMLValue().setOptXML === Set.empty[Option[scala.xml.Elem]])
  }
}
