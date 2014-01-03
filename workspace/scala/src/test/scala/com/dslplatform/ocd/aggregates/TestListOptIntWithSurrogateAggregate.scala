package com.dslplatform.ocd.aggregates

import ListOptIntWithSurrogateInAggregate.ListOptIntWithSurrogateAggregate
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestListOptIntWithSurrogateAggregate extends SpecExtensions {
  def `Test property field type: IndexedSeq[Option[Int]]`() =
    checkType(
      typeOf[IndexedSeq[Option[Int]]]
    , typeOf[ListOptIntWithSurrogateAggregate].member("listOptInt": TermName).asMethod.returnType
    )

  def `Test property default value: IndexedSeq.empty[Option[Int]]`() {
    assert(ListOptIntWithSurrogateAggregate().listOptInt === IndexedSeq.empty[Option[Int]])
  }
}
