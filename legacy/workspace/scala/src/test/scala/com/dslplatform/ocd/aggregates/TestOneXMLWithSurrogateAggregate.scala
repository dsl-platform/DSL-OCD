package com.dslplatform.ocd.aggregates

import OneXMLWithSurrogateInAggregate.OneXMLWithSurrogateAggregate
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestOneXMLWithSurrogateAggregate extends SpecExtensions {
  def `Test property field type: scala.xml.Elem`() =
    checkType(
      typeOf[scala.xml.Elem]
    , typeOf[OneXMLWithSurrogateAggregate].member("oneXML": TermName).asMethod.returnType
    )

  def `Test property default value: null`() {
    assert(OneXMLWithSurrogateAggregate().oneXML === null)
  }
}
