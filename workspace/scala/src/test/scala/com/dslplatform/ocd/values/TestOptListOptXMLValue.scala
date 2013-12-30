package com.dslplatform.ocd.values

import OptListOptXMLInValue.OptListOptXMLValue
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestOptListOptXMLValue extends SpecExtensions {
  def `Check single property type via reflection: Option[IndexedSeq[Option[scala.xml.Elem]]]`() =
    checkType(
      typeOf[Option[IndexedSeq[Option[scala.xml.Elem]]]]
    , typeOf[OptListOptXMLValue].member("optListOptXML": TermName).asMethod.returnType
    )
}
