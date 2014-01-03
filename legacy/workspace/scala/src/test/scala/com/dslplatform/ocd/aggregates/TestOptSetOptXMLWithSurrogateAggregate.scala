package com.dslplatform.ocd.aggregates

import OptSetOptXMLWithSurrogateInAggregate.OptSetOptXMLWithSurrogateAggregate
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestOptSetOptXMLWithSurrogateAggregate extends SpecExtensions {
  def `Test property field type: Option[Set[Option[scala.xml.Elem]]]`() =
    checkType(
      typeOf[Option[Set[Option[scala.xml.Elem]]]]
    , typeOf[OptSetOptXMLWithSurrogateAggregate].member("optSetOptXML": TermName).asMethod.returnType
    )

  def `Test property default value: None`() {
    assert(OptSetOptXMLWithSurrogateAggregate().optSetOptXML === None)
  }
}
