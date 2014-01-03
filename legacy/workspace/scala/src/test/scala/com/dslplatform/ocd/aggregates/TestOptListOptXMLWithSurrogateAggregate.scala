package com.dslplatform.ocd.aggregates

import OptListOptXMLWithSurrogateInAggregate.OptListOptXMLWithSurrogateAggregate
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestOptListOptXMLWithSurrogateAggregate extends SpecExtensions {
  def `Test property field type: Option[IndexedSeq[Option[scala.xml.Elem]]]`() =
    checkType(
      typeOf[Option[IndexedSeq[Option[scala.xml.Elem]]]]
    , typeOf[OptListOptXMLWithSurrogateAggregate].member("optListOptXML": TermName).asMethod.returnType
    )

  def `Test property default value: None`() {
    assert(OptListOptXMLWithSurrogateAggregate().optListOptXML === None)
  }
}
