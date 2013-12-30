package com.dslplatform.ocd.values

import ArrayOptXMLInValue.ArrayOptXMLValue
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestArrayOptXMLValue extends SpecExtensions {
  def `Check single property type via reflection: Array[Option[scala.xml.Elem]]`() =
    checkType(
      typeOf[Array[Option[scala.xml.Elem]]]
    , typeOf[ArrayOptXMLValue].member("arrayOptXML": TermName).asMethod.returnType
    )
}
