package com.dslplatform.ocd.aggregates

import ListStringInAggregate.ListStringAggregate
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestListStringAggregate extends SpecExtensions {
  def `Test property field type: IndexedSeq[String]`() =
    checkType(
      typeOf[IndexedSeq[String]]
    , typeOf[ListStringAggregate].member("listString": TermName).asMethod.returnType
    )

  def `Test property default value: IndexedSeq.empty[String]`() {
    assert(ListStringAggregate().listString === IndexedSeq.empty[String])
  }
}
