package com.dslplatform.ocd.values

import ArrayXMLInValue.ArrayXMLValue
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestArrayXMLValue extends SpecExtensions {
  def `Check single property type via reflection: Array[scala.xml.Elem]`() =
    checkType(
      typeOf[Array[scala.xml.Elem]]
    , typeOf[ArrayXMLValue].member("arrayXML": TermName).asMethod.returnType
    )
}
