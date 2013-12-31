package com.dslplatform.ocd.values

import OptXMLInValue.OptXMLValue
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestOptXMLValue extends SpecExtensions {
  def `Test property field type: Option[scala.xml.Elem]`() =
    checkType(
      typeOf[Option[scala.xml.Elem]]
    , typeOf[OptXMLValue].member("optXML": TermName).asMethod.returnType
    )

  def `Test property default value: None`() {
    assert(OptXMLValue().optXML === None)
  }
}
