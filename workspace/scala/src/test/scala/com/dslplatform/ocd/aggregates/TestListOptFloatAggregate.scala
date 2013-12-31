package com.dslplatform.ocd.aggregates

import ListOptFloatInAggregate.ListOptFloatAggregate
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestListOptFloatAggregate extends SpecExtensions {
  def `Test property field type: IndexedSeq[Option[Float]]`() =
    checkType(
      typeOf[IndexedSeq[Option[Float]]]
    , typeOf[ListOptFloatAggregate].member("listOptFloat": TermName).asMethod.returnType
    )

  def `Test property default value: IndexedSeq.empty[Option[Float]]`() {
    assert(ListOptFloatAggregate().listOptFloat === IndexedSeq.empty[Option[Float]])
  }
}
