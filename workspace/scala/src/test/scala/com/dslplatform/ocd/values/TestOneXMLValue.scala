package com.dslplatform.ocd.values

import OneXMLInValue.OneXMLValue
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestOneXMLValue extends SpecExtensions {
  def `Check single property type via reflection: scala.xml.Elem`() =
    checkType(
      typeOf[scala.xml.Elem]
    , typeOf[OneXMLValue].member("oneXML": TermName).asMethod.returnType
    )
}
