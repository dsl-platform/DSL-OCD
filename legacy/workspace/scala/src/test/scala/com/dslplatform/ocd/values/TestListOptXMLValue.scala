package com.dslplatform.ocd.values

import ListOptXMLInValue.ListOptXMLValue
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestListOptXMLValue extends SpecExtensions {
  def `Test property field type: IndexedSeq[Option[scala.xml.Elem]]`() =
    checkType(
      typeOf[IndexedSeq[Option[scala.xml.Elem]]]
    , typeOf[ListOptXMLValue].member("listOptXML": TermName).asMethod.returnType
    )

  def `Test property default value: IndexedSeq.empty[Option[scala.xml.Elem]]`() {
    assert(ListOptXMLValue().listOptXML === IndexedSeq.empty[Option[scala.xml.Elem]])
  }
}
