package com.dslplatform.ocd.aggregates

import ListOptFloatWithSurrogateInAggregate.ListOptFloatWithSurrogateAggregate
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestListOptFloatWithSurrogateAggregate extends SpecExtensions {
  def `Test property field type: IndexedSeq[Option[Float]]`() =
    checkType(
      typeOf[IndexedSeq[Option[Float]]]
    , typeOf[ListOptFloatWithSurrogateAggregate].member("listOptFloat": TermName).asMethod.returnType
    )

  def `Test property default value: IndexedSeq.empty[Option[Float]]`() {
    assert(ListOptFloatWithSurrogateAggregate().listOptFloat === IndexedSeq.empty[Option[Float]])
  }
}
