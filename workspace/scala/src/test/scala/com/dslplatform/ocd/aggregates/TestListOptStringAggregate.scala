package com.dslplatform.ocd.aggregates

import ListOptStringInAggregate.ListOptStringAggregate
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestListOptStringAggregate extends SpecExtensions {
  def `Test property field type: IndexedSeq[Option[String]]`() =
    checkType(
      typeOf[IndexedSeq[Option[String]]]
    , typeOf[ListOptStringAggregate].member("listOptString": TermName).asMethod.returnType
    )

  def `Test property default value: IndexedSeq.empty[Option[String]]`() {
    assert(ListOptStringAggregate().listOptString === IndexedSeq.empty[Option[String]])
  }
}
