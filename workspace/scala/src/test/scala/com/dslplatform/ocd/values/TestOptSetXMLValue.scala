package com.dslplatform.ocd.values

import OptSetXMLInValue.OptSetXMLValue
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestOptSetXMLValue extends SpecExtensions {
  def `Check single property type via reflection: Option[Set[scala.xml.Elem]]`() =
    checkType(
      typeOf[Option[Set[scala.xml.Elem]]]
    , typeOf[OptSetXMLValue].member("optSetXML": TermName).asMethod.returnType
    )
}
