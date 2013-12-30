package com.dslplatform.ocd.values

import OptArrayOptXMLInValue.OptArrayOptXMLValue
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestOptArrayOptXMLValue extends SpecExtensions {
  def `Check single property type via reflection: Option[Array[Option[scala.xml.Elem]]]`() =
    checkType(
      typeOf[Option[Array[Option[scala.xml.Elem]]]]
    , typeOf[OptArrayOptXMLValue].member("optArrayOptXML": TermName).asMethod.returnType
    )
}
