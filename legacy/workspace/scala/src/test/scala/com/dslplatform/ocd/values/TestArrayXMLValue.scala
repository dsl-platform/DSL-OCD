package com.dslplatform.ocd.values

import ArrayXMLInValue.ArrayXMLValue
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestArrayXMLValue extends SpecExtensions {
  def `Test property field type: Array[scala.xml.Elem]`() =
    checkType(
      typeOf[Array[scala.xml.Elem]]
    , typeOf[ArrayXMLValue].member("arrayXML": TermName).asMethod.returnType
    )

  def `Test property default value: Array.empty[scala.xml.Elem]`() {
    assert(ArrayXMLValue().arrayXML === Array.empty[scala.xml.Elem])
  }
}
