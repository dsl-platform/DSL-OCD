package com.dslplatform.ocd.values

import OptListXMLInValue.OptListXMLValue
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestOptListXMLValue extends SpecExtensions {
  def `Check single property type via reflection: Option[IndexedSeq[scala.xml.Elem]]`() =
    checkType(
      typeOf[Option[IndexedSeq[scala.xml.Elem]]]
    , typeOf[OptListXMLValue].member("optListXML": TermName).asMethod.returnType
    )
}
