package com.dslplatform.ocd.aggregates

import OptSetXMLWithSurrogateInAggregate.OptSetXMLWithSurrogateAggregate
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestOptSetXMLWithSurrogateAggregate extends SpecExtensions {
  def `Test property field type: Option[Set[scala.xml.Elem]]`() =
    checkType(
      typeOf[Option[Set[scala.xml.Elem]]]
    , typeOf[OptSetXMLWithSurrogateAggregate].member("optSetXML": TermName).asMethod.returnType
    )

  def `Test property default value: None`() {
    assert(OptSetXMLWithSurrogateAggregate().optSetXML === None)
  }
}
