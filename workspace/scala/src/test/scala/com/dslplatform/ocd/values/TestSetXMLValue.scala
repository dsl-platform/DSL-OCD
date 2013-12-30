package com.dslplatform.ocd.values

import SetXMLInValue.SetXMLValue
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestSetXMLValue extends SpecExtensions {
  def `Check single property type via reflection: Set[scala.xml.Elem]`() =
    checkType(
      typeOf[Set[scala.xml.Elem]]
    , typeOf[SetXMLValue].member("setXML": TermName).asMethod.returnType
    )
}
