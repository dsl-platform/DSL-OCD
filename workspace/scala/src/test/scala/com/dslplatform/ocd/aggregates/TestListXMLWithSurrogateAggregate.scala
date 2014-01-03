package com.dslplatform.ocd.aggregates

import ListXMLWithSurrogateInAggregate.ListXMLWithSurrogateAggregate
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestListXMLWithSurrogateAggregate extends SpecExtensions {
  def `Test property field type: IndexedSeq[scala.xml.Elem]`() =
    checkType(
      typeOf[IndexedSeq[scala.xml.Elem]]
    , typeOf[ListXMLWithSurrogateAggregate].member("listXML": TermName).asMethod.returnType
    )

  def `Test property default value: IndexedSeq.empty[scala.xml.Elem]`() {
    assert(ListXMLWithSurrogateAggregate().listXML === IndexedSeq.empty[scala.xml.Elem])
  }
}
