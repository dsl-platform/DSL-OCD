package com.dslplatform.ocd.aggregates

import ListStringWithSurrogateInAggregate.ListStringWithSurrogateAggregate
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestListStringWithSurrogateAggregate extends SpecExtensions {
  def `Test property field type: IndexedSeq[String]`() =
    checkType(
      typeOf[IndexedSeq[String]]
    , typeOf[ListStringWithSurrogateAggregate].member("listString": TermName).asMethod.returnType
    )

  def `Test property default value: IndexedSeq.empty[String]`() {
    assert(ListStringWithSurrogateAggregate().listString === IndexedSeq.empty[String])
  }
}
