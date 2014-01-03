package com.dslplatform.ocd.aggregates

import ListOptLongWithSurrogateInAggregate.ListOptLongWithSurrogateAggregate
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestListOptLongWithSurrogateAggregate extends SpecExtensions {
  def `Test property field type: IndexedSeq[Option[Long]]`() =
    checkType(
      typeOf[IndexedSeq[Option[Long]]]
    , typeOf[ListOptLongWithSurrogateAggregate].member("listOptLong": TermName).asMethod.returnType
    )

  def `Test property default value: IndexedSeq.empty[Option[Long]]`() {
    assert(ListOptLongWithSurrogateAggregate().listOptLong === IndexedSeq.empty[Option[Long]])
  }
}
