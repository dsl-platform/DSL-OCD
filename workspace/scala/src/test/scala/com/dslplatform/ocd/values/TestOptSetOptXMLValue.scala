package com.dslplatform.ocd.values

import OptSetOptXMLInValue.OptSetOptXMLValue
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestOptSetOptXMLValue extends SpecExtensions {
  def `Check single property type via reflection: Option[Set[Option[scala.xml.Elem]]]`() =
    checkType(
      typeOf[Option[Set[Option[scala.xml.Elem]]]]
    , typeOf[OptSetOptXMLValue].member("optSetOptXML": TermName).asMethod.returnType
    )
}
