package com.dslplatform.ocd.values

import OptListXMLInValue.OptListXMLValue
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestOptListXMLValue extends SpecExtensions {
  def `Test property field type: Option[IndexedSeq[scala.xml.Elem]]`() =
    checkType(
      typeOf[Option[IndexedSeq[scala.xml.Elem]]]
    , typeOf[OptListXMLValue].member("optListXML": TermName).asMethod.returnType
    )

  def `Test property default value: None`() {
    assert(OptListXMLValue().optListXML === None)
  }
}
