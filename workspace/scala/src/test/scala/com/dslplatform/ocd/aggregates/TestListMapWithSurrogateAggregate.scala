package com.dslplatform.ocd.aggregates

import ListMapWithSurrogateInAggregate.ListMapWithSurrogateAggregate
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestListMapWithSurrogateAggregate extends SpecExtensions {
  def `Test property field type: IndexedSeq[Map[String, String]]`() =
    checkType(
      typeOf[IndexedSeq[Map[String, String]]]
    , typeOf[ListMapWithSurrogateAggregate].member("listMap": TermName).asMethod.returnType
    )

  def `Test property default value: IndexedSeq.empty[Map[String, String]]`() {
    assert(ListMapWithSurrogateAggregate().listMap === IndexedSeq.empty[Map[String, String]])
  }
}
