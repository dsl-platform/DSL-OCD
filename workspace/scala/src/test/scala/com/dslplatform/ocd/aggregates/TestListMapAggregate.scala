package com.dslplatform.ocd.aggregates

import ListMapInAggregate.ListMapAggregate
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestListMapAggregate extends SpecExtensions {
  def `Test property field type: IndexedSeq[Map[String, String]]`() =
    checkType(
      typeOf[IndexedSeq[Map[String, String]]]
    , typeOf[ListMapAggregate].member("listMap": TermName).asMethod.returnType
    )

  def `Test property default value: IndexedSeq.empty[Map[String, String]]`() {
    assert(ListMapAggregate().listMap === IndexedSeq.empty[Map[String, String]])
  }
}
