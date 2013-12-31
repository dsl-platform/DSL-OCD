package com.dslplatform.ocd.values

import OptSetOptXMLInValue.OptSetOptXMLValue
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestOptSetOptXMLValue extends SpecExtensions {
  def `Test property field type: Option[Set[Option[scala.xml.Elem]]]`() =
    checkType(
      typeOf[Option[Set[Option[scala.xml.Elem]]]]
    , typeOf[OptSetOptXMLValue].member("optSetOptXML": TermName).asMethod.returnType
    )

  def `Test property default value: None`() {
    assert(OptSetOptXMLValue().optSetOptXML === None)
  }
}
