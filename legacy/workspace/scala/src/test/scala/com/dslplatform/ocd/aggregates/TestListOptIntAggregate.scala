package com.dslplatform.ocd.aggregates

import ListOptIntInAggregate.ListOptIntAggregate
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestListOptIntAggregate extends SpecExtensions {
  def `Test property field type: IndexedSeq[Option[Int]]`() =
    checkType(
      typeOf[IndexedSeq[Option[Int]]]
    , typeOf[ListOptIntAggregate].member("listOptInt": TermName).asMethod.returnType
    )

  def `Test property default value: IndexedSeq.empty[Option[Int]]`() {
    assert(ListOptIntAggregate().listOptInt === IndexedSeq.empty[Option[Int]])
  }
}
