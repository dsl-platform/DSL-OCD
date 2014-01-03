package com.dslplatform.ocd.aggregates

import SetXMLWithSurrogateInAggregate.SetXMLWithSurrogateAggregate
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestSetXMLWithSurrogateAggregate extends SpecExtensions {
  def `Test property field type: Set[scala.xml.Elem]`() =
    checkType(
      typeOf[Set[scala.xml.Elem]]
    , typeOf[SetXMLWithSurrogateAggregate].member("setXML": TermName).asMethod.returnType
    )

  def `Test property default value: Set.empty[scala.xml.Elem]`() {
    assert(SetXMLWithSurrogateAggregate().setXML === Set.empty[scala.xml.Elem])
  }
}
