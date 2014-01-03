package com.dslplatform.ocd.aggregates

import OptArrayOptXMLWithSurrogateInAggregate.OptArrayOptXMLWithSurrogateAggregate
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestOptArrayOptXMLWithSurrogateAggregate extends SpecExtensions {
  def `Test property field type: Option[Array[Option[scala.xml.Elem]]]`() =
    checkType(
      typeOf[Option[Array[Option[scala.xml.Elem]]]]
    , typeOf[OptArrayOptXMLWithSurrogateAggregate].member("optArrayOptXML": TermName).asMethod.returnType
    )

  def `Test property default value: None`() {
    assert(OptArrayOptXMLWithSurrogateAggregate().optArrayOptXML === None)
  }
}
