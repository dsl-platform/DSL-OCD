package com.dslplatform.ocd.values

import ListXMLInValue.ListXMLValue
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestListXMLValue extends SpecExtensions {
  def `Test property field type: IndexedSeq[scala.xml.Elem]`() =
    checkType(
      typeOf[IndexedSeq[scala.xml.Elem]]
    , typeOf[ListXMLValue].member("listXML": TermName).asMethod.returnType
    )

  def `Test property default value: IndexedSeq.empty[scala.xml.Elem]`() {
    assert(ListXMLValue().listXML === IndexedSeq.empty[scala.xml.Elem])
  }
}
