package com.dslplatform.ocd.values

import OptXMLInValue.OptXMLValue
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestOptXMLValue extends SpecExtensions {
  def `Check single property type via reflection: Option[scala.xml.Elem]`() =
    checkType(
      typeOf[Option[scala.xml.Elem]]
    , typeOf[OptXMLValue].member("optXML": TermName).asMethod.returnType
    )
}
