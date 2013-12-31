package com.dslplatform.ocd.values

import OptArrayXMLInValue.OptArrayXMLValue
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestOptArrayXMLValue extends SpecExtensions {
  def `Test property field type: Option[Array[scala.xml.Elem]]`() =
    checkType(
      typeOf[Option[Array[scala.xml.Elem]]]
    , typeOf[OptArrayXMLValue].member("optArrayXML": TermName).asMethod.returnType
    )

  def `Test property default value: None`() {
    assert(OptArrayXMLValue().optArrayXML === None)
  }
}
