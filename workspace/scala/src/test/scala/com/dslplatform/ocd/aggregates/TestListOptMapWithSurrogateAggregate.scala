package com.dslplatform.ocd.aggregates

import ListOptMapWithSurrogateInAggregate.ListOptMapWithSurrogateAggregate
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestListOptMapWithSurrogateAggregate extends SpecExtensions {
  def `Test property field type: IndexedSeq[Option[Map[String, String]]]`() =
    checkType(
      typeOf[IndexedSeq[Option[Map[String, String]]]]
    , typeOf[ListOptMapWithSurrogateAggregate].member("listOptMap": TermName).asMethod.returnType
    )

  def `Test property default value: IndexedSeq.empty[Option[Map[String, String]]]`() {
    assert(ListOptMapWithSurrogateAggregate().listOptMap === IndexedSeq.empty[Option[Map[String, String]]])
  }
}
