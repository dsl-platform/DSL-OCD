package com.dslplatform.ocd.values

import SetOptXMLInValue.SetOptXMLValue
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestSetOptXMLValue extends SpecExtensions {
  def `Check single property type via reflection: Set[Option[scala.xml.Elem]]`() =
    checkType(
      typeOf[Set[Option[scala.xml.Elem]]]
    , typeOf[SetOptXMLValue].member("setOptXML": TermName).asMethod.returnType
    )
}
