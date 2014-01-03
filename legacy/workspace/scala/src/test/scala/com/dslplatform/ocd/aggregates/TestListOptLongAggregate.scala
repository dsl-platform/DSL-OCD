package com.dslplatform.ocd.aggregates

import ListOptLongInAggregate.ListOptLongAggregate
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestListOptLongAggregate extends SpecExtensions {
  def `Test property field type: IndexedSeq[Option[Long]]`() =
    checkType(
      typeOf[IndexedSeq[Option[Long]]]
    , typeOf[ListOptLongAggregate].member("listOptLong": TermName).asMethod.returnType
    )

  def `Test property default value: IndexedSeq.empty[Option[Long]]`() {
    assert(ListOptLongAggregate().listOptLong === IndexedSeq.empty[Option[Long]])
  }
}
