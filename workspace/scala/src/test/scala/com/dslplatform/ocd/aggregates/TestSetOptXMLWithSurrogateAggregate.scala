package com.dslplatform.ocd.aggregates

import SetOptXMLWithSurrogateInAggregate.SetOptXMLWithSurrogateAggregate
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestSetOptXMLWithSurrogateAggregate extends SpecExtensions {
  def `Test property field type: Set[Option[scala.xml.Elem]]`() =
    checkType(
      typeOf[Set[Option[scala.xml.Elem]]]
    , typeOf[SetOptXMLWithSurrogateAggregate].member("setOptXML": TermName).asMethod.returnType
    )

  def `Test property default value: Set.empty[Option[scala.xml.Elem]]`() {
    assert(SetOptXMLWithSurrogateAggregate().setOptXML === Set.empty[Option[scala.xml.Elem]])
  }
}
