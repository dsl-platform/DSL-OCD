package com.dslplatform.ocd.aggregates

import ArrayOptXMLWithSurrogateInAggregate.ArrayOptXMLWithSurrogateAggregate
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestArrayOptXMLWithSurrogateAggregate extends SpecExtensions {
  def `Test property field type: Array[Option[scala.xml.Elem]]`() =
    checkType(
      typeOf[Array[Option[scala.xml.Elem]]]
    , typeOf[ArrayOptXMLWithSurrogateAggregate].member("arrayOptXML": TermName).asMethod.returnType
    )

  def `Test property default value: Array.empty[Option[scala.xml.Elem]]`() {
    assert(ArrayOptXMLWithSurrogateAggregate().arrayOptXML === Array.empty[Option[scala.xml.Elem]])
  }
}
