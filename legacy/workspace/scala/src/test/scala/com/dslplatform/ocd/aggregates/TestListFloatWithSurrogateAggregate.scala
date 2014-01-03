package com.dslplatform.ocd.aggregates

import ListFloatWithSurrogateInAggregate.ListFloatWithSurrogateAggregate
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestListFloatWithSurrogateAggregate extends SpecExtensions {
  def `Test property field type: IndexedSeq[Float]`() =
    checkType(
      typeOf[IndexedSeq[Float]]
    , typeOf[ListFloatWithSurrogateAggregate].member("listFloat": TermName).asMethod.returnType
    )

  def `Test property default value: IndexedSeq.empty[Float]`() {
    assert(ListFloatWithSurrogateAggregate().listFloat === IndexedSeq.empty[Float])
  }
}
