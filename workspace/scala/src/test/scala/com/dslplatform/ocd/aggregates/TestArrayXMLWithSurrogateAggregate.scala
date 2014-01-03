package com.dslplatform.ocd.aggregates

import ArrayXMLWithSurrogateInAggregate.ArrayXMLWithSurrogateAggregate
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestArrayXMLWithSurrogateAggregate extends SpecExtensions {
  def `Test property field type: Array[scala.xml.Elem]`() =
    checkType(
      typeOf[Array[scala.xml.Elem]]
    , typeOf[ArrayXMLWithSurrogateAggregate].member("arrayXML": TermName).asMethod.returnType
    )

  def `Test property default value: Array.empty[scala.xml.Elem]`() {
    assert(ArrayXMLWithSurrogateAggregate().arrayXML === Array.empty[scala.xml.Elem])
  }
}
