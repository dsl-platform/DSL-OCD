package com.dslplatform.ocd.values

import ListXMLInValue.ListXMLValue
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestListXMLValue extends SpecExtensions {
  def `Check single property type via reflection: IndexedSeq[scala.xml.Elem]`() =
    checkType(
      typeOf[IndexedSeq[scala.xml.Elem]]
    , typeOf[ListXMLValue].member("listXML": TermName).asMethod.returnType
    )
}
