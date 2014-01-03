package com.dslplatform.ocd.aggregates

import ListOptStringWithSurrogateInAggregate.ListOptStringWithSurrogateAggregate
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestListOptStringWithSurrogateAggregate extends SpecExtensions {
  def `Test property field type: IndexedSeq[Option[String]]`() =
    checkType(
      typeOf[IndexedSeq[Option[String]]]
    , typeOf[ListOptStringWithSurrogateAggregate].member("listOptString": TermName).asMethod.returnType
    )

  def `Test property default value: IndexedSeq.empty[Option[String]]`() {
    assert(ListOptStringWithSurrogateAggregate().listOptString === IndexedSeq.empty[Option[String]])
  }
}
