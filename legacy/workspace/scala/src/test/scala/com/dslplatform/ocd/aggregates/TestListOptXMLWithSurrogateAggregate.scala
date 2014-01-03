package com.dslplatform.ocd.aggregates

import ListOptXMLWithSurrogateInAggregate.ListOptXMLWithSurrogateAggregate
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestListOptXMLWithSurrogateAggregate extends SpecExtensions {
  def `Test property field type: IndexedSeq[Option[scala.xml.Elem]]`() =
    checkType(
      typeOf[IndexedSeq[Option[scala.xml.Elem]]]
    , typeOf[ListOptXMLWithSurrogateAggregate].member("listOptXML": TermName).asMethod.returnType
    )

  def `Test property default value: IndexedSeq.empty[Option[scala.xml.Elem]]`() {
    assert(ListOptXMLWithSurrogateAggregate().listOptXML === IndexedSeq.empty[Option[scala.xml.Elem]])
  }
}
