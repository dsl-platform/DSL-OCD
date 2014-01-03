package com.dslplatform.ocd.aggregates

import OptArrayXMLWithSurrogateInAggregate.OptArrayXMLWithSurrogateAggregate
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestOptArrayXMLWithSurrogateAggregate extends SpecExtensions {
  def `Test property field type: Option[Array[scala.xml.Elem]]`() =
    checkType(
      typeOf[Option[Array[scala.xml.Elem]]]
    , typeOf[OptArrayXMLWithSurrogateAggregate].member("optArrayXML": TermName).asMethod.returnType
    )

  def `Test property default value: None`() {
    assert(OptArrayXMLWithSurrogateAggregate().optArrayXML === None)
  }
}
