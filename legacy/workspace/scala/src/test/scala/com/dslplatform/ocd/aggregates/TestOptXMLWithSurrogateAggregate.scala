package com.dslplatform.ocd.aggregates

import OptXMLWithSurrogateInAggregate.OptXMLWithSurrogateAggregate
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestOptXMLWithSurrogateAggregate extends SpecExtensions {
  def `Test property field type: Option[scala.xml.Elem]`() =
    checkType(
      typeOf[Option[scala.xml.Elem]]
    , typeOf[OptXMLWithSurrogateAggregate].member("optXML": TermName).asMethod.returnType
    )

  def `Test property default value: None`() {
    assert(OptXMLWithSurrogateAggregate().optXML === None)
  }
}
