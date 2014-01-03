package com.dslplatform.ocd.values

import OptSetXMLInValue.OptSetXMLValue
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestOptSetXMLValue extends SpecExtensions {
  def `Test property field type: Option[Set[scala.xml.Elem]]`() =
    checkType(
      typeOf[Option[Set[scala.xml.Elem]]]
    , typeOf[OptSetXMLValue].member("optSetXML": TermName).asMethod.returnType
    )

  def `Test property default value: None`() {
    assert(OptSetXMLValue().optSetXML === None)
  }
}
