package com.dslplatform.ocd.aggregates

import OptListXMLWithSurrogateInAggregate.OptListXMLWithSurrogateAggregate
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestOptListXMLWithSurrogateAggregate extends SpecExtensions {
  def `Test property field type: Option[IndexedSeq[scala.xml.Elem]]`() =
    checkType(
      typeOf[Option[IndexedSeq[scala.xml.Elem]]]
    , typeOf[OptListXMLWithSurrogateAggregate].member("optListXML": TermName).asMethod.returnType
    )

  def `Test property default value: None`() {
    assert(OptListXMLWithSurrogateAggregate().optListXML === None)
  }
}
